import java.util.Scanner;
public class exo4 {
    public static void main(String[] args){
        //scrieți un program pentru a inversa cifrele date
        System.out.println("Introduceti un numar:");
        int n = new Scanner(System.in).nextInt();
        int nTest = n;
        int cifra, nb_invers = 0;
        //cate cifre are nr;
        while (n != 0){
            cifra = n % 10;
            nb_invers = nb_invers*10 + cifra;
            n/=10;
        }
        System.out.println("Nr invers este "+nb_invers);

    }
}
