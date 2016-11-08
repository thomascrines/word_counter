package com.example.user.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter extends AppCompatActivity {

    EditText mUserTypingEditText;
    Button mWordCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("WordCounter", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserTypingEditText = (EditText)findViewById(R.id.prompt_text);
        mWordCountButton = (Button)findViewById(R.id.count_button);

        mWordCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = mUserTypingEditText.getText().toString();
                int wordTotal = input.trim().split(" ").length;
                String total = Integer.toString(wordTotal);
                Intent intent = new Intent(WordCounter.this, WordCounterActivity.class);
                intent.putExtra("count", total);
                startActivity(intent);
            }
        });
    }
}

//    int wordTotal = mUserTypingEditText.getText().length();