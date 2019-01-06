package net.learning.design_patterns.prototype;

import java.util.List;

/**
 * created by: andrei
 * date: 19.11.2018
 **/

/*
    Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern
     comes under creational pattern as this pattern provides one of the best ways to create an object.

    This pattern involves implementing a prototype interface which tells to create a clone of the current object.
    This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }

}