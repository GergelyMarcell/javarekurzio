import java.util.Scanner;

public class faktorialis {
    //faktorialis
    static int Fakt(int szam){
        if(szam > 1){
            return szam * Fakt(szam-1);
        }else return 1;
    }

    //hatvany
    static int Hatvany(int alap, int kitevo){
        if(kitevo > 0){
            return (alap * Hatvany(alap, kitevo -1));
        }
        else return 1;
    }

    //Fibonacci
    static int Fibonacci(int n){
        if(n == 1) return 0;
        else if(n == 2 || n == 3) return 1;
        else if(n > 3){
            return (Fibonacci(n-1) + Fibonacci(n-2));
        }
        else return n;
    }

    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a számot (fakt): ");
        int szam = sc.nextInt();
        System.out.println(Fakt(szam));

        System.out.println("Kérem a hatványalapot: ");
        int alap = sc.nextInt();
        System.out.println("Kérem a hatványkitevőt: ");
        int kitevo = sc.nextInt();
        System.out.println(Hatvany(alap,kitevo));

        System.out.println("Hanyadik fibonacci szám érdekel: ");
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }
}
