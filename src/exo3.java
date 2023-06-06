import java.util.Scanner;
public class exo3 {
    public static void main(String[] args){
        //Scrieți un program pentru a afla valoarea unui număr ridicat la puterea altuia
        System.out.println("Introdu numarul:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Introdu exponentul:");
        int e = new Scanner(System.in).nextInt();
        int j,p = 1;
        for (j = 1;j <= e;j++){
            p*=n;
        }
        System.out.println("Rezultatul este "+p);
    }
}
