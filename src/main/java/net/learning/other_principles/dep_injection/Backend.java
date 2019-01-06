package net.learning.other_principles.dep_injection;

/**
 * Created by aaioanei on 2/3/2017.
 */
public class Backend {

    private SqlDB db;

    public Backend(){

    }

    public Backend(SqlDB db){
        this.db = db;
    }
}
