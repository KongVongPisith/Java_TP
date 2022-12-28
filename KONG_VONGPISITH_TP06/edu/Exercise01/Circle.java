package KONG_VONGPISITH_TP06.edu.Exercise01;

public class Circle {
    private Point center;
    private Point p;

    public Circle(Point center, Point p) {
        this.center = center;
        this.p = p;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        if (center != null) {
            this.center = center;
        } else {
            System.out.println("ERROR: center couldn't be null");
        }
    }

    public Point getP() {
        return p;
    }

    public void setp(Point p) {
        this.p = p;
    }

    public double length() {
        double length = 0;
        length = 2 * Math.PI * center.distance(center, p);
        return length;
    }

    public double radius() {
        double radius = 0;
        radius = center.distance(center, p);
        return radius;
    }

    public double surface() {
        double surface = 0;
        surface = Math.PI * radius() * radius();
        return surface;

    }

}
