package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    SharedPreferences myPreferenceRef;
    SharedPreferences.Editor myPreferenceEditor;

    EditText edit;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.SaveButton);
        edit = findViewById(R.id.editInput);

        myPreferenceRef = getSharedPreferences("pref", MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPreferenceEditor.putString("MyAppPreferenceString", edit.getText().toString());
                myPreferenceEditor.apply();

            }
        });

    }
}