package com.example.zeeshan.lab3rd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
    }

    public void signIn(View view){
        String name = username.getText().toString();
        String pass = password.getText().toString();

        if(name.equals("") && pass.equals("")){
            Toast.makeText(this,"Both fields are empty" , Toast.LENGTH_LONG).show();
        }

        else if(name!=pass){
            Toast.makeText(this,"Username and password are not sane" , Toast.LENGTH_LONG).show();
        }

        else if(name.equals(pass)){
            Intent intent = new Intent(this,ActivityB.class);
            startActivity(intent);
        }
    }

}
