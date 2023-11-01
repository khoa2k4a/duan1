/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.text.SimpleDateFormat;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String date = "07/10/2004";
        String pattern = "dd/MM/yy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date2 = (Date) dateFormat.parse(date);
            
            System.out.println(date2);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
