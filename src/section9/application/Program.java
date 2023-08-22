package section9.application;

import section9.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // apenas um aula de vetores onde voce coloca o tamanho de vetor, e logo apos isso, coloca o nome do produto e o preco
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Product [] vect = new Product[n];

        for (int i=0; i<vect.length; i++) {
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.println("AVERAGE PRICE = %.2f%n" + avg);
        scan.close();
    }
}
