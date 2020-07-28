/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    
    private static Connection MysqlConfig;
    
    public static Connection configDb() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/rental";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MysqlConfig = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            System.out.println("Koneksi ke DB Gagal "+e.getMessage());
        }        
        return MysqlConfig;        
    }
    
}
