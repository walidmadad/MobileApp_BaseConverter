package com.sio.convertisseur_base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity {

    private String valAconvert;
    public String getValAconvert(){
        return valAconvert;
    }
    public String getWhatConvertSelected(){
        RadioGroup r1 = findViewById(R.id.aConvertir);
        int id = r1.getCheckedRadioButtonId();
        String str = null;
        if(id != -1){
            RadioButton convertSelected = findViewById(id);
            str = convertSelected.getText().toString();
        }
        return str;
    }
    public String getToConvertSelected(){
        RadioGroup r1 = findViewById(R.id.ConventirEn);
        int id = r1.getCheckedRadioButtonId();
        String str = null;
        if(id != -1){
            RadioButton convertSelected = findViewById(id);
            str = convertSelected.getText().toString();
        }
        return str;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText valeur = (EditText) findViewById(R.id.nbrAconvertir);
        TextView result = (TextView) findViewById(R.id.txtResult);
        Button btn_convertir = (Button)findViewById(R.id.btnConvert);

        btn_convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valAconvert = valeur.getText().toString();
                valAconvert = valAconvert.replace(" ","");

                Comparation comp = new Comparation();
                result.setText(comp.Comparation(getWhatConvertSelected(), getToConvertSelected(), valAconvert));

            }
        });
    }
}
