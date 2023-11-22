package org.example;

public class OutputConsole {
    public void Output(Order order){
        System.out.println(String.format("\n clientName:" + order.getClientName() +
                "\n product:" + order.getProduct() +
                "\n qnt:" + order.getQnt() +
                "\n price:" + order.getPrice() +
                "\n *****"));
    }
}
