package com.example.robin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMinus,btnDivision,btnMul,btnEqual,btnPoint,btnC;
    TextView tvOutput,tvInput;

    private final char Addition = '+';
    private final char Subtruction = '-';
    private final char Multiplication = '*';
    private final char Division = '/';
    private final char Equal = '=';
    private char Action;
    private double Value1 = Double.NaN;
    private double Value2 = Double.NaN;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroupInitialization();
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"9");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(null);
            }
        });
        //operator
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculation();
                Action = Addition;
                tvOutput.setText(tvInput.getText().toString()+"+");
                tvInput.setText(null);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(tvInput.getText().toString()+"-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(tvInput.getText().toString()+"*");
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+".");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(tvInput.getText().toString()+"/");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculation();
                Action = Equal;
                tvOutput.setText(String.valueOf(Value1));
            }
        });
    }
    public void ViewGroupInitialization(){
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnC = (Button) findViewById(R.id.btnC);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDivision= (Button) findViewById(R.id.btnDivision);
        btnEqual= (Button) findViewById(R.id.btnEqual);
        tvInput = (TextView) findViewById(R.id.tvInput);
        tvOutput = (TextView) findViewById(R.id.tvOutput);

    }

    public void Calculation(){
        if(!Double.isNaN(Value1))
        {
            Value2 = Double.parseDouble(tvInput.getText().toString());

            switch (Action){
                case Addition:
                    Value1 = Value1 + Value2;
                    break;
                case Subtruction:
                    Value1 = Value1 - Value2;
                    break;
                case Division:
                    Value1 = Value1 / Value2;
                    break;
                case Multiplication:
                    Value1 = Value1 * Value2;
                    break;
                case Equal:
                    break;

            }
        }
        else
        {
            Value1 = Double.parseDouble(tvInput.getText().toString());

        }
    }
}
