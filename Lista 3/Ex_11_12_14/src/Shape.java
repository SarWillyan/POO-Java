package Ex_11_12_14.src;

public abstract class Shape { // Exercicio 14
    Ponto ponto;

    public Shape(double x, double y) {
        ponto = new Ponto(x, y);
    }
    
    public void moveBy(double dx, double dy) {
        ponto.setX(ponto.getX() + dx);
        ponto.setY(ponto.getY() + dy);
    }

    public abstract Ponto getCenter();

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

}
