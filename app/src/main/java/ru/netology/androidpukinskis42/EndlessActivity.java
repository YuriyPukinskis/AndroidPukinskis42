package ru.netology.androidpukinskis42;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class EndlessActivity extends AppCompatActivity {
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endless);
        TextView t1 = (TextView) findViewById(R.id.textView);
        t1.setText(Integer.toString(random.nextInt(101)));
        Button btnForv = (Button) findViewById(R.id.buttonForvard);
        Button btnBack = (Button) findViewById(R.id.buttonBack);
        final Intent intent = new Intent(EndlessActivity.this,EndlessActivity.class);

        btnForv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
