package com.lits.helper;

import java.io.IOException;
import java.util.Properties;

public class EnvProps {

    public EnvProps() {

        Properties properties = new Properties();


        try
        {
            properties.load(getClass().getResourceAsStream("env.properties"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
