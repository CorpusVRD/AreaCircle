package vrd.geometry;

public class Circle {

   protected double radius ;

    public Circle(double radius) {
        if (radius < 0){
            throw new RuntimeException("радиус меньше 0");
        }
        this.radius = radius;
    }

    public void setRadius(double setRadius) {
        if (setRadius < 0){
            throw new RuntimeException("радиус меньше 0");
        }
        this.radius = setRadius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

