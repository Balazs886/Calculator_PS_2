package main;

import main.businessLogic.BusinessLogic;
import main.valueObjects.Value;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scan scan = new Scan();
        Value values = new Value();

        System.out.println("Üdvözöllek a PrintSoftverben.");
        System.out.println("Válassz egy opciót:");
        values.setMainMenuUserChoice(scan.getMainMenu());
        BusinessLogic.getSecondLevelMenu(values.getMainMenuUserChoice());



        scanner.close();
    }
}
