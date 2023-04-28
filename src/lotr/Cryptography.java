package src.lotr;

import java.util.Base64;

/**
 *  Class : Cryptography
 *  Description : This class has function decryptKey which returns Access Key to process API calls.
 *  Author : Avinash Patil              Date : 27th Apr 2023
 */
public class Cryptography {
    public static String decryptKey(){
        byte[] keyByte = Base64.getDecoder().decode("U0tJU05aMXNIN21KYnpGYlQyczg=");
        return new String(keyByte);
    }
}
