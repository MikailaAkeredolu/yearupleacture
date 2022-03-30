package dwonwithoop;

public class Shape {

    private double side; // state

    public void calcArea(){
        System.out.println("I don't know");
    }

    //getter
    public double getSide(){
        return this.side;
    }

    //setter
    public void setSide(double sidePassedInMain){
        this.side = sidePassedInMain;
    }



}
