package dwonwithoop;

public class Rectangle extends Shape{

    private double length;

    @Override
    public void calcArea(){
        System.out.println(  getSide() * this.length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



}
