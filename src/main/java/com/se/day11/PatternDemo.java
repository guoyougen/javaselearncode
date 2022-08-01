package com.se.day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @projectname: learn
 * @packname: com.se.day11
 * @classname: PatternDemo
 * @author: gyg
 * @date: 2022/7/22 下午 2:09
 * @version: 1.0
 * @description: TODO
 */

public class PatternDemo {
    public String wordRegex = "\\w+\'*\\w*";//添加了' 可以评别it's 这种单词
    //此方法用来统计 content 中的英文单词个数， 请使用正则表达式来做，单词的正则表达式请自行编写，
    public int countWords(CharSequence content) {
        int countWords=0;
        Pattern p = Pattern.compile(wordRegex);
        Matcher m = p.matcher(content);
        while (m.find()){
            countWords++;
        }
        return countWords;
    }
    //此方法返回一串固定的字符串，已写好，可以直接用。
    public StringBuilder getContent() {
        //此方法的内容如下：
        StringBuilder builder = new StringBuilder();
        builder.append("Hooray! It's snowing! It's time to make a snowman.James runs out.He makes a big pile of snow. He puts a big snowball on top. He adds a scarf and a hat. He adds an orange for the nose. He adds coal for the eyes and buttons.In the evening, James opens the door. What does he see? The snowman is moving! James invites him in. The snowman has never been inside a house. He says hello to the cat. He plays with paper towels.A moment later, the snowman takes James's hand and goes out.They go up, up, up into the air! They are flying! What a wonderful night!The next morning, James jumps out of bed. He runs to the door.He wants to thank the snowman. But he's gone.");
        return builder;
    }
    //此方法统计出每个单词[不考虑大小写]出现的次数，数据结构请自行定义,设计如下：
    public WordBean[] countSize(CharSequence content) {
        int countWords=0;//不重复单词个数
        int length=this.countWords(content);//最长情况的长度
        WordBean [] w=new WordBean[length];
        for (int i=0;i<length;i++){//初始化
            w[i]=new WordBean();
        }
        Pattern p = Pattern.compile(wordRegex);
        Matcher m = p.matcher(content);
        boolean flag=false;
        while (m.find()){
            flag=false;
            for (int i = 0;i<countWords;i++){
                if(w[i].wordMeaningStringEqual(m.group())){//是否有重复单词
                    flag=true;
                    w[i].addCount();//自增+1
                    break;
                }
            }
           if(!flag){
                w[countWords].setWord(m.group());
                w[countWords].setCount(1);
                countWords++;
            }
        }
        WordBean[] wReal = new WordBean[countWords];
        System.arraycopy(w,0,wReal,0,countWords);
        w=null;
        return wReal;
    }

}
