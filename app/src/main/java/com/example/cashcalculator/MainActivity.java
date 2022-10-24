package com.example.cashcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    EditText et1000,et2000,et5000,et10000,et20000;
    TextView txt1000,txt2000,txt5000,txt10000,txt20000;

    TextView txtFinalCash,txtFinalCashInWords;

    Button btReset;

    ArrayList<Long> fluctuateCash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUI();

        fluctuateCash = new ArrayList<>();

        et1000.addTextChangedListener(new CashTextWatcher());
        et2000.addTextChangedListener(new CashTextWatcher());
        et5000.addTextChangedListener(new CashTextWatcher());
        et10000.addTextChangedListener(new CashTextWatcher());
        et20000.addTextChangedListener(new CashTextWatcher());
    }

    private void setUpUI(){

        btReset = findViewById(R.id.btnReset);
        txtFinalCash = findViewById(R.id.txtFinalCash);
        txtFinalCashInWords = findViewById(R.id.txtFinalCashInWords);

        et1000 = findViewById(R.id.et1000);
        et2000 = findViewById(R.id.et2000);
        et5000 = findViewById(R.id.et5000);
        et10000 = findViewById(R.id.et10000);
        et20000 = findViewById(R.id.et20000);



        txt1000 = findViewById(R.id.txt1000);
        txt2000 = findViewById(R.id.txt2000);
        txt5000 = findViewById(R.id.txt5000);
        txt10000 = findViewById(R.id.txt10000);
        txt20000 = findViewById(R.id.txt20000);
    }

    private class CashTextWatcher implements TextWatcher{

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            cashCalculate();
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    }

    private void cashCalculate() {

        long row_value = 0;
        DecimalFormat df = new DecimalFormat("0");
        long num1 = 0;
        if(!et1000.getText().toString().equals("")){

            num1 = Long.parseLong(et1000.getText().toString());
            row_value = num1 * 1000;
            txt1000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }
        long num2 = 0;
        if(!et2000.getText().toString().equals("")){

            num2 = Long.parseLong(et2000.getText().toString());
            row_value = num2 * 2000;
            txt2000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }

        long num3 = 0;
        if(!et5000.getText().toString().equals("")){

            num3 = Long.parseLong(et5000.getText().toString());
            row_value = num3 * 5000;
            txt5000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }

        long num4 = 0;
        if(!et10000.getText().toString().equals("")){

            num4 = Long.parseLong(et10000.getText().toString());
            row_value = num4 * 10000;
            txt10000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }

        long num5 = 0;
        if(!et20000.getText().toString().equals("")){

            num5 = Long.parseLong(et20000.getText().toString());
            row_value = num4 * 20000;
            txt20000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }
    }
}