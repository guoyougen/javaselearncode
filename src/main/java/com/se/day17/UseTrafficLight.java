package com.se.day17;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: UseTrafficLight
 * @author: gyg
 * @date: 2022/8/1 下午 5:05
 * @version: 1.0
 * @description:
 */

public class UseTrafficLight {
    public static void main(String[] args) throws InterruptedException {
      //
        TrafficLight[] lights = TrafficLight.values();
        for(TrafficLight light : lights){
            if(light.equals(TrafficLight.YELLOW)){
            light.setDuration(3);
            }else {
                light.setDuration((int)(Math.random() * 30)+10);
            }

        }
        TrafficLight temp=TrafficLight.RED;
        while(true){
            for(int i=temp.getDuration(); i>0;i--){
                System.out.printf("%s  %d\n",temp,i);
                Thread.sleep(100);
            }
            temp=temp.next();
        }
    }
}
