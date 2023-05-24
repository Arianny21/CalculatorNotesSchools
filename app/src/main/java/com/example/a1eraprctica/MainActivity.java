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
                    resultado = "Es una A. ¡Muchas felicidades, sigue así!";
                } else if (nota >= 80 && nota < 90) {
                    resultado = "Es una B. ¡Muy bien, continua dando lo mejor de tí!";
                } else if (nota >= 70 && nota < 80) {
                    resultado = "Es una C. ¡Puedes hacerlo mejor!";
                } else {
                    resultado = "Es una F. ¡Esfuerzate más a la próxima!";
                }

                resultadoTextView.setText("Resultado: " + resultado);
            }
        });
    }
}
