/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.gitlab.datasourcepack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Bishoy
 */
public class PropertiesFile {

    public PropertiesFile() {
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("database.properties");
            prop.setProperty("MYSQL_URL", "jdbc:mysql://localhost:3306/sakila");
            prop.setProperty("MYSQL_USERNAME", "root");
            prop.setProperty("MYSQL_PASSWORD", "Bishoy1404");
            prop.store(output, null);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
