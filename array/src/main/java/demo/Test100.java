package demo;

public class Test100 {

    public static void main(String[] args) {
        System.out.println(gcd(12,18));
        System.out.println(12%18);
    }

    public static int gcd(int p,int q){
        if(q == 0)  {
            return p;
        }
        return gcd(q, p % q);
    }
}
