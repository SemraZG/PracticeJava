package practice04;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
        Scanner input=new Scanner(System.in);
        System.out.println("Fahrenheit cinsinden sicaklik degerini giriniz");
        double fahrenheit= input.nextDouble();

        double c=fahrenheitToCelsius(fahrenheit);
        System.out.println(c);
        //main method içinden kısa yoldan method olustururken;
        //1. methoda verecegimiz ismi yazıyoruz--size kalmıs-- methodlar kucuk harfle baslar
        //2. method parantezi
        //3. method parantezinin içine metjoda gondermek istediginiz variable(arguman) yazın
        //4. create method secenegine tıklayın
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // formül: c = (f-32)/1.8
        double celsious=(fahrenheit-32)/1.8;
        return celsious;
    }
}
