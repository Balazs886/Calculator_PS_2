package main;

import static main.Main.scanner;

public class Scan {

    public int getMainMenu() {
        System.out.println("1. Táska méret kalkuláció" +
                "\n2. Fül / Talp kalkuláció");
        return userMenuInput(1,2);
    }

    protected int userMenuInput(int min, int max) {
        Integer userInput = null;
        do {
            if (userInput != null) {
                System.out.println("Helytelen értéket adtál meg!");
            }
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }



}
