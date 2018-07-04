package com.example.android.question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the submit button is clicked.
     */
    public void submit(View view) {
        //Get user's name
        EditText nameField = (EditText) findViewById(R.id.name.field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();
    }
}
