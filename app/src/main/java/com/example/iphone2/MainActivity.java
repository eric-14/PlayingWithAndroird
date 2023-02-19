//package com.example.iphone2;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity {
//    private MyDatabaseHelper database;
//    private int userid =0;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main1);
//
//        database = new MyDatabaseHelper(MainActivity.this);
//
//
//    }
//
//    public void signIn(View view){
//
//        EditText username = findViewById(R.id.txtusername);
//        EditText password = findViewById(R.id.editTextTextPassword);
////        System.out.println("Email "+username.getText().toString() );
////        System.out.println("Password "+password.getText().toString() );
//        System.out.println("Pressing Sign In button "+ username.getText().toString() + password.getText().toString());
//
//        if(database.getUser(username.getText().toString(), password.getText().toString())){
//            Toast.makeText(this,"Successfully Signed In",Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this,"Username or password Invalid",Toast.LENGTH_SHORT).show();
//        }
//    }
//    public void signIn2(View view){
//        setContentView(R.layout.activity_main1);
//        Toast.makeText(this,"Opening Sign In page",Toast.LENGTH_SHORT).show();
//    }
//    public void register1(View view){
//        setContentView(R.layout.sign_out);
//        Toast.makeText(this,"Opening register page",Toast.LENGTH_SHORT).show();
//    }
//    public void register2(View view){
//        EditText fullname = findViewById(R.id.editfullname);
//        EditText username = findViewById(R.id.editUsername);
//        EditText phonenumber = findViewById(R.id.editphonenumber);
//        EditText password = findViewById(R.id.editPassword); //TODO : ENCRYPT PASSWORD 2. VALIDATE USER INPUT DATA
//
//        EditText email = findViewById(R.id.editEmail);
//        EditText editNumberOfHouses = findViewById(R.id.editNumberOfHouses);
//
//        database.addUser(userid,fullname.getText().toString(),email.getText().toString() , password.getText().toString(), username.getText().toString(),phonenumber.getText().toString(), editNumberOfHouses.getText().toString());
//        userid = userid+1;
//
//
//        System.out.println("Pressing register button ");
//    }
//
//
//
//}