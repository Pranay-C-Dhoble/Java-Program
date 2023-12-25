package javaprojects.newjavaproject;

import javaprojects.newjavaproject.model.User;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public static List<User> users = new ArrayList<>();

    public static String getValue(String[] args, String key) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals(key)) {
                return args[i + 1];
            }
        }
        return null;
    }

}

//here getvalue is utility method
//here we are using regular expression




//static -- share among to all the objects

//Singulton class --> only one object can be created

// which class in java is singleton class --> Calendar class --> getInstance() --> return object of Calendar class

//regular expression