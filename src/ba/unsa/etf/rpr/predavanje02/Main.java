package ba.unsa.etf.rpr.predavanje02;
import java.util.Scanner;
public class Main {
    public static int sumaCifara(int n){
        int sumaCifara = 0;
        if(n == 0)sumaCifara = 1;
        while(n != 0) {
            int cifra = n % 10;
            sumaCifara += cifra;
            n /= 10;

        }
        return sumaCifara;
    }
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = unos.nextInt();
        for(int i = 2; i < n; i++){
            if(i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
}
