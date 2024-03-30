import java.util.*;
public class code3 {
    static void AreaOfCirle(double radius){
        double area=3.142*(radius*radius);
        System.out.println("The area of circle is :"+area+" sqcm");
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of cicle:");
        double radius=sc.nextDouble();
        AreaOfCirle(radius);
    }
}
