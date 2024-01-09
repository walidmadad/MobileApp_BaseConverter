package com.sio.convertisseur_base;
import static java.lang.Math.pow;
public class Convertion {
    String result;
    public String binaireToOctale(String numToConvert){
        int r = 0;
        String nbr = null;
        for(int i = numToConvert.length(); 0<i; i-=3){
            int count = 0;
            if(i == 3){nbr = String.valueOf(numToConvert.charAt(i-3) + numToConvert.charAt(i-2) + numToConvert.charAt(i-1));}
            else if(i == 2){nbr = String.valueOf(numToConvert.charAt(i-2) + numToConvert.charAt(i-1));}
            else if(i == 1){nbr = String.valueOf(numToConvert.charAt(i-1));}
            for(int j = nbr.length();0 < j; j--){
                if (nbr.charAt(j-1) == '1') {
                    r += (int) pow(2,count);
                    count++;
                }
                else{
                    count++;
                }
                if(count == 2){
                    count = 0;
                }
            }
        }
        result = String.valueOf(r);
        return result;
    }
    public String binaireToDecimale(String numToConvert/*1011*/){
        int r = 0;
        int count = 0;
        for(int i = numToConvert.length();0 < i; i--){
            if (numToConvert.charAt(i-1) == '1') {
                r += (int) pow(2,count);
                count++;
            }
            else{
                count++;
            }
        }
        result = String.valueOf(r);
        return result;
    }
}
