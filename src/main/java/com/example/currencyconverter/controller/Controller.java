package com.example.currencyconverter.controller;

import com.example.currencyconverter.parserjson.ParserJson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller extends ParserJson {
    private String firstValue;
    private String secondValue;
    private double value;
    private String valuteName;
    private long valuteNominal;
    private double secondValueValute;
    private String secondNameValute;
    private long secondNominalValute;

    public void conversionCurrency() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the currency to convert : ");

        firstValue = reader.readLine(); // ввод данных. получаем данные (вид валюты) от пользователя
        setCurrency(firstValue);//устанавливаем вид валюты для конвертации
        parser();
        value = (double) getValuteValue();//значение валюты
        valuteName = (String) getValuteName();//название валюты
        valuteNominal = (long) getValuteNominal();//номинал валюты
        System.out.println("Nominal : " + valuteNominal + " " + valuteName);
        System.out.println(value + " " + " rub.");

        secondValue = reader.readLine(); // получаем данные (вид валюты) от пользователя
        setCurrency(secondValue);//устанавливаем вид валюты для конвертации
        parser();
        secondValueValute = (double) getValuteValue();
        secondNameValute = (String) getValuteName();
        secondNominalValute = (long) getValuteNominal();
        System.out.println("Nominal : " + secondNominalValute + " " + secondNameValute);
        System.out.println(secondValueValute + " " + " rub.");

        System.out.println("end");

    }

    public String getFirsValue() {

        return firstValue;
    }

    public void setFirsValue(String firsValue) {

        this.firstValue = firsValue;
    }

    public String getSecondValue() {

        return secondValue;
    }

    public void setSecondValue(String secondValue) {

        this.secondValue = secondValue;
    }
}

class ControllerTest {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        controller.conversionCurrency();
    }
}

