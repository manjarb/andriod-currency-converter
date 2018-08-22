package com.amusexd.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarEditText);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());
        Double poundAmount = dollarAmountDouble * 0.75;
        Toast.makeText(MainActivity.this, "P " + String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmountEditText.getText().toString());
    }
}
