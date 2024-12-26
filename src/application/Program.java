package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
             
        System.out.print("Sexo: ");
        char gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        int beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        int softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        int barbecue = sc.nextInt();
        System.out.println();
        
        Bill bill = new Bill(gender, beer, barbecue, softDrink);
        
             
        bill.printReport();
        sc.close();
    }
}
