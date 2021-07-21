package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //#1 Create properties object
    private static Properties properties = new Properties();

    //we need to create a static block, bc of 2 reasons
    //we need to be able to write in it
    //static block runs before anything else

    static {

        try {
            //#2 Load the file into FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3 Load this properties object with the file(configuration.properties)
            properties.load(file);

            //close the file -> bc we dont need to keep it open in our java memory
            file.close();

        } catch (IOException e) {//we changed the previous value before e with IOException
            // e.printStackTrace(); we dont this one from the console
            //instead we gonna write our own mess
            System.out.println("File not found in Configuration Properties.");
        }
    }

    //USE THE ABOVE CREATED LOGIC TO CREATE A RE-USABLE STATIC METHOD
    //how we cna re-use the object properties
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);

    }
}
