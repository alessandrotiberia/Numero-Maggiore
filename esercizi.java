import java.util.Scanner;

public class esercizi {
    public static void main(String[] args) {
        //Scrivi un programma Java che prende due numeri da tastiera e stampa quello è più grande.
        
        Scanner sc= new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("inserisci numero1: ");
        numero1=sc.nextInt();
        System.out.println("inserisci numero2: ");
        numero2=sc.nextInt();

        if (numero1>numero2) {
                    System.out.println("numero più grande è: " + numero1);
        }else 
        System.out.println("numero più grande è:" + numero2);

        sc.close();
    }
}
