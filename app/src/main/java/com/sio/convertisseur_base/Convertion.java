package com.sio.convertisseur_base;
import static java.lang.Math.pow;
public class Convertion {
    public String binaireToOctale(String numToConvert){
        int number = Integer.parseInt(numToConvert, 2);
        String result = Integer.toOctalString(number);
        return result;
    }
    public String binaireToDecimale(String numToConvert){
        int number = Integer.parseInt(numToConvert, 2);
        String result = String.valueOf(number);
        return result;
    }
    public String binaireToHexadecimal(String numToConvert){
        int number = Integer.parseInt(numToConvert, 2);
        String result = Integer.toHexString(number);
        return result;
    }
    public String octalToBinaire(String numToConvert){
        int number = Integer.parseInt(numToConvert, 8);
        String result = Integer.toBinaryString(number);
        return result;
    }
    public String octalToDecimal(String numToConvert){
        int number = Integer.parseInt(numToConvert, 8);
        String result = String.valueOf(number);
        return result;
    }
    public String octalToHexadecimal(String numToConvert){
        int number = Integer.parseInt(numToConvert, 8);
        String result = Integer.toHexString(number);
        return result;
    }
    public String decimalToBinaire(String numToConvert) {
        int number = Integer.parseInt(numToConvert);
        String result = Integer.toBinaryString(number);
        return result;
    }

    public String decimalToOctal(String numToConvert) {
        int number = Integer.parseInt(numToConvert);
        String result = Integer.toOctalString(number);
        return result;
    }

    public String decimalToHexadecimal(String numToConvert) {
        int number = Integer.parseInt(numToConvert);
        String result = Integer.toHexString(number);
        return result;
    }
    public String hexadecimalToBinaire(String numToConvert){
        int number = Integer.parseInt(numToConvert, 16);
        String result = Integer.toBinaryString(number);
        return result;
    }
    public String hexadecimalToOctal(String numToConvert){
        int number = Integer.parseInt(numToConvert, 16);
        String result = Integer.toOctalString(number);
        return result;
    }
    public String hexadecimalTodecimal(String numToConvert){
        int number = Integer.parseInt(numToConvert, 16);
        String result = String.valueOf(number);
        return result;
    }
}
