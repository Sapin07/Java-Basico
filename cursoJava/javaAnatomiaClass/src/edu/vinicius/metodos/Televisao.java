package edu.vinicius.metodos;

public class Televisao {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void apertarBotao(){
        ligada = !ligada;
    }

    public void aumentarVolume(int numCliques){
        //aperta o botao de aumentar i vezes que o botao foi chamado
        for (int i=0; i < numCliques; i++){
            volume++;
        }

    }

    public void diminuirVolume(int numCliques){
        //aperta o botao de diminuir i vezes que o botao foi chamado
        for (int i=0; i < numCliques; i++){
            volume--;
        }

    }

    public void mudarCanal(int numeroCanal){
        canal = numeroCanal;
    }

}