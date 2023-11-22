package org.example;

import java.util.Scanner;

public class InputConsole {


    private Scanner scanner = new Scanner(System.in);
    public void inputFromConsole(Order order){
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
