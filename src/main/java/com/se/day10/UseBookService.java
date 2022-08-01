package com.se.day10;

/**
 * @projectname: learn
 * @packname: com.se.day10
 * @classname: UseBookServices
 * @author: gyg
 * @date: 2022/7/20 下午 4:06
 * @version: 1.0
 * @description: TODO
 */

public class UseBookService{
    public static void main(String[] args) {
        Book b1 = new Book("书1","作者1","aaa111");
        Book b2 = new Book("书2","作者2","bbb222");
        Book b3 = new Book("书3","作者3","ccc333");
        BookServiceImp1 bsi = new BookServiceImp1();
        System.out.println("添加3本书");
        bsi.addBook(b1);
        bsi.addBook(b2);
        bsi.addBook(b3);
        bsi.printAllBooks();
        System.out.println("通过ISBN=aaa111删书");
        bsi.deleteByIsbn("aaa111");
        bsi.printAllBooks();
        System.out.println("通过作者=作者2删书");
        bsi.deleteByAuthor("作者2");
        bsi.printAllBooks();
        System.out.println("更新书3的信息");
        b3.setBookname("书3更新");
        bsi.updateBook(b3);
        bsi.printAllBooks();
        System.out.println("输出所有图书的数量   "+bsi.size());
        System.out.println("通过ISBN=ccc333找书");
        System.out.println(bsi.selectByIsbn("ccc333"));
        System.out.println("通过返回包含所有图书的数组 来获取整个数组长度   "+bsi.getAllBooks().length);
        bsi.clear();
        bsi.printAllBooks();
    }
}
