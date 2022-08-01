package com.se.day14;

import java.io.*;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: IDGenerator
 * @author: gyg
 * @date: 2022/7/27 下午 1:14
 * @version: 1.0
 * @description: TODO
 */

public class IDGenerator {
    private static final String ID_FILE="C:\\Users\\asd\\IdeaProjects\\learn\\src\\id_data\\id.dat";
    private static final long DEFAULT_VALUE=1L;
    /**
     *从文件中读取ID值 从1L开始依次增长
     * @return long
     */
    public static long getID(){
        long id=-1L;
        File file=new File(ID_FILE);
        try {
            if(!file.exists()){
                file.createNewFile();
                write(DEFAULT_VALUE+1);
                return DEFAULT_VALUE;
                }
            else {
                id=read();
                write(id+1);
                return id;
            }
        }catch (IOException e){
            e.printStackTrace();
            return -1;
        }
    }
    private static long read()throws IOException{
        long id=-1;
        try (DataInputStream dis=new DataInputStream(new FileInputStream(ID_FILE))){
            id=dis.readLong();
        }
        return id;
    }
    public static void write(long l)throws IOException{
        try (DataOutputStream dos=new DataOutputStream(new FileOutputStream(ID_FILE))){
            dos.writeLong(l);
        }
    }
}
