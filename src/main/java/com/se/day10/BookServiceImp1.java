package com.se.day10;

/**
 * @projectname: learn
 * @packname: com.se.day10
 * @classname: BookServiceImp1
 * @author: gyg
 * @date: 2022/7/20 下午 1:29
 * @version: 1.0
 * @description: TODO
 */

public class BookServiceImp1 implements IBookService{
    private Book[] container;
    private int count;
    public BookServiceImp1(){
        container=new Book[MAX];
        count=0;
    }
    @Override
    public void addBook(Book b) {
        if(count>=container.length){
            Book[] addBookArray= new Book[container.length+MAX];
            System.arraycopy(container,0,addBookArray,0,container.length);
            container=addBookArray;
            addBookArray=null;
        }
        container[count++]=b;
        System.out.println("添加成功");
    }

    @Override
    public void deleteByIsbn(String isbn) {
        boolean flag=false;
        for (int i =0;i<count;i++){
            if(container[i].getIsbn()==isbn){
                for (int j=i+1;j<count;j++){
                    container[j-1]=container[j];
                }
                flag=true;
                count--;
                break;
            }
        }
        if(flag)
            System.out.println("删除好了");
        else
            System.out.println("没找到");
    }

    @Override
    public void deleteByAuthor(String author) {
        boolean flag=false;
        for (int i=0;i<count;i++){
            if(container[i].getBookauthor()==author){
                for (int j=i+1;j<count;j++){
                    container[j-1]=container[j];
                }
                flag=true;
                count--;
                break;
            }
        }
        if(flag)
            System.out.println("删除好了");
        else
            System.out.println("没找到");
    }

    @Override
    public void updateBook(Book b) {
        boolean flag=false;
        for (int i=0;i<count;i++){
            if(container[i].getId()==b.getId()){
                container[i]=b;
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("更新好了");
        else
            System.out.println("没找到");
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        count=0;
        System.out.println("清空好了");
    }

    @Override
    public Book selectByIsbn(String isbn) {
        for (int i=0;i<count;i++){
            if(container[i].getIsbn()==isbn){
                System.out.println("找到了");
                return container[i];
            }
        }
        System.out.println("没找到");
        return null;
    }

    @Override
    public Book[] getAllBooks() {
        Book[] bookNew=new Book[count];
        System.arraycopy(container,0,bookNew,0,container.length);
        return bookNew;
    }

    public void printAllBooks(){
        for (int i=0;i<count;i++){
            System.out.println(container[i]);
        }

    }
}
