package Ex_5_POINT_IMUTAVEL.src;

public class Point {
    // Atributos
    private final float x;
    private final float y;

    // Contrutores
    public Point(final float x, final float y) {
        this.x = x;
        this.y = y;
    }

    // Metodos
    public Point translate(final float x, final float y) {
        Point novo = new Point(this.x + x,this.y + y);
        return novo;
    }
    
    public Point scale(final float mult) {
        Point novo = new Point(this.x * mult,this.y * mult);
        return novo;
    }

    // getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }   
}
