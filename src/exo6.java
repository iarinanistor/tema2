import java.util.Scanner;
public class exo6 {
    public static void main(String[] args){
        //Scrieți un program pentru a face media aritmetică a N numere n (n sa fie introdus de la tastatura)
        System.out.println("Cate numere sa fie?\nN=");
        int N = new Scanner(System.in).nextInt();
        int n,i,s = 0;
        for (i = 1;i <= N;i++){
            System.out.println("nr:");
            n = new Scanner(System.in).nextInt();
            s+=n;
        }
        System.out.println("Media aritmetica este "+(s*1.0/N));
    }
}
