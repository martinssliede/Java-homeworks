package io.codelex.Exercise_24_05;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Map;

public class CurrencyConverter {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        RatesResponse resp = mapper.readValue(new URL("https://api.exchangerate.host/latest"), RatesResponse.class);

        Map<String, BigDecimal> rates = resp.getRates();
        BigDecimal usdToEur = rates.get("EUR");
        System.out.println("USD to EUR exchange rate: " + usdToEur);
    }
}