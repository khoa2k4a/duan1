/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;


/**
 *
 * @author admin
 */
public class DbConnect {

    public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DBNAME = "POLYCLOTHES";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "13092004";

    /**
     * Get connection to MSSQL Server
     *
     * @return Connection
     */
    public static Connection getConnection() {

// Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME + ";encrypt=true;trustservercertificate=true";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public static PreparedStatement getStmt(String sql, Object[] args) throws SQLException{
        Connection con = getConnection();
        PreparedStatement stmt;
        if(sql.trim().startsWith("{")){
            stmt = con.prepareCall(sql);
        }else{
            stmt = con.prepareStatement(sql);
        }
        for(int i=0; i < args.length; i++){
            stmt.setObject(i+1, args[i]);
        }
        return stmt;
    }
    public static ResultSet query(String sql, Object[] args) throws SQLException{
        PreparedStatement stmt = getStmt(sql, args);
        return stmt.executeQuery();
    }
    public static Object value(String sql, Object[] args){
        try {
            ResultSet rs = query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static int update(String sql, Object[] args){
        try {
            PreparedStatement stmt = getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
