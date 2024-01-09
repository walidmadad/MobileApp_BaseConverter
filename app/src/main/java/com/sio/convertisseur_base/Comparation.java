package com.sio.convertisseur_base;

public class Comparation {

    private BaseSelected b1 = new BaseSelected();
    private String whatConvert = b1.getWhatConvertSelected();
    private String convertTo = b1.getToConvertSelected();
    private Convertion c = new Convertion();
    public String Comparation() {
        MainActivity m1 = new MainActivity();
        String num = m1.getValAconvert();
        if (whatConvert == "Binaire") {
            switch (convertTo){
                case "Binaire":
                    num = num;
                    break;
                case "Octale":
                    num = c.binaireToOctale(num);
                    break;
                case "Decimale":
                    num = c.binaireToDecimale(num);
                    break;
                case "Hexadecimale":
                    num = num;
                    break;
            }
        }
        if (whatConvert == "Octale") {
            switch (convertTo){
                case "Binaire":
                    num = num;
                    break;
                case "Octale":
                    num = num;
                    break;
                case "Decimale":
                    num = num;
                    break;
                case "Hexadecimale":
                    num = num;
                    break;
            }
        }
        if (whatConvert == "Decimale") {
            switch (convertTo){
                case "Binaire":
                    num = num;
                    break;
                case "Octale":
                    num = num;
                    break;
                case "Decimale":
                    num = num;
                    break;
                case "Hexadecimale":
                    num = num;
                    break;
            }
        }
        if (whatConvert == "Hexadecimale") {
            switch (convertTo){
                case "Binaire":
                    num = num;
                    break;
                case "Octale":
                    num = num;
                    break;
                case "Decimale":
                    num = num;
                    break;
                case "Hexadecimale":
                    num = num;
                    break;
            }
        }
        return num;
    }
}
