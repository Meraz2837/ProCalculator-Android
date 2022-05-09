package com.example.procalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView primaryView, secondaryView;
    Double number1, number2, result;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primaryView = findViewById(R.id.primaryTextciewID);
        secondaryView = findViewById(R.id.SecondaryTextviewID);

    }


    public void NumberFunction(View view) {
        String primaryValue = primaryView.getText().toString();
        if(primaryValue.equals("0")) {
            if (view.getId() == R.id.ZerobtnID) {
                primaryView.setText("0");
            } else if (view.getId() == R.id.OnebtnID) {
                primaryView.setText("1");
            } else if (view.getId() == R.id.TwobtnID) {
                primaryView.setText("2");
            } else if (view.getId() == R.id.ThreebtnID) {
                primaryView.setText("3");
            } else if (view.getId() == R.id.FourbtnID) {
                primaryView.setText("4");
            } else if (view.getId() == R.id.FivebtnID) {
                primaryView.setText("5");
            } else if (view.getId() == R.id.SixbtnID) {
                primaryView.setText("6");
            } else if (view.getId() == R.id.SevenbtnID) {
                primaryView.setText("7");
            } else if (view.getId() == R.id.EightbtnID) {
                primaryView.setText("8");
            } else if (view.getId()==R.id.NinebtnID) {
                primaryView.setText("9");
            }
            else {
                primaryView.setText(".");
            }
        }

        else{
            if (view.getId() == R.id.ZerobtnID) {
                primaryView.setText(primaryValue+"0");
            } else if (view.getId() == R.id.OnebtnID) {
                primaryView.setText(primaryValue+"1");
            } else if (view.getId() == R.id.TwobtnID) {
                primaryView.setText(primaryValue+"2");
            } else if (view.getId() == R.id.ThreebtnID) {
                primaryView.setText(primaryValue+"3");
            } else if (view.getId() == R.id.FourbtnID) {
                primaryView.setText(primaryValue+"4");
            } else if (view.getId() == R.id.FivebtnID) {
                primaryView.setText(primaryValue+"5");
            } else if (view.getId() == R.id.SixbtnID) {
                primaryView.setText(primaryValue+"6");
            } else if (view.getId() == R.id.SevenbtnID) {
                primaryView.setText(primaryValue+"7");
            } else if (view.getId() == R.id.EightbtnID) {
                primaryView.setText(primaryValue+"8");
            } else if(view.getId() == R.id.NinebtnID){
                primaryView.setText(primaryValue+"9");
            }
            else {
                primaryView.setText(primaryValue+".");
            }
        }

    }


    public void operationFunction(View view) {
        String primaruValue = primaryView.getText().toString();
        if(view.getId()==R.id.PlusbtnID){
            operator = "+";
        }
        else if(view.getId()==R.id.MinusbtnID){
            operator = "-";
        }
        else if(view.getId()==R.id.MultiplybtnID){
            operator = "X";
        }
        else{
            operator = "/";
        }
        secondaryView.setText(""+primaruValue+" "+operator);
        primaryView.setText("0");
        number1 = Double.parseDouble(primaruValue);
    }

    public void ResultFunction(View view) {
        String primaryValue = primaryView.getText().toString();
        number2 = Double.parseDouble(primaryValue);

        if(operator.equals("+")){
            result = number1+number2;
        }
        else if(operator.equals("-")){
            result = number1-number2;
        }
        else if(operator.equals("X")){
            result = number1*number2;
        }
        else{
            result = number1/number2;
        }
        secondaryView.setText(number1+operator+number2+" ");
        primaryView.setText(""+result);
    }

    public void ClearFunction(View view) {

        if(view.getId()==R.id.CEbtnID){
            primaryView.setText("0");
        }
        else {
            secondaryView.setText("");
            primaryView.setText("0");
            number2 = 0.0;
            number1 = 0.0;
            result = 0.0;
            operator = "";
        }
    }

    public void OtherOperator(View view) {
        String primaryValue = primaryView.getText().toString();
        number1 = Double.parseDouble(primaryValue);
        if(view.getId()==R.id.OnebyXbtnID){
            result=1/number1;
            secondaryView.setText(1+"/"+"("+number1+")");
            primaryView.setText(""+result);
        }
        else if (view.getId()==R.id.XSquarebtnID){
            result=number1*number1;
            secondaryView.setText("Sqr("+number1+")");
            primaryView.setText(""+result);
        }
        else if (view.getId()==R.id.RootXbtnID){
            result=Math.sqrt(number1);
            secondaryView.setText("Sqrt("+number1+")");
            primaryView.setText(""+result);
        }
        else if (view.getId()==R.id.PercentagebtnID){
            result=number1/100;
            secondaryView.setText(number1+" %");
            primaryView.setText(""+result);
        }
        else {
            result=number1*(-1);
            secondaryView.setText("(-)"+number1);
            primaryView.setText(""+result);
        }
    }

    public void BackFunction(View view) {
        String value=primaryView.getText().toString();
        value=value.substring(0,value.length() -1);
        primaryView.setText(value);
    }
}