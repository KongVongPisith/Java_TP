package KONG_VONGPISITH_TP07.Exercise01;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculatePerimeter() {
        return (width + height) * 2;
    }

    public int calculateSurface() {
        return width + height;
    }
}
