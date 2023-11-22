package org.example;

public class Program {
    public static void main(String[] args) {

        Order order = new Order();
        InputConsole inputConsole = new InputConsole();
        OutputConsole outputConsole = new OutputConsole();
        SaveFileJson json = new SaveFileJson();
        inputConsole.inputFromConsole(order);
        OutputConsole console = new OutputConsole();
        console.Output(order);
        json.saveToJson(order);


    }
}
