package com.example.CurrencyConverter.HttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLInput {

    public void getValue() throws IOException {
        URL url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        StringBuilder sb = new StringBuilder();
        while ((inputLine = in.readLine()) != null) sb.append(inputLine);
        in.close();
        System.out.println(sb);
//        прописать сохранение в файл для дальнейшего парсинга или парсить с потока?
    }
}

