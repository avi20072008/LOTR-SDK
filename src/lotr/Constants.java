package src.lotr;

/**
 *  Class : Constants
 *  Description : This file contains all constants
 *  Author : Avinash Patil              Date : 27th Apr 2023
 */
public class Constants {
    static final String BASE_URL = "https://the-one-api.dev/v2";
    static String AUTH_TOKEN = Cryptography.decryptKey();
}
