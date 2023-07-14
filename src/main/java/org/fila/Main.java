package org.fila;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//
//        FilaVetor<Integer> filaVetor= new FilaVetor<>(5);
//
//        try {
//
//            filaVetor.enfileirar(1);
//            filaVetor.enfileirar(2);
//            filaVetor.enfileirar(3);
//            filaVetor.enfileirar(4);
////            filaVetor.enfileirar(5);
////            filaVetor.enfileirar(6);
//
//            System.out.println(filaVetor);
//
//            System.out.println("Desinfileirando: ");
//
//            for (int i = 0; i < 3; i++) {
//                System.out.print(filaVetor.desenfileirar()+" ");
//            }
//
//            System.out.println("Enfileirando: ");
//
//            filaVetor.enfileirar(8);
//            filaVetor.enfileirar(9);
//
//            System.out.println("Desenfileirando novamente: ");
//            for (int i = 0; i < 3; i++) {
//
//                System.out.println(filaVetor.desenfileirar());
//
//            }
//
//        }catch (Exception e){
//               System.out.println(e.getMessage());
//       }
//
//
//
//
////        FilaSimplesmente<Integer> filaSimplesmente= new FilaSimplesmente<>(5);
////
////        try {
////
////
////            filaSimplesmente.enfileirar(1);
////            filaSimplesmente.enfileirar(2);
////            filaSimplesmente.enfileirar(3);
////            filaSimplesmente.enfileirar(4);
////            filaSimplesmente.enfileirar(5);
//////            filaSimplesmente.enfileirar(6);
////
////            System.out.println("Quantidade: "+filaSimplesmente.getQtd());
////
////            System.out.println("Fila: "+filaSimplesmente);
////
////            System.out.println("Desenfileirando: ");
////
////
////            for (int i = 0; i <5 ; i++) {
////
////                System.out.print(filaSimplesmente.desenfileirar()+"\t");
////
////            }
////
////            System.out.println("\nNova quantidade: "+ filaSimplesmente.getQtd());
////
////            System.out.println("Nova fila: "+filaSimplesmente);
////
////            System.out.println("Enfilerando novamente");
////
////            filaSimplesmente.enfileirar(10);
////            filaSimplesmente.enfileirar(11);
////            filaSimplesmente.enfileirar(12);
//////            filaSimplesmente.enfileirar(13);
////
////            System.out.println("Nova fila: "+filaSimplesmente);
////
////            for (int i = 0; i < 6; i++) {
////
////                filaSimplesmente.desenfileirar();
////
////            }
////
////        }catch (FilaCheiaException | FilaVaziaException e){
////            System.out.println(e.getMessage());
////        }
//
//
////
        FilaCircular<Integer>filaCircular= new FilaCircular<>(5);

        try {

            System.out.println("Tamanho máximo da fila: "+filaCircular.getQtdMaxSuportada());

            System.out.println("enfileirando: ");

            filaCircular.enfileirar(1);
            filaCircular.enfileirar(2);
            filaCircular.enfileirar(3);
            filaCircular.enfileirar(4);
            filaCircular.enfileirar(5);
//            filaCircular.enfileirar(5);

            System.out.println(filaCircular);

            System.out.println("Quantidade atual da fila: "+filaCircular.getQtd());
            System.out.println("Vazia: "+filaCircular.estaVazia());

            System.out.println("desenfileirando: ");

            for (int i = 0; i < 5; i++) {

                System.out.print(filaCircular.desenfileirar()+" ");

            }

            System.out.println("\nNova Fila");

            System.out.println(filaCircular);

            System.out.println("Quantidade atual da fila: "+filaCircular.getQtd());
            System.out.println("Vazia: "+filaCircular.estaVazia());

            System.out.println("Enfileirando novamente");

            for (int i = 0; i < 3; i++) {

                filaCircular.enfileirar(i);

            }

            System.out.println("\nNova Fila");

            System.out.println(filaCircular);

            System.out.println("Quantidade atual da fila: "+filaCircular.getQtd());
            System.out.println("Vazia: "+filaCircular.estaVazia());

            System.out.println("Limpando a fila");

            filaCircular.limpar();

            System.out.println("\nNova Fila");

            System.out.println(filaCircular);

            System.out.println("Quantidade atual da fila: "+filaCircular.getQtd());
            System.out.println("Vazia: "+filaCircular.estaVazia());



        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }

}
