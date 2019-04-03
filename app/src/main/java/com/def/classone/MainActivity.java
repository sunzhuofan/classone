package com.def.classone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        output = findViewById(R.id.output);
        EditText inp = findViewById(R.id.inp);
        String str = inp.getText().toString();
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText inp = findViewById(R.id.inp);
        String str = inp.getText().toString();
        double STR = Double.parseDouble(str);
        double answer = 32+1.8*STR;
        output.setText("结果为 "+answer+"");

    }

}
