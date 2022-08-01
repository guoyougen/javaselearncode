package com.se.day14;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: RandomAccessFile
 * @author: gyg
 * @date: 2022/7/27 下午 9:27
 * @version: 1.0
 * @description: TODO
 */

public class UseRandomAccessFile {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String iodemo_DATA="ioDemo_data/randomisation.txt";
        String enline=readLastLine(iodemo_DATA);
        enline=new String(enline.getBytes("ISO-8859-1"),"UTF-8");
        System.out.print(enline);
    }
    public static String readLastLine(String path){
        try(RandomAccessFile raf=new RandomAccessFile(path,"rw")){
            String endLine="";
            long pos=raf.length();
            if (pos==0)
                return endLine;
            while (true){
                raf.seek(--pos);
                if(pos==0||raf.read()=='\n') {//pos==0必须在前面
                    endLine = raf.readLine();
                    if(endLine==null)
                        return "";
                    break;
                }
            }
            return endLine;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
