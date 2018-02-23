package com.bus.lenovo.sqliteandriod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        Log.d("Insert: ", "Inserting ..");

        db.addContact(new Contact("Aashish","9991899289"));
        db.addContact(new Contact("Aashi","8523697410"));
        db.addContact(new Contact("Etrjt","7140258963"));

        Log.d("Reading: ", "Reading all contacts..");

        List<Contact>contacts = db.getAllContacts();

        for (Contact cn : contacts){

            String log = "Id: "+cn.get_id()+" ,Name: " + cn.get_name() + " ,Phone: " + cn.get_phone_number();
            Log.d("Name: ", log);

        }
    }
}
