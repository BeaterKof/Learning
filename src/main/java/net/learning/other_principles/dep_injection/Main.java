package net.learning.other_principles.dep_injection;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Main {

    public static void main(String[] args){

        MySqlDB mySqlDB = new MySqlDB();
        Backend bk = new Backend(mySqlDB);

    }
}
