package OOP;

import java.util.Scanner;



public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone arr[]=new SmartPhone[5];
        fillArray(arr);
        printAll(arr);
    }
    public static void fillArray( SmartPhone arr[]){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=new SmartPhone();
            System.out.println("Enter the brand(apple,samsung,generic)");
            arr[i].setBrand(s.next());
            System.out.println("Enter the storage(32,512,1024)");
            arr[i].setStorage(s.nextInt());
        }
    }
    
    
    public static void printAll(SmartPhone arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand()=="apple" && arr[i].getStorage()<=512){
                System.out.println(arr[i]);
            }
        }
    }
}
