package com.example.citizen;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;

//import android.database.Cursor;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginDetectiveActivity extends AppCompatActivity {
    //SQLiteDatabase db;
    Button logindet;
    EditText deti,pwddet;
    String pwd="123456";//dummy password
    String detid="iamrac";//dummy id
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_detective);

        deti=(EditText)findViewById(R.id.detid);
        pwddet=(EditText)findViewById(R.id.detpwd);
        logindet=(Button)findViewById(R.id.login);

        //db = openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
        //Cursor c=db.rawQuery("SELECT (password column name) FROM student WHERE id='"+id.getText()+"'", null);
        //pwd=c.getString();

        logindet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(pwddet.getText().toString().equals(pwd)){
                 Intent startdetective=new Intent(LoginDetectiveActivity.this,DetectiveActivity.class);
                 startActivity(startdetective);
             }
             else {
                 showMessage("Incorrect password or empty password field", "Please enter correct password");

             }
            }
        });


    }
}
