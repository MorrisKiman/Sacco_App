package com.example.loca_sacco.DB_Setup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.mysql.jdbc.*;

public class DB_Connector {
    //public static final String DRIVER="jdbc:mysql://localhost/sacco";//jdbc:mysql://localhost/dbName
    public static String dbDriver = "com.mysql.jdbc.Driver";
    public static String DRIVER = "jdbc:mysql://192.168.43.94/sacco";
    public static final String USER_NAME="root";
    public static final String PASSWORD="morris";

    static Connection kon;

    public static Connection getConnection(){
        try{
            Class.forName(dbDriver).newInstance();
            kon = DriverManager.getConnection(DRIVER, USER_NAME, PASSWORD);
        }catch(SQLException ex){
            System.out.println(ex);
            Logger.getLogger(DB_Connector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connector.class.getName()).log(Level.SEVERE, null, ex);
        }//end of try catch block
        catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        System.out.println("Ststus of connection is ===> "+kon);
        return kon;

    }//end of the method




}//'end of class
