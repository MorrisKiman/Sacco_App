package com.example.loca_sacco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.loca_sacco.DB_Setup.DB_Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Spinner spinner;
    Button button;
    EditText uName, pssWd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing my view
        spinner = findViewById(R.id.LGspinner);
        //populate our spinner
        ArrayAdapter <CharSequence> users = ArrayAdapter.createFromResource(this, R.array.systemUsers, R.layout.support_simple_spinner_dropdown_item);
        users.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(users);
        //the spinner is populated

        uName = findViewById(R.id.ETusName);
        pssWd = findViewById(R.id.ETpassword);

        //deal with the button
        button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String userName = String.valueOf(uName);
                final String passwords = String.valueOf(pssWd);

                loginMt(userName, passwords);
            }
        });
        //button delt with

        //let the action begin

    }//end of onCreate

    //login method
    protected int loginMt(String userName, String passwd){
        int ret = 0;

        String sql = null;

        int user = 0;

        switch (user){
            case 1:
                sql = "Select * from boss where UserName=? and Password=?";
                break;

            case 2:
                sql = "Select * from attendant where AttendantID=? and AttendantPass=?";
                break;

            case 3:
                sql = "Select * from teller where TellerID=? and TellerPass=?";
                break;

                default:
                    sql = "Select * from teller where TellerID=? and TellerPass=?";
                    break;

        }//end of the switch

        System.out.println("the query is ===> " + sql);

        try{
            Connection conn = DB_Connector.getConnection();
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, userName);
            stat.setString(2, passwd);

            ResultSet rs = stat.executeQuery();

        } catch (SQLException ex){
            System.out.println(ex);
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();

        }


        return ret;
    }//end of the method

    @Override
    public void onClick(View v) {

    }
}//end of class
