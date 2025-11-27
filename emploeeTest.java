
public class emploeeTest {
    public static void main(String[] args) {
   emploee e1=new emploee();
   e1.name="omar";
   e1.basic=100;
   e1.allowncis=20;
   e1.detection=10;
   emploee e2=new emploee();
   e2.name="Ata";
   e2.basic=200;
   e2.allowncis=10;
   e2.detection=5;
        System.out.println(e1.getsalary());
        System.out.println(e2.getsalary());

           }
}


