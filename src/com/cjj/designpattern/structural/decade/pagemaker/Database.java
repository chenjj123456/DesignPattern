package com.cjj.designpattern.structural.decade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by chenjj on 2018/12/28
 */
public class Database {
    private Database(){}
    public static Properties getProperties(String dbname){
        String filename=dbname+".txt";
        Properties prop=new Properties();
        try{
            prop.load(new FileInputStream(filename));
        }catch (IOException e){
            System.out.println("Warning:"+filename+"is not found");
        }
        return prop;
    }
}
