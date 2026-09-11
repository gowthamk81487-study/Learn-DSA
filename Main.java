import java.util.*;

class Math{
    public int gcd(int a, int b){
        int r;
        while(b!=0){
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    public boolean oe(int n){
        boolean b = n%2==0?true:false;
        return b;
    }
    public int nsum(int n){
        return (n*(n+1))/2;
    }
    public void isprime(int n){
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                System.out.println(n+" is not a prime");
                return;
            }
        }
        System.out.println(n+" is a prime");
    }

}
public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Math m = new Math();
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("GCD of "+a+" and "+b+" is: "+m.gcd(a,b));
    System.out.println(a+" is even: "+m.oe(a));
    System.out.println("Sum of first "+a+" natural numbers is: "+m.nsum(a));
    m.isprime(a);
}
}