package Ex_6_POINT_MUTAVEL.src;

public class Point {
    private float x;
    private float y;

    // Construtores
    public Point() {}
    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Metodos 
    public void translate(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public void scale(float mult) {
        this.x *= mult;
        this.y *= mult;
    }
    
    //getters and setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    
}
