package com.example.completecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String oldNumber = "";
    String op ="+";
    EditText ed1;
    Boolean isNew = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.editText);
    }

    public  void numberEvent(View view){
        if(isNew)
            ed1.setText("");
        isNew = false;
        String number  = ed1.getText().toString();
        switch (view.getId()){
            case R.id.btn0:
                number +="0";
                break;
            case R.id.btn1:
                number +="1";
                break;
            case R.id.btn2:
                number +="2";
                break;
            case R.id.btn3:
                number +="3";
                break;
            case R.id.btn4:
                number +="4";
                break;
            case R.id.btn5:
                number +="5";
                break;
            case R.id.btn6:
                number +="6";
                break;
            case R.id.btn7:
                number +="7";
                break;
            case R.id.btn8:
                number +="8";
                break;
            case R.id.btn9:
                number +="9";
                break;
            case R.id.btnDot:
                number +=".";
                break;
        }
        ed1.setText(number);
    }

    public void OperationEvent(View view){
        isNew = true;
        oldNumber = ed1.getText().toString();

        switch (view.getId()){
            case R.id.btnAdd:
                op = "+";
                break;
            case R.id.btnDivide:
                op = "/";
                break;
            case R.id.btnMultiply:
                op = "*";
                break;
            case R.id.btnSubtract:
                op = "-";
                break;
        }
    }

    public void EqualEvent(View view){
        String newNumber = ed1.getText().toString();
        double result = 0.0;

        switch (op){
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(result+"");
    }

    public void ClearEvent(View view){
        ed1.setText("");
    }
}