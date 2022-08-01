package com.se.day16;

/**
 * @projectname: learn
 * @packname: com.se.day16
 * @classname: UsePersonService
 * @author: gyg
 * @date: 2022/8/1 上午 12:25
 * @version: 1.0
 * @description:
 */

public class UsePersonService {
    public static void main(String[] args) {
        System.out.println("UsePersonService");
        String personName = "测试";
        Person p1 = new Person("姜琪", 18, '女', "13890093534", "山东省枣庄市薛城区花滩林场");
        Person p2 = new Person("马鑫鹏", 23, '男', "15391443655", "浙江省温州市瑞安市鱼儿山镇");
        Person p3 = new Person("郭思源", 22, '男', "14502497684", "湖北省咸宁市嘉鱼县武篆镇");
        Person p4 = new Person("姜鹤轩", 17, '男', "14870073444", "辽宁省阜新市太平区刘八里乡");
        Person p5 = new Person("莫思", 19, '女', "17755496007", "北京市市辖区房山区龙城街道");
        Person p6 = new Person("张皓轩", 17, '男', "19997111041", "浙江省杭州市桐庐县东侯坊乡");
        Person p7 = new Person("邹文博", 22, '男', "17181185904", "北京市市辖区海淀区中堡镇");
        Person p8 = new Person("朱峻熙", 22, '男', "14904160848", "西藏自治区林芝市工布江达县南窖乡");
        PersonService ps = new PersonService();
        ps.save(p1);
        ps.save(p2);
        ps.save(p3);
        ps.save(p4);
        ps.save(p5);
        ps.save(p6);
        ps.save(p7);
        ps.save(p8);
        ps.printAllPersons();
        ps.delete(p1);
        System.out.println();
        ps.printAllPersons();
    }
}
