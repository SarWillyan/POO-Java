package Ex_11_12_14.src;

public class Circle extends Shape { //Exercicio 14

    private double radius;
    
    public Circle(Ponto center, double radius) {
        super(center.getX(), center.getY());
        this.radius = radius;
    }

    @Override
    public Ponto getCenter() {
        
        return super.getPonto();
    }

    public void setCenter(Ponto center) {
        super.setPonto(center);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Circle aux = (Circle) super.clone();
        aux.ponto = new Ponto(ponto.getX(), ponto.getY());
        aux.radius = this.radius;
        return aux;
    }
}
