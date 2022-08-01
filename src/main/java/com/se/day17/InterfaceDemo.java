package com.se.day17;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: InterfaceDemo
 * @author: gyg
 * @date: 2022/8/2 上午 1:03
 * @version: 1.0
 * @description:
 */

public class InterfaceDemo {
    public static void main(String[] args){
      //
        IA a = new IAImpl();
        a.ma();
    }
    interface IA{
        void ma();
        default void default_ma(){
            System.out.printf("moren\n");
        }


    }
    static class IAImpl implements IA {
        @Override
        public void ma() {
            System.out.printf("moren beidiaoyong\n");
            default_ma();
        }

    }

}
