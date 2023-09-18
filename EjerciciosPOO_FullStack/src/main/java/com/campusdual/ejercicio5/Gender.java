package com.campusdual.ejercicio5;

import java.security.PublicKey;

public enum Gender {
    MALE,
    FEMALE;

    public static Gender getByString(String genderName) {
        if ("m".equals(genderName.trim().toLowerCase())) {
            return FEMALE;
        } else if ("mujer".equals(genderName.trim().toLowerCase())) {
            return FEMALE;
        } else if ("hombre".equals(genderName.trim().toLowerCase())) {
            return MALE;
        } else if ("h".equals(genderName.trim().toLowerCase())) {
            return MALE;
        } else {
            return null;
        }
    }
}



