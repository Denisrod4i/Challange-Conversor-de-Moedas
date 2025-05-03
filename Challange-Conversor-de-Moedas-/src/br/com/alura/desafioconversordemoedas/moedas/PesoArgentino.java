package br.com.alura.desafioconversordemoedas.moedas;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PesoArgentino {
    String montante = "";
    Scanner leitura = new Scanner(System.in);
    public void converterPesoArgentinoDolar (){
        System.out.println("Digite quanto quer converter: ");
        montante = leitura.nextLine();
        URI moeda = URI.create(" https://v6.exchangerate-api.com/v6/be4ffb60db4051aeb794b8d9/par/ARS/USD " + montante);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(moeda)))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moeda moeda1 = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("O valor de " + montante + " pesos argentinos convertido para dolares é de " + moeda1.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a moeda.");
        }
    }

    public void converterPesoArgentinoReal (){
        System.out.println("Digite quanto quer converter: ");
        montante = leitura.nextLine();
        URI moeda = URI.create(" https://v6.exchangerate-api.com/v6/be4ffb60db4051aeb794b8d9/par/ARS/BRL " + montante);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(moeda)))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moeda moeda1 = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("O valor de " + montante + "pesos argentinos convertido para reais é de " + moeda1.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a moeda.");
        }
    }

    public void converterPesoArgentinoBolivianoBoliviano (){
        System.out.println("Digite quanto quer converter: ");
        montante = leitura.nextLine();
        URI moeda = URI.create(" https://v6.exchangerate-api.com/v6/be4ffb60db4051aeb794b8d9/par/ARS/BOB " + montante);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(moeda)))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moeda moeda1 = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("O valor de " + montante + " pesos argentinos convertido para boliviano boliviano é de " + moeda1.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a moeda.");
        }
    }

    public void converterPesoArgentinoPesoColombiano (){
        System.out.println("Digite quanto quer converter: ");
        montante = leitura.nextLine();
        URI moeda = URI.create(" https://v6.exchangerate-api.com/v6/be4ffb60db4051aeb794b8d9/par/ARS/COP " + montante);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(moeda)))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moeda moeda1 = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("O valor de " + montante + " peso argentino convertido para peso colombiano é de " + moeda1.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a moeda.");
        }
    }

    public void converterPesoArgentinoPesoChileno (){
        System.out.println("Digite quanto quer converter: ");
        montante = leitura.nextLine();
        URI moeda = URI.create(" https://v6.exchangerate-api.com/v6/be4ffb60db4051aeb794b8d9/par/ARS/CLP " + montante);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(moeda)))
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moeda moeda1 = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("O valor de " + montante + " peso argentino convertido para peso chileno é de " + moeda1.conversion_result());
        } catch (Exception e) {
            throw new RuntimeException("Não consegui converter a moeda.");
        }
    }

}
