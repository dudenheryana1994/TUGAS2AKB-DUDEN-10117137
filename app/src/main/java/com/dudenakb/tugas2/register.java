package com.dudenakb.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//Tanggal Pengerjaaan : 15 april 2020
//Deskripsi Pengerjaan :Membuat mainactivity dan register
// NIM : 10117137
// Nama : Duden Heryana
// Kelas : IF-4

//---------------------------------------------------------------------------

//Tanggal Pengerjaaan : 16 april 2020
//Deskripsi Pengerjaan :Membuat kelas almostthere, verifyAccount dan userhome
// NIM : 10117137
// Nama : Duden Heryana
// Kelas : IF-4

public class register extends AppCompatActivity {

    Button btnreg;
    EditText username;
    public static final String Username = "";
    public void onClick(View view) {
        Intent intent = new Intent(register.this, almostthere.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnreg = (Button) findViewById(R.id.btnreg);
        username = findViewById(R.id.edt_username);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save input data to variables
                String Username = username.getText().toString();
                //check if email is empty
                if (Username.isEmpty()){
                    username.setError("Isi Nama Anda");
                    return;
                }

                //call function login
                login(Username);
            }
        });
    }
    private void login(String Username){
        //create the intent
        Intent intent = new Intent(getApplicationContext(), almostthere.class);
        startActivity(intent);
    }
}