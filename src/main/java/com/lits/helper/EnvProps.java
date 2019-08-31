package com.lits.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvProps {

    Properties properties;

    public EnvProps() {

        properties = new Properties();


        try
        {
            properties.load(new FileInputStream(new File("src/main/resources/env.properties")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getWebSiteUrl() {
       return properties.getProperty("env.website.url");
    }

    public String getApiCurrencyRateForCurrentDate() {
        return properties.getProperty("env.api.currencies.rate.current");
    }

    public String getApiCurrencyRateForDate() {
        return properties.getProperty("env.api.currencies.rate.fordate");
    }
}
