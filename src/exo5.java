import java.util.Scanner;
public class exo5 {
    public static void main(String[] args){
        //scrieți un program pentru a verifica dacă un număr dat este prim sau nu
        System.out.println("Introduceti un nr:");
        int n = new Scanner(System.in).nextInt();
        int nb_div = 0; //aflam nr de divizori proprii
        for (int i = 2;i < n;i++){
            if (n % i == 0) nb_div++;
        }
        if ( (nb_div == 0 && (n!=0 && n!=1)) || (n == 2)){
            System.out.println(n+" este prim");
        }else{
            System.out.println(n+" nu este prim");
        }
    }
}
