package ru.netology.sqr.services;


import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        int x = 25;

        for (int i = 1; i <= x; i++) {
            if (i * i >= x) {
                System.out.println(" Квадратный корень " + x + " равен " + i);
                break;
            }
        }

        SQRService service = new SQRService();
        System.out.println(service.СountSquares(27));

        }
    }
