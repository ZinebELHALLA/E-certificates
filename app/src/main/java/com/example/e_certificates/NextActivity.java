package com.example.e_certificates;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next); // Ensure this layout is correctly referenced

        TextView textViewResults = findViewById(R.id.textViewResults); // Declare as a local variable

        // Get the data passed from MainActivity
        Intent intent = getIntent();
        String selectedAnswers = intent.getStringExtra("selectedAnswers");

        // Check if the selectedAnswers is not null and display the results
        if (selectedAnswers != null && !selectedAnswers.isEmpty()) {
            textViewResults.setText(selectedAnswers);
        } else {
            textViewResults.setText("No answers selected."); // Handle case where no answers are passed
        }
    }
}
