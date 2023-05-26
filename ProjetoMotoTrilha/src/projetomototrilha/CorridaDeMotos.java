/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetomototrilha;

import java.util.Random;

/**
 *
 * @author juniorslongo
 */
public class CorridaDeMotos {
    private static final int NUM_MOTOS = 4;
    private static final int TAM_TRILHA = 20;

    public static void main(String[] args) {
        // Cria um gerador de números aleatórios
        Random random = new Random();

        // Cria as motos
        Moto[] motos = new Moto[NUM_MOTOS];
        for (int i = 0; i < NUM_MOTOS; i++) {
            motos[i] = new Moto();
        /**/        }

        // Loop do jogo
        while (true) {
            // Exibe o estado atual das motos na trilha
            exibirTrilha(motos);

            // Move as motos aleatoriamente
            for (int i = 0; i < NUM_MOTOS; i++) {
                int distancia = random.nextInt(3);
                motos[i].moverMoto(distancia);
            }

            // Verifica se alguma moto chegou ao final da trilha
            int vencedor = verificarVencedor(motos);
            if (vencedor != -1) {
                System.out.println("A moto " + (vencedor + 1) + " venceu!");
                break;
            }

            // Pausa o jogo por um curto período para dar tempo de visualizar o movimento das motos
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Função que exibe o estado atual das motos na trilha
    private static void exibirTrilha(Moto[] motos) {
        for (int i = 0; i < NUM_MOTOS; i++) {
            for (int j = 0; j < TAM_TRILHA; j++) {
                if (motos[i].getPosicao() == j) {
                    System.out.print("M");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    // Função que verifica se alguma moto chegou ao final da trilha
    private static int verificarVencedor(Moto[] motos) {
        for (int i = 0; i < NUM_MOTOS; i++) {
            if (motos[i].getPosicao() >= TAM_TRILHA) {
                return i;
            }
        }
        return -1;
    }
}
