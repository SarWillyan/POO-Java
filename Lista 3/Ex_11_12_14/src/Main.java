package Ex_11_12_14.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circulo: ");
        Circle circulo = new Circle(new Ponto(5, 5), 5);
        System.out.println("Centro fica no " + circulo.getCenter());
        System.out.println("raio: " + circulo.getRadius());

        System.out.println("\nRetangulo: ");
        Rectangle retangulo = new Rectangle(new Ponto(5, 4), 5, 4);
        System.out.println(retangulo.getPonto());
        System.out.println("Centro fica no " + retangulo.getCenter());
        System.out.println("largura: " + retangulo.getWidth() + " altura: " + retangulo.getHeight());

        System.out.println("\nLinha:");
        Line linha = new Line(new Ponto(-1,1), new Ponto(3, 1));
        System.out.println("Centro fica no " + linha.getCenter());
    }
}
