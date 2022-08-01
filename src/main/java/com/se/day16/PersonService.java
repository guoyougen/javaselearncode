package com.se.day16;

/**
 * @projectname: learn
 * @packname: com.se.day16
 * @classname: PersonService
 * @author: gyg
 * @date: 2022/8/1 上午 12:16
 * @version: 1.0
 * @description:
 */

public class PersonService {
    private BinarySearchTree<Person> persons;

    public PersonService() {
        this.persons = new BinarySearchTree<>();
    }

    public void save(Person b) {
        persons.add(b);
    }

    public void printAllPersons() {
        persons.midOrder();
        System.out.println();
    }

    public void delete(Person b) {
        persons.remove(b);
    }
}
