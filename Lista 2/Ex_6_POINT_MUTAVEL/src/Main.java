package Ex_6_POINT_MUTAVEL.src;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        point.translate(1, 3);
        point.scale(0.5f);

        System.out.println(point.getX() + " " + point.getY());
    }
}
