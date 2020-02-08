package com.example.reminders;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    Button mShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mShowDialog = (Button) findViewById(R.id.btnShowDialog);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Test.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_spinner, null);
                mBuilder.setTitle("Choose Classroom");
                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner3);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(Test.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.CS));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapter);

                mBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        if(!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Please Select Class…")){

                            Toast.makeText(Test.this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT )
                            .show();

                            dialogInterface.dismiss();

                        }
                    }
                });

                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();
                    }
                });

                mBuilder.setView(mView);

                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }

            public void onClick1(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Test.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_spinner, null);
                mBuilder.setTitle("Choose Classroom");
                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner3);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(Test.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.EE));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapter);

                mBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        if(!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Please Select Class…")){

                            Toast.makeText(Test.this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT )
                                    .show();

                            dialogInterface.dismiss();

                        }
                    }
                });

                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();
                    }
                });

                mBuilder.setView(mView);

                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }

            public void onClick2(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Test.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_spinner, null);
                mBuilder.setTitle("Choose Classroom");
                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner3);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(Test.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.SC));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapter);

                mBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        if(!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Please Select Class…")){

                            Toast.makeText(Test.this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT )
                                    .show();

                            dialogInterface.dismiss();

                        }
                    }
                });

                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();
                    }
                });

                mBuilder.setView(mView);

                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

    }

}
