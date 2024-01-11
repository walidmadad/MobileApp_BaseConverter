package com.sio.convertisseur_base;

public class TestInput {
    public static boolean estBinaire(String val) {
        for (char c : val.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
    public static boolean estOctale(String input) {
        for (char c : input.toCharArray()) {
            if (c < '0' || c > '7') {
                return false;
            }
        }
        return true;
    }
    public static boolean estDecimal(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean estHexadecimal(String input) {
        try {
            Long.parseLong(input, 16);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
