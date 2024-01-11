package com.sio.convertisseur_base;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
        else{
            str="nothing";
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
        else{
            str="nothing";
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
                if(getWhatConvertSelected().equals("Binaire") && TestInput.estBinaire(valAconvert) && !getToConvertSelected().equals("nothing")){
                    Comparation comp = new Comparation();
                    int blackColor = ContextCompat.getColor(result.getContext(), R.color.black);
                    result.setTextColor(blackColor);
                    result.setText(comp.Comparation(getWhatConvertSelected(), getToConvertSelected(), valAconvert));
                }
                else if(getWhatConvertSelected().equals("Octale") && TestInput.estOctale(valAconvert) && !getToConvertSelected().equals("nothing")){
                    Comparation comp = new Comparation();
                    int blackColor = ContextCompat.getColor(result.getContext(), R.color.black);
                    result.setTextColor(blackColor);
                    result.setText(comp.Comparation(getWhatConvertSelected(), getToConvertSelected(), valAconvert));
                }
                else if(getWhatConvertSelected().equals("Decimale") && TestInput.estDecimal(valAconvert) && !getToConvertSelected().equals("nothing")){
                    Comparation comp = new Comparation();
                    int blackColor = ContextCompat.getColor(result.getContext(), R.color.black);
                    result.setTextColor(blackColor);
                    result.setText(comp.Comparation(getWhatConvertSelected(), getToConvertSelected(), valAconvert));
                }
                else if(getWhatConvertSelected().equals("Hexadecimale") && TestInput.estHexadecimal(valAconvert) && !getToConvertSelected().equals("nothing")){
                    Comparation comp = new Comparation();
                    int blackColor = ContextCompat.getColor(result.getContext(), R.color.black);
                    result.setTextColor(blackColor);
                    result.setText(comp.Comparation(getWhatConvertSelected(), getToConvertSelected(), valAconvert));
                }
                else{
                    int redColor = ContextCompat.getColor(result.getContext(), R.color.red);
                    result.setTextColor(redColor);
                    result.setText("Invalid Input");
                }

            }
        });

    }
}


