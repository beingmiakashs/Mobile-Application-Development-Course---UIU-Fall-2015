package com.omeletlab.thirdcalss;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText subjectName = (EditText)findViewById(R.id.subjectNameTextView);
        EditText credits = (EditText)findViewById(R.id.creditsTextView);
        EditText cgpa = (EditText)findViewById(R.id.cgpaTextView);

        Button cgpaCalculate = (Button)findViewById(R.id.cgpaCalculateBtn);
        Button completeResult = (Button)findViewById(R.id.completeResultBtn);


        cgpaCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String subjectNameText = subjectName.getText().toString();

                Log.d("mainactivity subject", subjectNameText);
                Toast.makeText(MainActivity.this, subjectNameText, Toast.LENGTH_LONG).show();

            }
        });

        completeResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultViewActivity.class);
                String subjectNameText = subjectName.getText().toString();
                intent.putExtra("SB", subjectNameText);
                startActivity(intent);
            }
        });

    }
}
