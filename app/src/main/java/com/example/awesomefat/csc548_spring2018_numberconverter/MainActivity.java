package com.example.awesomefat.csc548_spring2018_numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //made a change
    
    private TextView bitsTV;
    private EditText mbET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.bitsTV = (TextView)this.findViewById(R.id.bitsTV);
        this.mbET = (EditText)this.findViewById(R.id.mbET);
    }

    public void clickMeButtonPressed(View v)
    {
        String sValue = this.mbET.getText().toString();
        int iValue = Integer.parseInt(sValue);
        bitsTV.setText("" + (iValue + 5));

    }
}
