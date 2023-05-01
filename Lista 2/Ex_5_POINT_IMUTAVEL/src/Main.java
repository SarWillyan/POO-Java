package Ex_5_POINT_IMUTAVEL.src;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 4).translate(1, 3).scale(0.5f);

        System.out.println(point.getX() + " " + point.getY());
    }
}
