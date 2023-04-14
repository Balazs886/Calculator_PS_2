package main.businessLogic;

public class BusinessLogic {

    public static void getSecondLevelMenu(int choice) {
        switch (choice) {
            case 1:
                paperBagSheetCalcFunction();
                break;
            case 2:
                earBottomFunction();
                break;
            default:
                System.out.println("Something went wrong.");
        }
    }

    protected static void earBottomFunction() {
        System.out.println("EarBottom menu run");
        EarBottomCuttingPlan earBottomCuttingPlan = new EarBottomCuttingPlan();

    }

    protected static void paperBagSheetCalcFunction() {
        System.out.println("paper bag sheet calc menu run");
    }
}
