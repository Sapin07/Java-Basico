package edu.vinicius.metodos;

public class Usuario {
    public static void main (String[] args) throws Exception {

        Televisao tv = new Televisao();

        System.out.println("Tv esta ligada? " + (tv.ligada ? "sim" : "nao"));
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume atual: " + tv.volume);

        tv.apertarBotao();
        System.out.println("Tv esta ligada? " + (tv.ligada ? "sim" : "nao"));

        tv.aumentarVolume(12);
        System.out.println("Volume atual: " + tv.volume);

        tv.diminuirVolume(14);
        System.out.println("Volume atual: " + tv.volume);

        tv.mudarCanal(4);
        System.out.println("Canal atual: "+ tv.canal);
    }
}
