package com.dudenakb.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Tanggal Pengerjaaan : 15 april 2020
//Deskripsi Pengerjaan :Membuat mainactivity dan register
// NIM : 10117137
// Nama : Duden Heryana
// Kelas : IF-4

//----------------------------------------------------------------------------

//Tanggal Pengerjaaan : 16 april 2020
//Deskripsi Pengerjaan :Membuat kelas almostthere, verifyAccount dan userhome
// NIM : 10117137
// Nama : Duden Heryana
// Kelas : IF-4


public class VerifyAccount extends AppCompatActivity {

    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        btnSend = (Button) findViewById(R.id.Send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VerifyAccount.this, UserHome.class);
                startActivity(intent);
            }
        });
    }

    ;
}