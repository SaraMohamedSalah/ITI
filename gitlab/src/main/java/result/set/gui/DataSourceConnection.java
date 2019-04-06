/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result.set.gui;


import com.iti.gitlab.datasourcepack.DataSourceFactory;
import java.sql.*;
import javax.sql.*;

/**
 *
 * @author Bishoy
 */
public class DataSourceConnection {
    ResultSet resultSet;
    
    public DataSourceConnection(){
        DataSource dataSource = DataSourceFactory.getMySQLDataSource();
        Connection connection = null;
        Statement statement = null;
        
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "SELECT * from actor";
            resultSet = statement.executeQuery(query);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}