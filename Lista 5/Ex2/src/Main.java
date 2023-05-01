package Ex2.src;

public class Main {
    public static void main(String[] args) {
        Pair<String> pair1 = new Pair<String>("Camaleão", "Caranguejo");
        System.out.println("Pair1: " + pair1.getPrimeiro() + " " + pair1.getSegundo());
        System.out.println("Max: " + pair1.getMax());
        System.out.println("Min: " + pair1.getMin());
        Pair<Integer> pair2 = new Pair<Integer>(50, 1000);
        System.out.println("Pair2: " + pair2.getPrimeiro() + " " + pair2.getSegundo());
        System.out.println("Max: " + pair2.getMax());
        System.out.println("Min: " + pair2.getMin());
    }
}
