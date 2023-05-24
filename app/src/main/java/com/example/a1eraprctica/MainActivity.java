package com.example.a1eraprctica;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText notaEditText;
    private Button convertirButton;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notaEditText = findViewById(R.id.notaEditText);
        convertirButton = findViewById(R.id.convertirButton);
        resultadoTextView = findViewById(R.id.resultadoTextView);

        convertirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String notaStr = notaEditText.getText().toString();
                int nota = Integer.parseInt(notaStr);

                String resultado;

                if (nota >= 90 && nota <= 100) {
                    resultado = "A";
                } else if (nota >= 80 && nota < 90) {
                    resultado = "B";
                } else if (nota >= 70 && nota < 80) {
                    resultado = "C";
                } else {
                    resultado = "F";
                }

                resultadoTextView.setText("Resultado: " + resultado);
            }
        });
    }
}
