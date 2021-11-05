package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;
    private Spinner selectedOption;
    private EditText enteredText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.resultText = findViewById(R.id.resultText);
        this.selectedOption = findViewById(R.id.selectedOption);
        this.enteredText = findViewById(R.id.enteredText);
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.i("Routine", "onRestart => ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.i("Routine", "onStart => ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.i("Routine", "onResume => ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.i("Routine", "onPause => ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.i("Routine", "onStop => ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("Routine", "onDestroy => ");
    }

    public void buttnClick(View view) {
        String userEnteredText = enteredText.getText().toString();
        String spinnerSelection = selectedOption.getSelectedItem().toString();


        if(functions.countWords(userEnteredText)==0){
            Toast.makeText(this, "Text field is empty!", Toast.LENGTH_SHORT).show();

        } else if(spinnerSelection==getString(R.string.words_selection)){
            int wordCount = functions.countWords(userEnteredText);
            resultText.setText(String.valueOf(wordCount));
        } else if(spinnerSelection==getString(R.string.spellingChars_selection)){
            int charCount = functions.charCounter(userEnteredText);
            resultText.setText(String.valueOf(charCount));
        }
    }
}