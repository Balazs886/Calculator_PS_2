package main.valueObjects;

public class PaperSheet {
    private final double width;
    private final double height;

    public PaperSheet(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
