package vrd.geometry;public class Area extends Circle{

    protected double area;



    public Area(double radius, double area) {

        super(radius);
        if (area < 0){
            throw new RuntimeException("площадь меньше 0");
        }

        this.area = area;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
