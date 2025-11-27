
import java.util.Scanner;

public class circle {
    private int rad;

    public circle(int rad) {
        this.rad = rad;
    }

    public circle() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius:");
        rad=in.nextInt();
    }

    public double getArea(){
        double area=rad*rad*Math.PI;
        return area;
    }
    public double getAround(){
        double round=2*Math.PI*rad;
        return round;
    }
    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    @Override
    public String toString() {
       
        return "circle{" + "rad=" + rad + '}';
    }
    
}
