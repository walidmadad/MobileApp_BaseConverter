package com.sio.convertisseur_base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText valeur = (EditText) findViewById(R.id.nbrAconvertir);

    private String valAconvert = valeur.getText().toString();
    public String getValAconvert(){
        return valAconvert;
    }
}
