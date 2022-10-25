package com.example.cashcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    EditText et1000,et2000,et5000,et10000,et20000,et50000,et100000,et200000,et500000;
    TextView txt1000,txt2000,txt5000,txt10000,txt20000,txt50000,txt100000,txt200000,txt500000;

    TextView txtFinalCash,txtFinalCashInWords;

    Button btReset;

    ArrayList<Integer> fluctuateCash;
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
        et50000.addTextChangedListener(new CashTextWatcher());
        et100000.addTextChangedListener(new CashTextWatcher());
        et200000.addTextChangedListener(new CashTextWatcher());
        et500000.addTextChangedListener(new CashTextWatcher());

        txt1000.addTextChangedListener(new FinalCashTextWatcher());
        txt2000.addTextChangedListener(new FinalCashTextWatcher());
        txt5000.addTextChangedListener(new FinalCashTextWatcher());
        txt10000.addTextChangedListener(new FinalCashTextWatcher());
        txt20000.addTextChangedListener(new FinalCashTextWatcher());
        txt50000.addTextChangedListener(new FinalCashTextWatcher());
        txt100000.addTextChangedListener(new FinalCashTextWatcher());
        txt200000.addTextChangedListener(new FinalCashTextWatcher());
        txt500000.addTextChangedListener(new FinalCashTextWatcher());

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearData();
            }
        });
    }

    private void clearData() {

        txtFinalCashInWords.setText("0");
        txtFinalCash.setText("0");
        txt1000.setText("0");
        txt2000.setText("0");
        txt5000.setText("0");
        txt10000.setText("0");
        txt20000.setText("0");
        txt50000.setText("0");
        txt100000.setText("0");
        txt200000.setText("0");
        txt500000.setText("0");

        et1000.setText("");
        et2000.setText("");
        et5000.setText("");
        et10000.setText("");
        et20000.setText("");
        et50000.setText("");
        et100000.setText("");
        et200000.setText("");
        et500000.setText("");
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
        et50000 = findViewById(R.id.et50000);
        et100000 = findViewById(R.id.et1000000);
        et200000 = findViewById(R.id.et200000);
        et500000 = findViewById(R.id.et500000);

        txt1000 = findViewById(R.id.txt1000);
        txt2000 = findViewById(R.id.txt2000);
        txt5000 = findViewById(R.id.txt5000);
        txt10000 = findViewById(R.id.txt10000);
        txt20000 = findViewById(R.id.txt20000);
        txt50000 = findViewById(R.id.txt50000);
        txt100000 = findViewById(R.id.txt100000);
        txt200000 = findViewById(R.id.txt200000);
        txt500000 = findViewById(R.id.txt500000);
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

        int row_value = 0;
        DecimalFormat df = new DecimalFormat("0");
        int num1 = 0;
        if(!et1000.getText().toString().equals("")){

            num1 = Integer.parseInt(et1000.getText().toString());
            row_value = num1 * 1000;
            txt1000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }
        int num2 = 0;
        if(!et2000.getText().toString().equals("")){

            num2 = Integer.parseInt(et2000.getText().toString());
            row_value = num2 * 2000;
            txt2000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }

        int num3 = 0;
        if(!et5000.getText().toString().equals("")){

            num3 = Integer.parseInt(et5000.getText().toString());
            row_value = num3 * 5000;
            txt5000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }

        int num4 = 0;
        if(!et10000.getText().toString().equals("")){

            num4 = Integer.parseInt(et10000.getText().toString());
            row_value = num4 * 10000;
            txt10000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }

        int num5 = 0;
        if(!et20000.getText().toString().equals("")){

            num5 = Integer.parseInt(et20000.getText().toString());
            row_value = num5 * 20000;
            txt20000.setText(df.format(row_value));
            fluctuateCash.add(row_value);

        }

        int num6 = 0;
        if(!et50000.getText().toString().equals("")) {

            num6 = Integer.parseInt(et50000.getText().toString());
            row_value = num6 * 0;
            txt50000.setText(df.format(row_value));
            fluctuateCash.add(row_value);
        }

        int num7 = 0;
        if(!et100000.getText().toString().equals("")) {

            num7 = Integer.parseInt(et100000.getText().toString());
            row_value = num7 * 0;
            txt100000.setText(df.format(row_value));
            fluctuateCash.add(row_value);
        }

        int num8 = 0;
        if(!et200000.getText().toString().equals("")) {

            num8 = Integer.parseInt(et200000.getText().toString());
            row_value = num8 * 0;
            txt200000.setText(df.format(row_value));
            fluctuateCash.add(row_value);
        }

        int num9 = 0;
        if(!et500000.getText().toString().equals("")) {

            num9 = Integer.parseInt(et500000.getText().toString());
            row_value = num9 * 0;
            txt500000.setText(df.format(row_value));
            fluctuateCash.add(row_value);
        }

        if(et1000.getText().toString().equals("")){
            txt1000.setText(df.format(0));
        }

        if (et2000.getText().toString().equals("")){
            txt2000.setText(df.format(0));
        }

        if (et5000.getText().toString().equals("")){
            txt5000.setText(df.format(0));
        }

        if (et10000.getText().toString().equals("")){
            txt10000.setText(df.format(0));
        }

        if (et20000.getText().toString().equals("")){
            txt20000.setText(df.format(0));
        }

        if (et50000.getText().toString().equals("")){
            txt50000.setText(df.format(0));
        }

        if (et100000.getText().toString().equals("")){
            txt100000.setText(df.format(0));
        }

        if (et200000.getText().toString().equals("")){
            txt200000.setText(df.format(0));
        }

        if (et500000.getText().toString().equals("")){
            txt500000.setText(df.format(0));
        }
    }

    private class FinalCashTextWatcher implements TextWatcher{


        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            totalCash();
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    }

    private void totalCash() {

        int totalCash = 0;

        DecimalFormat df = new DecimalFormat("0");

        Main ob = new Main();

        if (!txt1000.getText().toString().equals("")&& !txt2000.getText().toString().equals("")){
            if (!txt5000.getText().toString().equals("") && !txt10000.getText().toString().equals("")){
                if(!txt20000.getText().toString().equals("") && !txt50000.getText().toString().equals("")){
                    if(!txt100000.getText().toString().equals("") && !txt200000.getText().toString().equals("")){
                        if(!txt500000.getText().toString().equals("")){
                            int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0;

                            num1 = Integer.parseInt(txt1000.getText().toString());
                            num2 = Integer.parseInt(txt2000.getText().toString());
                            num3 = Integer.parseInt(txt5000.getText().toString());
                            num4 = Integer.parseInt(txt10000.getText().toString());
                            num5 = Integer.parseInt(txt20000.getText().toString());
                            num6 = Integer.parseInt(txt50000.getText().toString());
                            num7 = Integer.parseInt(txt100000.getText().toString());
                            num8 = Integer.parseInt(txt200000.getText().toString());
                            num9 = Integer.parseInt(txt500000.getText().toString());

                            totalCash = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
                            txtFinalCash.setText("Total Cash: "+df.format(totalCash));
                            txtFinalCashInWords.setText(String.valueOf(ob.convertNumberToWords(totalCash)));

                            if(txtFinalCashInWords.getText().toString().equals("")){
                                txtFinalCashInWords.setText(R.string.zero);
                            }
                        }
                    }
                }
            }
        }

    }
}