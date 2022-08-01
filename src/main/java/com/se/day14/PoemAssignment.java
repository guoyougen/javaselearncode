package com.se.day14;

import java.io.*;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: PoemAssignment
 * @author: gyg
 * @date: 2022/7/27 下午 11:59
 * @version: 1.0
 * @description: TODO
 */

public class PoemAssignment {
    private static char[][] poem = new char[6][6];

    public static void main(String[] args) {
        String path="ioDemo_data/dufu.txt";
        poemVertical(path);
    }
    /******
     * @param path 表示古诗的路径
     */
    public static void poemVertical(String path){
        try(BufferedReader br=new BufferedReader(new FileReader(path));
            PrintWriter pw=new PrintWriter(new FileWriter("ioDemo_data/dufu_Vertical.txt"),true)){
            int count=0;
            String line=null;
            while ((line=br.readLine())!=null){
                if(line.trim().length()>0){
                    if(count==0||count==1)
                        line=line+"  ";
                    poem[count++] = line.toCharArray();//传入二维数组
                }
            }
            char temp;
            for(int i=0;i<count;i++){//倒置
                for(int j=0;j<=i;j++){
                    temp=poem[i][j];
                    poem[i][j]=poem[j][i];
                    poem[j][i]=temp;
                }
            }
            for (int i =0;i<count;i++) {
                line=new String(poem[i]);
                pw.println(line);//写入文件
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
