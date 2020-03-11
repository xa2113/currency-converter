package com.eileen.currencyconverter.logic.api;

import com.eileen.currencyconverter.logic.models.CurrencyDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnection {

    public static CurrencyDTO sendGet() throws Exception {
        URL url = new URL("https://api.exchangeratesapi.io/latest");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");

        con.setRequestProperty("Content-Type", "application/json");
        String contentType = con.getHeaderField("Content-Type");

        //5 hours
        int timeInterval = 5000 * 12 * 60 * 5;
        con.setConnectTimeout(timeInterval);
        con.setReadTimeout(timeInterval);

        int status = con.getResponseCode();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        //System.out.println(response.toString());

        ObjectMapper objectMapper = new ObjectMapper();

        CurrencyDTO currencyDTO = objectMapper.readValue(response.toString(), CurrencyDTO.class);

        return currencyDTO;
    }


}
