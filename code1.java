import java.util.*;
public class code1{

    static int fact(int a){
            int factorial=1;
            for(int i=a;i>=1;i--){
                factorial=factorial*(i);
            }
            return factorial;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int a=fact(n);
        System.out.println("the factorial of "+n+" is :"+a);

    }
}