package com.def.classone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class BasketballActivity extends AppCompatActivity {
    private final String TAG = "second";
    TextView score;
    TextView score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
        Log.i(TAG, "onCreate: ");
         score = (TextView)findViewById(R.id.scoreA);
         score2 = (TextView)findViewById(R.id.scoreB);
    }
    
    @Override
    protected  void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String scorea = ((TextView)findViewById(R.id.scoreA)).getText().toString();
        String scoreb = ((TextView)findViewById(R.id.scoreB)).getText().toString();

        Log.i(TAG, "onSaveInstanceState: ");
        outState.putString("teama_score",scorea);
        outState.putString("teamb_score",scoreb);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("teama_score");
        String scoreb = savedInstanceState.getString("teamb_score");

        Log.i(TAG, "onRestoreInstanceState: ");
        ((TextView)findViewById(R.id.scoreA)).setText(scorea);
        ((TextView)findViewById(R.id.scoreB)).setText(scoreb);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart: ");
    }
    
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume: ");
    }
    
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }
    
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause: ");
    }
    
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop: ");
    }
    
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
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
