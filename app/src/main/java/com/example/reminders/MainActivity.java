package com.example.reminders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    Spinner spin;
    Spinner spin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Typecasting the variable here
        spin = (Spinner) findViewById(R.id.spinner);

// Array of Months acting as a data pump
        String[] objects = {"Assignment", "Project", "Quiz", "Midterm"};

// Declaring an Adapter and initializing it to the data pump
        ArrayAdapter adapter = new ArrayAdapter(
                getApplicationContext(), android.R.layout.simple_list_item_1, objects);

// Setting Adapter to the Spinner
        spin.setAdapter(adapter);

// Setting OnItemClickListener to the Spinner
        // spin.setOnItemSelectedListener(this);

        spin1 = (Spinner) findViewById(R.id.spinner2);

// Array of Months acting as a data pump
        String[] objects1 = {"Applied Physics", "Calculus and Analytical Geometry", "English Composition and Comprehension", "Introduction to Information and Communication Technologies", "Islamic and Religious Studies"};

// Declaring an Adapter and initializing it to the data pump
        ArrayAdapter adapter1 = new ArrayAdapter(
                getApplicationContext(), android.R.layout.simple_list_item_1, objects1);

// Setting Adapter to the Spinner
        spin1.setAdapter(adapter1);



    }

    public void OpenNext(View view){

        Intent I = new Intent(this, Reminders2.class);
        startActivity(I);
        
    }

}
