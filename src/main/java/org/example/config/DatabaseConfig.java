package org.example.config;

public class DatabaseConfig {

    static ConfigLoader config = new ConfigLoader();
    public static final String URL = config.getProperty("db.url");
    public static final String USER = config.getProperty("db.username");
    public static final String PASSWORD = config.getProperty("db.password");
}
