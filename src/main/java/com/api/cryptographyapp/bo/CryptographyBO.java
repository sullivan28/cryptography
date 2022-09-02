package com.api.cryptographyapp.bo;

public class CryptographyBO {
    public String encryptData(Integer Key, String data)
    {
        int i, n = data.length();
        String saux = "";

        for (i=0; i<n; i++) {
            saux = saux + (char)(data.charAt(i) + Key);
        }

        return(saux);
    }

    public String decryptData(Integer Key, String encryptedData)
    {
        int i, n = encryptedData.length();
        String saux = "";

        for (i=0; i<n; i++) {
            saux = saux + (char)(encryptedData.charAt(i) - Key);
        }

        return(saux);
    }





}
