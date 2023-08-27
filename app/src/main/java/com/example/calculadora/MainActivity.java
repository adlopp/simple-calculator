package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;

    double numeroUno = 0.0;
    double numeroDos = 0.0;
    double resultado = 0.0;
    boolean sumar = false;
    boolean restar = false;
    boolean masmenos = false;
    boolean multiplicar = false;
    boolean dividir = false;
    boolean porcentaje = false;

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt10;
    Button bt11;
    Button bt12;
    Button bt13;
    Button bt14;
    Button bt15;
    Button bt16;
    Button bt17;
    Button bt18;
    Button bt19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        bt10 = findViewById(R.id.bt10);
        bt11 = findViewById(R.id.bt11);
        bt12 = findViewById(R.id.bt12);
        bt13 = findViewById(R.id.bt13);
        bt14 = findViewById(R.id.bt14);
        bt15 = findViewById(R.id.bt15);
        bt16 = findViewById(R.id.bt16);
        bt17 = findViewById(R.id.bt17);
        bt18 = findViewById(R.id.bt18);
        bt19 = findViewById(R.id.bt19);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("");
                tv2.setText("");
            }
        });

        //CAMBIAR SIGNO
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("")){
                    return;
                }
                numeroUno = Double.valueOf(tv1.getText().toString());

                if(numeroUno != 0.0){
                    masmenos = true;
                    numeroUno = numeroUno * -1;
                    tv1.setText(String.valueOf(numeroUno));
                }
            }
        });

        //PORCENTAJE
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("")){
                    return;
                }
                numeroUno = Double.valueOf(tv1.getText().toString());

                if(numeroUno != 0.0){
                    porcentaje = true;
                    tv2.setText(tv1.getText() + "%");
                    tv1.setText("0");
                }
            }
        });

        //DIVISIÓN
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("")){
                    return;
                }

                numeroUno = Double.valueOf(tv1.getText().toString());


                if(numeroUno != 0.0){
                    dividir = true;
                    tv2.setText(tv1.getText() + "÷");
                    tv1.setText("0");
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("7");
                }else{
                    tv1.setText(tv1.getText() + "7");
                }
            }

        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("8");
                }else{
                    tv1.setText(tv1.getText() + "8");
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("9");
                }else{
                    tv1.setText(tv1.getText() + "9");
                }
            }
        });

        //MULTIPLICAR
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("")){
                    return;
                }

                numeroUno = Double.valueOf(tv1.getText().toString());


                if(numeroUno != 0.0){
                    multiplicar = true;
                    tv2.setText(tv1.getText() + "x");
                    tv1.setText("0");
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("4");
                }else{
                    tv1.setText(tv1.getText() + "4");
                }
            }
        });

        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("5");
                }else{
                    tv1.setText(tv1.getText() + "5");
                }
            }
        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("6");
                }else{
                    tv1.setText(tv1.getText() + "6");
                }
            }
        });

        //RESTAR
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("")){
                    return;
                }

                numeroUno = Double.valueOf(tv1.getText().toString());

                if(numeroUno != 0){
                    restar = true;
                    tv2.setText(tv1.getText() + "-");
                    tv1.setText("0");
                }
            }
        });

        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("1");
                }else{
                    tv1.setText(tv1.getText() + "1");
                }
            }
        });

        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("2");
                }else{
                    tv1.setText(tv1.getText() + "2");
                }
            }
        });

        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    tv1.setText("3");
                }else{
                    tv1.setText(tv1.getText() + "3");
                }
            }
        });

        //SUMA
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("")){
                    return;
                }

                numeroUno = Double.valueOf(tv1.getText().toString());

                if(numeroUno != 0){
                    sumar = true;
                    tv2.setText(tv1.getText() + "+");
                    tv1.setText("0");
                }
            }
        });

        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("0")){
                    return;
                }else{
                    tv1.setText(tv1.getText() + "0");
                }
            }
        });

        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("")){ //si encuentra caracter vacío
                    tv1.setText("0.");
                    return;
                }

                if(tv1.getText().toString().contains(".")){
                    return;
                }else{
                    tv1.setText((tv1.getText().toString()) + ".");
                }
            }
        });

        //IGUAL
        bt19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(tv1.getText().toString().equals("")){
                    return;
                }

                numeroDos = Double.valueOf(tv1.getText().toString());
                tv2.setText(tv2.getText() + tv1.getText().toString() + "=");
                if(sumar == true){
                    tv1.setText(String.valueOf(numeroUno + numeroDos));
                    sumar = false;
                }else if(restar == true) {
                    tv1.setText(String.valueOf(numeroUno - numeroDos));
                    restar = false;
                }else if(multiplicar == true){
                    tv1.setText(String.valueOf(numeroUno * numeroDos));
                    multiplicar = false;
                }else if(dividir == true){
                    if(numeroDos == 0){
                        tv1.setText("0");
                    }else {
                        tv1.setText(String.valueOf(numeroUno / numeroDos));
                    }
                    dividir = false;
                }else if(porcentaje == true){
                    tv1.setText(String.valueOf((numeroUno * numeroDos) / 100));
                    porcentaje = false;
                }
            }
        });
    }
}