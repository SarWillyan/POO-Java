package Ex_11_12_14.src;

public class Line extends Shape { // Exercicio 14
    private Ponto to;
    public Line (Ponto from, Ponto to) {
        super(from.getX(), from.getY());
        this.to = new Ponto(to.getX(), to.getY());
    }

    @Override
    public Ponto getCenter() {
        return new Ponto((ponto.getX()+to.getX())/2, (ponto.getY()+to.getY())/2);
    }

    public Ponto getTo() {
        return to;
    }

    public void setTo(Ponto to) {
        this.to = to;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Line aux = (Line) super.clone();
        aux.ponto = new Ponto(ponto.getX(), ponto.getY());
        aux.to = new Ponto(to.getX(), to.getY());
        return aux;
    }

    
}
