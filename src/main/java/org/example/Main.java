package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a LARGURA da página do álbum:");
        int X = scanner.nextInt(); // largura pagina
        System.out.println("Digite a ALTURA da página do álbum:");
        int Y = scanner.nextInt(); // altura pagina

        System.out.println("Digite a LARGURA da foto:");
        int L = scanner.nextInt(); // largura foto
        System.out.println("Digite a ALTURA da foto:");
        int H = scanner.nextInt(); // altura da foto

        String result = isPossible(X, Y, L, H);
        System.out.println(result);
    }

    public static String isPossible(int X, int Y, int L, int H) {
        if (2 * L <= X && H <= Y) {
            return "S";
        } else if (L <= X && 2 * H <= Y) {
            return "S";
        } else if(H+L <= Y || H+L<=X){
            return "S";
        }else{
            return "N";
        }
    }

}
