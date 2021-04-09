package com.example.currencyconverter.controller;

import com.example.currencyconverter.parserjson.ParserJson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller extends ParserJson {
    private String firstValue;
    private String secondValue;
    private double valueController;
    private String valuteNameController;
    private long valuteNominalController;
    private double secondValueValuteController;
    private String secondNameValuteController;
    private long secondNominalValuteController;

    public void conversionCurrency() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the currency to convert : ");

        firstValue = reader.readLine(); // ввод данных. получаем данные (вид валюты) от пользователя
        setCurrency(firstValue);//устанавливаем вид валюты для конвертации
        parser();
        valueController = (double) getValuteValue();//значение валюты
        valuteNameController = (String) getValuteName();//название валюты
        valuteNominalController = (long) getValuteNominal();//номинал валюты
        System.out.println("Nominal : " + valuteNominalController + " " + valuteNameController);
        System.out.println(valueController + " " + " rub.");

        secondValue = reader.readLine(); // получаем данные (вид валюты) от пользователя
        setCurrency(secondValue);//устанавливаем вид валюты для конвертации
        parser();
        secondValueValuteController = (double) getValuteValue();
        secondNameValuteController = (String) getValuteName();
        secondNominalValuteController = (long) getValuteNominal();
        System.out.println("Nominal : " + secondNominalValuteController + " " + secondNameValuteController);
        System.out.println(secondValueValuteController + " " + " rub.");

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

    public long secondNominalValuteController() {
        return secondNominalValuteController;
    }

    public long getValuteNominalController() {
        return valuteNominalController;
    }
}

class ControllerTest {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        controller.conversionCurrency();
    }
}

