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
    public int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
    public boolean isdiv13(String n){
        int a = Integer.parseInt(n);
        if(a%13==0){
            return true;
        }
        return false;
    }
    public double sqroot(int n){
        int sr=0;
        for(int i=1;i<=n/2;i++){
            if(n/i==i){
                sr = i;
                break;
            }
        }
        return sr;
}
}
public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Math m = new Math();
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("GCD of "+a+" and "+b+" is: "+m.gcd(a,b));
    System.out.println("LCM of "+a+" and "+b+" is: "+m.lcm(a,b));
    int k = sc.nextInt();
    System.out.println(k+" is even: "+m.oe(k));
    System.out.println("Sum of first "+k+" natural numbers is: "+m.nsum(k));
    m.isprime(k);
    System.out.println("Square root of "+k+" is: "+m.sqroot(k));
    String n = sc.next();
    System.out.println(n+" is divisible by 13: "+m.isdiv13(n));
}
}