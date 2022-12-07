package com.android.apptrial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int number;
    private double numberOperation;
    private TextView tV;
    int idLastPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV = (TextView) findViewById(R.id.vistaTexto);

        Button deleteBtn = findViewById(R.id.delete);
        Button multBtn = findViewById(R.id.mult);
        Button introBtn = findViewById(R.id.resultado);
        Button restBtn = findViewById(R.id.rest);
        Button sumBtn = findViewById(R.id.sum);
        Button divBtn = findViewById(R.id.div);


        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st = (String) tV.getText();
                if(st.equals("") || st.equals("0")){
                    tV.setText("");
                }else{
                    String newSt = st.substring(0,st.length() - 1);
                    tV.setText(newSt);
                }

            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberTxt = String.valueOf(tV.getText());
                if(!(numberTxt.equals(""))){
                    number = Integer.parseInt(String.valueOf(tV.getText()));
                    tV.setText("");
                    idLastPressed = R.id.mult;
                }

            }
        });

        restBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberTxt = String.valueOf(tV.getText());
                if(!(numberTxt.equals(""))){
                    number = Integer.parseInt(String.valueOf(tV.getText()));
                    tV.setText("");
                    idLastPressed = R.id.rest;
                }

            }
        });

        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberTxt = String.valueOf(tV.getText());
                if(!(numberTxt.equals(""))){
                    number = Integer.parseInt(String.valueOf(tV.getText()));
                    tV.setText("");
                    idLastPressed = R.id.sum;
                }

            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberTxt = String.valueOf(tV.getText());
                if(!(numberTxt.equals(""))) {
                    number = Integer.parseInt(numberTxt);
                    tV.setText("");
                    idLastPressed = R.id.div;
                }
            }
        });

        introBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberTxt = String.valueOf(tV.getText());
                if(!(numberTxt.equals(""))){
                    int number2 = Integer.parseInt(String.valueOf(numberTxt));
                    int resultado;

                    switch (idLastPressed){
                        case R.id.mult:
                            resultado = number * number2;
                            tV.setText(Integer.toString(resultado));
                            break;

                        case R.id.rest:
                            resultado = number - number2;
                            tV.setText(Integer.toString(resultado));
                            break;

                        case R.id.sum:
                            resultado = number + number2;
                            tV.setText(Integer.toString(resultado));
                            break;

                        case R.id.div:
                            resultado = number / number2;
                            tV.setText(Integer.toString(resultado));
                            break;
                    }
                }

            }
        });

    }

    public void showMessage(View view){
        tV.setText("Adios");
    }

    public void onClick(View view) {
        int id = view.getId();
        String st = (String) tV.getText();

        switch (id){
            case R.id.number1:
                tV.setText(st+"1");
                break;

            case R.id.number2:
                tV.setText(st+"2");
                break;

            case R.id.number3:
                tV.setText(st+"3");
                break;

            case R.id.number4:
                tV.setText(st+"4");
                break;

            case R.id.number5:
                tV.setText(st+"5");
                break;

            case R.id.number6:
                tV.setText(st+"6");
                break;

            case R.id.number7:
                tV.setText(st+"7");
                break;

            case R.id.number8:
                tV.setText(st+"8");
                break;

            case R.id.number9:
                tV.setText(st+"9");
                break;

            case R.id.number0:
                if(!(st.equals("0")))
                tV.setText(st+"0");
                break;
        }
    }

}