package main.businessLogic;

import main.valueObjects.PaperSheet;

public class EarBottomCuttingPlan {
    private int quantity;
    private PaperSheet sliceSheet = new PaperSheet(0, 0);
    private PaperSheet sourcePaper = new PaperSheet(100, 70);
    private String logic;
    private Double variable1;
    private Double variable2;
    private Double sheetsQuantity = calculator();
    private String msg;


    public EarBottomCuttingPlan(PaperSheet paperSheet, int quantity) {
        this.sliceSheet = paperSheet;
        this.quantity = quantity;
    }

    public PaperSheet getSliceSheet() {
        return sliceSheet;
    }

    public void setSliceSheet(PaperSheet sliceSheet) {
        this.sliceSheet = sliceSheet;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double calculator() {
        variable1 = Math.floor(sourcePaper.getWidth() / sliceSheet.getWidth()) * Math.floor(sourcePaper.getHeight() / sliceSheet.getHeight());
        variable2 = Math.floor(sourcePaper.getWidth() / sliceSheet.getHeight()) * Math.floor(sourcePaper.getHeight() / sliceSheet.getWidth());

        logic = logicChooser();

        if (logic.equals("logic1")) {
            sheetsQuantity = quantity / variable1;
            msg = sourcePaper.getWidth() + " / " + sliceSheet.getWidth() + " | " + sourcePaper.getHeight() + " / " + sliceSheet.getHeight();
        } else {
            sheetsQuantity = quantity / variable2;
            msg = sourcePaper.getWidth() + " / " + sliceSheet.getHeight() + " | " + sourcePaper.getHeight() + " / " + sliceSheet.getWidth();
        }
        return sheetsQuantity;
    }

    private String logicChooser() {
        if (Math.ceil(variable1) >= Math.ceil(variable2)) {
            return "logic1";
        } else {
            return "logic2";
        }
    }

    private Double cuttedQuantity() {
        if (logic.equals("logic1")) {
            return Math.ceil(sheetsQuantity) * variable1;
        } else {
            return Math.ceil(sheetsQuantity) * variable2;
        }
    }
}
