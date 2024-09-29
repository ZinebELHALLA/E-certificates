package com.example.e_certificates;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkboxOption1;
    private CheckBox checkboxOption2;
    private CheckBox checkboxOption3;
    private CheckBox checkboxOption4;
    private RadioButton radioYes;
    private RadioButton radioNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize checkboxes and radio buttons
        checkboxOption1 = findViewById(R.id.checkbox_option1);
        checkboxOption2 = findViewById(R.id.checkbox_option2);
        checkboxOption3 = findViewById(R.id.checkbox_option3);
        checkboxOption4 = findViewById(R.id.checkbox_option4);
        radioYes = findViewById(R.id.radio_yes);
        radioNo = findViewById(R.id.radio_no);

        Button btnNext = findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder selectedAnswers = new StringBuilder();

                // Check selected checkboxes
                StringBuilder selectedOptions = new StringBuilder();

                if (checkboxOption1.isChecked()) {
                    selectedOptions.append("Multiple Versions Combined, ");
                }
                if (checkboxOption2.isChecked()) {
                    selectedOptions.append("Model View Controller, ");
                }
                if (checkboxOption3.isChecked()) {
                    selectedOptions.append("Main Value Compiled, ");
                }
                if (checkboxOption4.isChecked()) {
                    selectedOptions.append("Mandatory Validated Controls, ");
                }

                // Remove the trailing comma and space if any options were selected
                if (selectedOptions.length() > 0) {
                    selectedOptions.setLength(selectedOptions.length() - 2); // Remove last comma and space
                    selectedAnswers.append("1. Le pattern MVC signifie : ").append(selectedOptions).append("\n");
                } else {
                    selectedAnswers.append("1. Le pattern MVC signifie : Aucune option sélectionnée\n");
                }

                // Check selected radio button
                if (radioYes.isChecked()) {
                    selectedAnswers.append("2. La syntaxe ${x} est permise dans une JSP : OUI\n");
                } else {
                    selectedAnswers.append("2. La syntaxe ${x} est permise dans une JSP : NON\n");
                }

                // Pass the selected answers to NextActivity
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                intent.putExtra("selectedAnswers", selectedAnswers.toString());
                startActivity(intent);
            }
        });
    }
}
