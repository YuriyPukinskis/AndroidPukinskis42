package ru.netology.androidpukinskis42;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        String str ="";
        Button btnClear = (Button) findViewById(R.id.buttonClear);
        btnClear.setText(getString (R.string.s3));
        Button btnOk = (Button) findViewById(R.id.buttonOk);
        btnOk.setText(getString (R.string.s4));
        final EditText editText = (EditText)findViewById(R.id.name);
        editText.setHint(getString (R.string.s5));
        final EditText mail = (EditText)findViewById(R.id.mail);
        mail.setHint(getString (R.string.s6));
        final TextView textView = findViewById(R.id.textView);

       btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText("");
                editText.setText("");
                mail.setText("");

            }
        });

       btnOk.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               textView.setText(getString (R.string.s1) + editText.getText() + getString (R.string.s2) +mail.getText() + ".");
           }
       });
    }
}
