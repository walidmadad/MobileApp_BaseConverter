package com.sio.convertisseur_base;

public class Comparation {


    public String Comparation(String whatConvert1, String convertTo1, String ValAconvert) {
        String whatConvert = whatConvert1;
        String convertTo = convertTo1;
        String num = ValAconvert;
        Convertion c = new Convertion();
        if (whatConvert.equals("Binaire")) {

            if(convertTo.equals("Binaire")) {
                num = num;
            }
            else if(convertTo.equals("Octale")) {
                num = c.binaireToOctale(num);
            }
            else if(convertTo.equals("Decimale")) {
                num = c.binaireToDecimale(num);
            }
            else if(convertTo.equals("Hexadecimale")) {
                num = c.binaireToHexadecimal(num);
            }
        }
        if (whatConvert.equals("Octale")) {

            if(convertTo.equals("Binaire")) {
                num = c.octalToBinaire(num);
            }
            else if(convertTo.equals("Octale")) {
                num = num;
            }
            else if(convertTo.equals("Decimale")) {
                num = c.octalToDecimal(num);
            }
            else if(convertTo.equals("Hexadecimale")) {
                num = c.octalToHexadecimal(num);
            }
        }
        if (whatConvert.equals("Decimale")) {

            if(convertTo.equals("Binaire")) {
                num = c.decimalToBinaire(num);
            }
            else if(convertTo.equals("Octale")) {
                num = c.decimalToOctal(num);
            }
            else if(convertTo.equals("Decimale")) {
                num = num;
            }
            else if(convertTo.equals("Hexadecimale")) {
                num = c.decimalToHexadecimal(num);
            }
        }
        if (whatConvert.equals("Hexadecimale")) {

            if(convertTo.equals("Binaire")) {
                num = c.hexadecimalToBinaire(num);
            }
            else if(convertTo.equals("Octale")) {
                num = c.hexadecimalToOctal(num);
            }
            else if(convertTo.equals("Decimale")) {
                num = c.hexadecimalTodecimal(num);
            }
            else if(convertTo.equals("Hexadecimale")) {
                num = num;
            }
        }
        return num;
    }
}
