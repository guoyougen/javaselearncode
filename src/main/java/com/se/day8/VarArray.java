package com.se.day8;

public interface VarArray {
    int MAX=100;
    boolean add(int data);
    boolean remove(int data);
    int find(int data);
    int find(int data,int start, int end);
    boolean update(int oldData,int newData);
    int size();
    void clear();
    void printData();
}
