package com.se.day11;

/**
 * @projectname: learn
 * @packname: com.se.day11
 * @classname: WordBean
 * @author: gyg
 * @date: 2022/7/22 下午 2:17
 * @version: 1.0
 * @description: TODO
 */

public class WordBean {
    private String word;
    private int count;

    public WordBean(String word,int count) {
        this.word = word;
        this.count=count;
    }
    public WordBean() {
    }

    @Override
    public String toString() {
        return "WordBean{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }

    public Boolean wordMeaningStringEqual(String s){//通过全部转小写辩别word是否含义一样
        if(s==null||this.word==null)
            return false;
        String a=this.word.toLowerCase();
        String b=s.toLowerCase();
        if(a.equals(b))
            return true;
        else
            return false;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void addCount(){//自增+1
        this.count++;
    }
    public void addCount(int n){
        this.count+=n;
    }
}
