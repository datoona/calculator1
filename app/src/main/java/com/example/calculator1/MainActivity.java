package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText answerInput = findViewById(R.id.answerInput);
        TextView incorrectTextView = findViewById(R.id.incorrectTextView);
        TextView correctTextView = findViewById(R.id.correctTextView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = answerInput.getText().toString();
                int number = Integer.parseInt(text);

                if (number == 17) {
                    correctTextView.setVisibility(View.VISIBLE);
                    incorrectTextView.setVisibility(View.GONE);
                } else {
                    correctTextView.setVisibility(View.GONE);
                    incorrectTextView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}