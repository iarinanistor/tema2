import java.util.Scanner;
public class exo2 {
    public static void main(String[] args){
        /*Scrieți un program pentru a găsi suma tuturor numerelor naturale
        între 1 și n (n sa fie introdus de la tastatura)*/
        System.out.println("Introduceti un nr\nn=");
        int n = new Scanner(System.in).nextInt();
        int i,s = 0;
        for (i = 1;i <= n;i++){
            s+=i;
        }
        System.out.println("Suma este "+s);
    }
}
