package com.se.day8;

/**
 * @projectname: learn
 * @packname: com.se.day8
 * @classname: VarArrayImp1
 * @author: gyg
 * @date: 2022/7/18 下午 12:57
 * @version: 1.0
 * @description: TODO
 */

public class VarArrayImp1 implements VarArray{
    private int[] container;
    private int count;

    public VarArrayImp1(){
        container=new int[MAX];
        count=0;
    }

    @Override
    public boolean add(int data){
        if(count>=container.length){
            int [] addArray = new int[container.length+MAX];
            System.arraycopy(container,0,addArray,0,container.length);
            container=addArray;
            addArray=null;
        }
        container[count++]=data;
        return true;
    }

    @Override
    public int find(int data){
        for(int i=0;i<count;i++){
            if(container[i]==data){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int find(int data,int start,int end){
        if(start<0||end>count-1||start>end){
            return -1;
        }
        for (int i=start;i<=end;i++){
            if(container[i]==data)
                return i;
        }
        return -1;
    }

    @Override
    public boolean remove(int data){//删除所有data元素 并且前移元素
        boolean flag=false;
        for(int i=0;i<count;i++){
            if(container[i]==data){
                for(int j=i+1;j<count;j++){
                    container[j-1]=container[j];
                }
                flag=true;
                count--;
            }
        }
        return flag;
    }
    @Override
    public boolean update(int oldData,int newData){//更新所有data元素
        boolean flag=false;
        for (int i=0;i<count;i++){
            if(container[i]==oldData){
                container[i]=newData;
                flag=true;
            }
        }
        return flag;
    }
    @Override
    public int size(){
        return count;
    }

    @Override
    public void clear() {
        count=0;
    }

    @Override
    public void printData(){
        for (int i=0;i<count;i++){
            System.out.print(container[i]+" ");
        }
        System.out.println();
    }

}

