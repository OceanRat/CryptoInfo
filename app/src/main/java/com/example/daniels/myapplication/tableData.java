package com.example.daniels.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class tableData extends AppCompatActivity
{

    ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);

        data.add("Name");
        data.add("Value");
        data.add("Change");
        data.add("Coin");
        //column 1
        data.add("Bitcoin");
        data.add("7011.38€");
        data.add("+1.2%");
        data.add("BTC");
        //column 2
        data.add("Bitcoin Cash");
        data.add("1007.88€");
        data.add("+0.42%");
        data.add("BCH");
        //column 3
        data.add("Ethereum");
        data.add("312.78€");
        data.add("+2.35%");
        data.add("ETH");
        //column 4
        data.add("Ethereum Classic");
        data.add("15.52€");
        data.add("-1.49%");
        data.add("ETC");
        //column 5
        data.add("Litecoin");
        data.add("60.70€");
        data.add("-0.11%");
        data.add("LTC");
        //column 6
        data.add("Ripple");
        data.add("0.20€");
        data.add("-0.08%");
        data.add("XRP");
        //column 7
        data.add("Einsteinium");
        data.add("0.12€");
        data.add("+0.07%");
        data.add("EMC2");
        //column 8
        data.add("Zcash");
        data.add("252.14€");
        data.add("-1.34%");
        data.add("ZEC");


    }
}
