package com.def.classone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BasketballActivity extends AppCompatActivity {
    TextView score;
    TextView score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
         score = (TextView)findViewById(R.id.scoreA);
         score2 = (TextView)findViewById(R.id.scoreB);
    }

    public void finalresult(int inc) {
        String oldScore = (String)score.getText();
        int newScore = Integer.parseInt(oldScore)+inc;
        score.setText(""+newScore);
    }

    public void finalresult2(int inc) {
        String oldScore = (String)score2.getText();
        int newScore = Integer.parseInt(oldScore)+inc;
        score2.setText(""+newScore);
    }


    int SCORE = 0;
    public void one(View a){
        if(a.getId()==R.id.oneA){
            finalresult(1);
        }else{
            finalresult2(1);
        }

    }
    public void two(View b){
        if(b.getId()==R.id.twoA){
            finalresult(2);
        }else{
            finalresult2(2);
        }
    }
    public void three(View c){
        if(c.getId()==R.id.threeA){
            finalresult(3);
        }else{
            finalresult2(3);
        }
    }
    public void reset(View d){
        score.setText("0");
        score2.setText("0");
    }
}
