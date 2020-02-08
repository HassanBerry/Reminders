package com.example.reminders;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Meeting1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting1);

    }

    public void openedit(View vie) {
        LayoutInflater li = LayoutInflater.from(this);
        View promptsView = li.inflate(R.layout.activity_meeting2, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setView(promptsView);
        alertDialogBuilder.setTitle("Edit Account");
        final EditText nam = promptsView.findViewById(R.id.editText9);
        final EditText pass = promptsView.findViewById(R.id.editText11);
        if (nam.getText().toString().length() < 3 || nam.getText().toString() == null) {
            nam.setError("Please Enter a Valid Name of size 3 or more");
            nam.requestFocus();
        } else if (pass.getText().toString().length() < 8 || pass.getText().toString() == null) {
            pass.setError("Please Enter a Valid Password of size 8 or more");
            pass.requestFocus();
        }
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Update",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String name = nam.getText().toString();

                                String pass1 = pass.getText().toString();
                                if (name.length() >= 3 && pass1.length() >= 8) {
                                    //System.out.println("values ---- "+ Data.status);
                                    //new EditAccountConnection(Data.status,name,pass1,UserInformationActivity.this).execute();
                                    //Intent i = new Intent(Meeting1.this,Login.class);
                                    //startActivity(i);
                                } else {
                                    Toast.makeText(Meeting1.this, "Incorrect Length of Password or Username", Toast.LENGTH_SHORT).show();
                                }


                            }
                        })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();


    }

    public void onClick(View v) {
        androidx.appcompat.app.AlertDialog.Builder mBuilder = new androidx.appcompat.app.AlertDialog.Builder(Meeting1.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog_spinner, null);
        mBuilder.setTitle("Choose Classroom");
        final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Meeting1.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.CS));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);

        mBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Please Select Class…")) {

                    Toast.makeText(Meeting1.this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT)
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

        androidx.appcompat.app.AlertDialog dialog = mBuilder.create();
        dialog.show();
    }

    public void onClick1(View v) {
        androidx.appcompat.app.AlertDialog.Builder mBuilder = new androidx.appcompat.app.AlertDialog.Builder(Meeting1.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog_spinner, null);
        mBuilder.setTitle("Choose Classroom");
        final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Meeting1.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.EE));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);

        mBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Please Select Class…")) {

                    Toast.makeText(Meeting1.this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT)
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

        androidx.appcompat.app.AlertDialog dialog = mBuilder.create();
        dialog.show();
    }


    public void onClick2(View v) {
        androidx.appcompat.app.AlertDialog.Builder mBuilder = new androidx.appcompat.app.AlertDialog.Builder(Meeting1.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog_spinner, null);
        mBuilder.setTitle("Choose Classroom");
        final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Meeting1.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.SC));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);

        mBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Please Select Class…")) {

                    Toast.makeText(Meeting1.this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT)
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

        androidx.appcompat.app.AlertDialog dialog = mBuilder.create();
        dialog.show();


    }
}
