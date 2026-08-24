package kite_day1;
import java.util.*;


public class Hackrank {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       
       int n=obj.nextInt();
       int a=5;
       
       
       for(int i=1;i<=n;i++){
        int c=a-i;
        for(int j=1;j<=i+1;j++){
            j=j+c;
            System.out.print(i);
           System.out.print(j);
           
        }
        System.out.println();
       }
    }
}