package com.viiruzz.emergencygo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    public static String user;
    public Button button_mapa;
    public Button button_usuarios;
    public Button button_admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        button_usuarios = findViewById(R.id.button_user);
        button_mapa = findViewById(R.id.button_mapa);
        button_admin = findViewById(R.id.button_admin);

        button_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent re = new Intent(PrincipalActivity.this, MapsActivity.class);
                re.putExtra("Mapas", "");
                startActivity(re);
                Toast.makeText(getApplicationContext(), "Accediendo a Mapas", Toast.LENGTH_SHORT).show();
            }
        });

    }
}