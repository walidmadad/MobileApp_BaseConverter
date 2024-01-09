package com.sio.convertisseur_base;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class BaseSelected extends AppCompatActivity {
    public String getWhatConvertSelected(){
        RadioGroup r1 = findViewById(R.id.aConvertir);
        int id = r1.getCheckedRadioButtonId();

        RadioButton convertSelected = findViewById(id);
        return convertSelected.getText().toString();
    }
    public String getToConvertSelected(){
        RadioGroup r1 = findViewById(R.id.ConventirEn);
        int id = r1.getCheckedRadioButtonId();

        RadioButton convertSelected = findViewById(id);
        return convertSelected.getText().toString();
    }

}
