package com.example.innovace.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ontBtn,seconBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenbtn,eightBtn,nineBtn,zeroBtn,clearBtn;
    ImageButton addBtn,subBtn,divdBtn,multiBtn,equalBtn;
    public enum Operation {
        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUAL
    }
    String currentNum = "";
    String leftVal = "";
    String rightVal = "";
    Operation currentOpt;
    int resultAns = 0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calsi);
        ontBtn = (Button)findViewById(R.id.btnOne);
        seconBtn = (Button)findViewById(R.id.btnTwo);
        threeBtn = (Button)findViewById(R.id.btnThree);
        fourBtn = (Button)findViewById(R.id.btnFour);
        fiveBtn = (Button)findViewById(R.id.btnFive);
        sixBtn = (Button)findViewById(R.id.btnSix);
        sevenbtn = (Button)findViewById(R.id.btnSeven);
        eightBtn = (Button)findViewById(R.id.btnEight);
        nineBtn = (Button)findViewById(R.id.btnNine);
        zeroBtn = (Button)findViewById(R.id.btnZero);
        clearBtn = (Button)findViewById(R.id.clearBtn);

        addBtn = (ImageButton)findViewById(R.id.btnAdd);
        subBtn = (ImageButton)findViewById(R.id.btnSub);
        divdBtn = (ImageButton)findViewById(R.id.btnDiv);
        multiBtn = (ImageButton)findViewById(R.id.btnMultily);
        equalBtn = (ImageButton)findViewById(R.id.equalBtn);

        textView = (TextView)findViewById(R.id.textVal);
        textView.setText("");

        ontBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(1);
            }
        });
        seconBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(2);
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(3);
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(4);
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(5);
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(6);
            }
        });
        sevenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(7);
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(8);
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(9);
            }
        });
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                clickNumberVal(0);
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                calculationOperation(Operation.ADD);
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                calculationOperation(Operation.SUBTRACT);
            }
        });
        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                calculationOperation(Operation.MULTIPLY);
            }
        });
        divdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clicked","yes");
                calculationOperation(Operation.DIVIDE);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rightVal = "";
                leftVal = "";
                currentNum = "";
                resultAns = 0;
                currentOpt = null;
                textView.setText("0");
            }
        });
        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationOperation(Operation.EQUAL);
            }
        });


    }

    public void clickNumberVal(int number){
        currentNum = String.valueOf(+number);
        textView.setText(currentNum);

    }


    public  void calculationOperation(Operation operation){


        if (currentOpt != null){

            if (currentNum != ""){
                rightVal = currentNum;
                currentNum = "";
                switch (currentOpt){
                    case ADD:
                        resultAns = Integer.parseInt(leftVal) + Integer.parseInt(rightVal);
                        break;
                    case SUBTRACT:
                        resultAns = Integer.parseInt(leftVal) - Integer.parseInt(rightVal);
                        break;
                    case MULTIPLY:
                        resultAns = Integer.parseInt(leftVal) * Integer.parseInt(rightVal);
                        break;
                    case DIVIDE:
                        resultAns = Integer.parseInt(leftVal) / Integer.parseInt(rightVal);
                        break;

                }
                leftVal = String.valueOf(resultAns);
                textView.setText(leftVal);

            }





        }else{
            leftVal = currentNum ;
            currentNum = "" ;
        }
        currentOpt = operation;

    }


}
