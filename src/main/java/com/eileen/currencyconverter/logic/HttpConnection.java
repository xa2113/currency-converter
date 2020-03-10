package com.eileen.currencyconverter.logic;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnection {

    public static void sendGet() throws Exception {
        URL url = new URL("https://api.exchangeratesapi.io/latest?base=USD");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");

    }

}
