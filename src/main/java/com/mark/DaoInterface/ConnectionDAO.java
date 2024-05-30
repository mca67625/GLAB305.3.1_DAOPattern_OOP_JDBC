package com.mark.DaoInterface;

/*
    In this class we would provide connection parameters like database JDBC URL, username and password as final
    variables, provide a method to return a Connection object or null if it failed to connect, or it may be better throw
    a runtime exception in that case
 */

import java.sql.*;

public class ConnectionDAO {
    static Connection con = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;

    public static Connection getConnection() throws ClassNotFoundException{

        final String DBURL = "jdbc:mysql://localhost:3306/library";
        final String DBUSERNAME = "***";
        final String DBPASSWORD = "***";
        try{
            con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
            System.out.println("Connected to database successfully");
        }catch (SQLException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }

    public void disconnect() {
        try{
                if(rs != null){
                rs.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(con != null){
                    con.close();
                }
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
