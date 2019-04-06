/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.gitlab.datasourcepack;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

/**
 *
 * @author Bishoy
 */
public class DataSourceFactory {

    public static DataSource getMySQLDataSource() {
        new PropertiesFile();
        Properties prop = new Properties();
        FileInputStream fileStream = null;
        MysqlDataSource mySQLDataSource = null;
        try {
            fileStream = new FileInputStream("database.properties");
            prop.load(fileStream);
            mySQLDataSource = new MysqlDataSource();
            mySQLDataSource.setURL(prop.getProperty("MYSQL_URL"));
            mySQLDataSource.setUser(prop.getProperty("MYSQL_USERNAME"));
            mySQLDataSource.setPassword(prop.getProperty("MYSQL_PASSWORD"));

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return mySQLDataSource;
    }

}
