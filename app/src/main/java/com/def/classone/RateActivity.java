package com.def.classone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RateActivity extends AppCompatActivity {

    EditText rmb;
    TextView show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        rmb = (EditText)findViewById(R.id.rmb);
        show = (TextView)findViewById(R.id.showMoney);

    }

    public void onClick(View btn){
        //获取用户输入内容
        String str = rmb.getText().toString();
        float r = 0;
        if(str.length()>0){
            r = Float.parseFloat(str);
        }else{
            //提示用户输入内容
            Toast.makeText(this, "请输入内容", Toast.LENGTH_SHORT).show();
        }
        float val = 0;
        if(btn.getId()==R.id.btn_dollar){
            val = r*(1/6.7f);
            String value = String.format("%1.2f",val);
            show.setText(value);
        }else if(btn.getId()==R.id.btn_euro){
            val = r*(1/11f);
            String value = String.format("%1.2f",val);
            show.setText(value);
        }else{
            val = r*500;
            String value = String.format("%1.2f",val);
            show.setText(value);
        }
    }

    public void openOne(View btn){
        //打开一个页面Activity
        Intent hello = new Intent(this,basketball.class);
        Intent web = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.jd.com"));
        startActivity(web);

    }
}
