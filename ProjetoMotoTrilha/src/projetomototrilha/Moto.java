/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomototrilha;

/**
 *
 * @author junis
 */
class Moto {
    private int posicao;

    public Moto() {
        posicao = 0;
    }

    public int getPosicao() {
        return posicao;
    }

    public void moverMoto(int distancia) {
        posicao += distancia;
    }
}
