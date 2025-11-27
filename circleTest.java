public class circleTest {
    public static void main(String[] args) {
      circle circles[]=new circle[10];
       //circle c1=new circle(5);
        //System.out.println(c1.getArea());
        //System.out.println(c1.getAround());
        for(int i=0;i<circles.length;i++){
        circles[i]=new circle(i+1);
        System.out.println(circles[i].getArea());
        System.out.println(circles[i].getAround());

        }
       for(int i=0;i<circles.length;i++){
           System.out.println(circles[i].getRad());
       }
        
    }
}
 