package com.example.philippe.seg3125test;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DecimalFormat;

public class AlgebraQuizActivity extends Activity {

    private RadioGroup q1_radioGroup;
    private RadioGroup q2_radioGroup;
    private RadioGroup q3_radioGroup;
    private RadioButton ans1;
    private RadioButton ans2;
    private RadioButton ans3;

    private String q1_Sol = "x = 1";
    private String q2_Sol = "x = -4";
    private String q3_Sol = "x = -6";
    private int total = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_quiz);

    }
    public void calcResult (View view){
        double score = 0;
        double totalScore;
        q1_radioGroup = (RadioGroup) findViewById(R.id.q1);
        q2_radioGroup = (RadioGroup) findViewById(R.id.q2);
        q3_radioGroup = (RadioGroup) findViewById(R.id.q3);

        //Get selection from each radioGroup
        int selectedID1 = q1_radioGroup.getCheckedRadioButtonId();
        int selectedID2 = q2_radioGroup.getCheckedRadioButtonId();
        int selectedID3 = q3_radioGroup.getCheckedRadioButtonId();

        //Find the radiobutton for each group
        ans1 = (RadioButton) findViewById(selectedID1);
        ans2 = (RadioButton) findViewById(selectedID2);
        ans3 = (RadioButton) findViewById(selectedID3);

        String strAns1 = ans1.getText().toString();
        String strAns2 = ans2.getText().toString();
        String strAns3 = ans3.getText().toString();

        //Checks user's answers against solutions stored in class
        if(strAns1.equals(q1_Sol)) {
            score++;
        }
        if(strAns2.equals(q2_Sol)){
            score++;
        }
        if(strAns3.equals(q3_Sol)){
            score++;
        }

        //Calculate result in percentage
        totalScore = (score/total) * 100;

        Context context = getApplicationContext();
        CharSequence text = "Quiz Completed!  You Scored: " + (new DecimalFormat("#0.00").format(totalScore)) + "%";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
