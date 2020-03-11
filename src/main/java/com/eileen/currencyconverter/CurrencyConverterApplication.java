package com.eileen.currencyconverter;

import com.eileen.currencyconverter.logic.api.HttpConnection;
import com.eileen.currencyconverter.logic.models.CurrencyDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrencyConverterApplication {

	public static void main(String[] args) {

		HttpConnection httpConnection = new HttpConnection();

		try {
			CurrencyDTO currencyDTO = httpConnection.sendGet();
			currencyDTO.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		SpringApplication.run(CurrencyConverterApplication.class, args);
	}

}
