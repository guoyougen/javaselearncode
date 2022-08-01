package com.se.day14;

import java.io.*;

/**
 * @projectname: learn
 * @packname: com.se.day14
 * @classname: ObjectPersistUtil
 * @author: gyg
 * @date: 2022/7/27 下午 2:27
 * @version: 1.0
 * @description: TODO
 */

public class ObjectPersistUtil {
        private static final String DATA_FILE="C:\\Users\\asd\\IdeaProjects\\learn\\src\\id_data\\student.dat";

        public static int persist(Object instance){
            try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(DATA_FILE))){
                oos.writeObject(instance);
                return 1;
            }catch (IOException e){
                e.printStackTrace();
            }
            return -1;
        }
        public static Student read(){

            Student stu = null;
            File file = new File(DATA_FILE);
            if(!file.exists()){
                System.out.println("没有持久化文件");
                return stu;
            }

            try(ObjectInputStream ois=
            new ObjectInputStream(new FileInputStream(file))){
                stu=(Student) ois.readObject();
            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
            return stu;
        }
}
