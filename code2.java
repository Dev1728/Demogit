import java.util.*;
public class code2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number :");
        int n=sc.nextInt();
        int factor=0;
        if(n==1 ||n==0){
            System.out.println("Given number is not prime no:"+n);
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
            factor++;
            }
        }
        if(factor>2){
            System.out.println("give no is prime:"+n);
        }
        else{
            System.out.println("Given number not prime no :"+n);
        }
    }
}
