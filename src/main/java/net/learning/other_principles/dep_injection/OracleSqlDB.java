package net.learning.other_principles.dep_injection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaioanei on 2/3/2017.
 */
public class OracleSqlDB implements SqlDB {

    private List<String> content;

    public OracleSqlDB(){
        content= new ArrayList<String>();
    }
}
