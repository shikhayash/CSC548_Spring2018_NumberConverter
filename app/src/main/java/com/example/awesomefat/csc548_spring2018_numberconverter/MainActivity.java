package com.example.awesomefat.csc548_spring2018_numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //made a change

    private TextView bit;
    private TextView kbit;
    private TextView mbit;
    private TextView gbit;
    private TextView tbit;
   private TextView byteTV;
    private TextView kbyte;

    private TextView gbyte;
    private TextView tbyte;


    private EditText mbyte;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.bit = (TextView)this.findViewById(R.id.bit);
        this.kbit = (TextView)this.findViewById(R.id.kbit);
        this.mbit = (TextView)this.findViewById(R.id.mbit);
        this.gbit = (TextView)this.findViewById(R.id.gbit);
        this.tbit = (TextView)this.findViewById(R.id.tbit);

        this.byteTV = (TextView)this.findViewById(R.id.byteTV);
        this.kbyte = (TextView)this.findViewById(R.id.kbyte);

        this.gbyte = (TextView)this.findViewById(R.id.gbyte);
        this.tbyte = (TextView)this.findViewById(R.id.tbyte);

        this.mbyte = (EditText)this.findViewById(R.id.mbyte);
    }

    private String roundOffNumber(double num)
    {
        return String.format("%.6f", num);
    }

    public void clickMeButtonPressed(View v)
    {
        String sInputMB = this.mbyte.getText().toString();

        int iInputMB = Integer.parseInt(sInputMB);

        int mbits = iInputMB * 8;

        int kbytes = iInputMB * 1024;
        int kbits = kbytes * 8;

        int bytes = kbytes * 1024;
       int bits = bytes * 8;

        double gbytes = (double)iInputMB / 1024;
        double gbits = gbytes * 8;

        double tbytes = (double)gbytes / 1024;
        double tbits = tbytes * 8;


        bit.setText("" +  bits );
        kbit.setText("" +  kbits);
        mbit.setText("" +  mbits);
        gbit.setText("" +  roundOffNumber(gbits));
        tbit.setText("" +  roundOffNumber(tbits));

        byteTV.setText("" +  bytes);
        kbyte.setText("" +  kbytes);
        //mbyte.setText("" +  iInputMB + " MB");
        gbyte.setText("" +  roundOffNumber(gbytes));
        tbyte.setText("" +  roundOffNumber(tbytes));

    }

}
