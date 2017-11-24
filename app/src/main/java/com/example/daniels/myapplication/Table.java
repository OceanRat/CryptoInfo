package com.example.daniels.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Table extends AppCompatActivity {

    /*TextView bitcoin;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        /*          AN ATTEMPT TO SIMULATE PRICE CHANGES
        try
        {
            converter();
        }
        catch(InterruptedException e)
        {

        }
        */
    }

    /*
    private void converter() throws InterruptedException
    {

        String value;
        while(true)
        {
            Thread.sleep(15000);
            bitcoin = (TextView) findViewById(R.id.bitcoinValue);
            value = (String) bitcoin.getText();
            int result = 0;
            int coinValue = 0;
            int newValue = 0;
            try
            {
                coinValue = Integer.parseInt(value);
            }
            catch (NumberFormatException e)
            {

            }
            result = (coinValue * 5) / 100;
            newValue = coinValue + result;
            bitcoin.setText(newValue);

            Thread.sleep(20000);
            value = (String) bitcoin.getText();
            result = 0;
            coinValue = 0;
            newValue = 0;
            try
            {
                coinValue = Integer.parseInt(value);
            }
            catch(NumberFormatException e)
            {

            }
            result = (coinValue * 2) / 100;
            newValue = coinValue - result;
            bitcoin.setText(newValue);
        }
    }
    */
}
