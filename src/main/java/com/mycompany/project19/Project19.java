package com.mycompany.project19;
import java.util.Scanner;

public class Project19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase de exemplo: ");
        String frase = in.nextLine();
        System.out.println("Digite o número de vezes que esta frase deve se repetir: ");
        int repeticoes = in.nextInt();
        for(int i = 0; i < repeticoes; i++){
            System.out.println(frase);
        }
    }
}
