/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {
      public static void main(String[] args) {
        try {
  
            Connection conn = DriverManager.getConnection(JdbcHelper.url);
            
            if (conn != null) {
                System.out.println("Kết nối đến cơ sở dữ liệu thành công.");
                conn.close(); 
            } else {
                System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi kết nối đến cơ sở dữ liệu: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
