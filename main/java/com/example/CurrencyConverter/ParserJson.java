package com.example.CurrencyConverter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;


public class ParserJson extends CurrencyProperties {
    public static void main(String[] args) throws IOException {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:\\daily_json.js"));
            JSONObject jsonObject = (JSONObject) obj;
            String date = (String) jsonObject.get("Date");
            System.out.println("Date is: " + date);
//            String previousDate = (String) jsonObject.get("PreviousDate");
//            System.out.println("PreviousDate is: " + previousDate);
//            String previousURL = (String) jsonObject.get("PreviousURL");
//            System.out.println("PreviousURL is: " + previousURL);
//            String timestamp = (String) jsonObject.get("Timestamp");
//            System.out.println("Timestamp is: " + timestamp);
            JSONObject valute = (JSONObject) jsonObject.get("Valute");
            JSONObject aud = (JSONObject) valute.get("AUD");
            Object audName = aud.get("Name");
            Object audValue = aud.get("Value");
            Object audPrevious = aud.get("Previous");
            System.out.print(audName);
            System.out.print(" "+audValue+" today");
            System.out.println(" "+audPrevious+" yestoday");

        } catch (ClassCastException e) {
            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}