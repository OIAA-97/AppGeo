package com.example.aplicaciongeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtX1;
    private EditText editTxtX2;
    private EditText editTxtY1;
    private EditText editTxtY2;
    private Button btncalcular;
    private Button btnCalPendiente;
    private EditText editTxtdistanciar;
    private EditText editTxtpendiente;

    public void Iniciar(){
        editTxtX1 = (EditText)findViewById(R.id.editTxtX1);
        editTxtX2 = (EditText)findViewById(R.id.editTxtX2);
        editTxtY1 = (EditText)findViewById(R.id.editTxtY1);
        editTxtY2 = (EditText)findViewById(R.id.editTxtY2);
        editTxtdistanciar = (EditText)findViewById(R.id.editTxtdistanciar);
        editTxtpendiente = (EditText)findViewById(R.id.editTxtpendiente);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
            }
        });

        btnCalPendiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pendiente();
            }
        });

    }

    private void calcular(){
        double X1 = Double.parseDouble(editTxtX1.getText().toString());
        double X2 = Double.parseDouble(editTxtX1.getText().toString());
        double Y1 = Double.parseDouble(editTxtX1.getText().toString());
        double Y2 = Double.parseDouble(editTxtX1.getText().toString());

        double distanciar = Math.sqrt(Math.pow(X2-X1,2) + Math.pow(Y2-Y1,2));
        editTxtdistanciar.setText(String.valueOf(distanciar));

    }

    private void pendiente() {
        double X1 = Double.parseDouble(editTxtX1.getText().toString());
        double X2 = Double.parseDouble(editTxtX2.getText().toString());
        double Y1 = Double.parseDouble(editTxtY1.getText().toString());
        double Y2 = Double.parseDouble(editTxtY2.getText().toString());

        double pendiente = ((Y2-Y1) / (X2-X1));
        editTxtpendiente.setText(String.valueOf(pendiente));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Iniciar();
    }
}

