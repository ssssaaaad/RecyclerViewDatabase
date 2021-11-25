package com.cookandroid.newrecyclerview2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ModifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

        String date = "";
        String content = "";

        EditText dateView = (EditText) findViewById(R.id.date_textView);
        EditText contentView = (EditText) findViewById(R.id.content_textView);

        dateView.setText(date);
        contentView.setText(content);

        dateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}