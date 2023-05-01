package INTERFACE.ESTATISTICA.src;

public class Main {
    public static void main(String[] args) {
        SequenciaRandomica sr = new SequenciaRandomica();
        float media = Estatistica.media(sr, 10);
        System.out.println("Media sr = " + media);

        SequenciaDeArray sa = new SequenciaDeArray(50);
        media = Estatistica.media(sa, 4);
        System.out.println("Media sa = " + media);
    }
}
