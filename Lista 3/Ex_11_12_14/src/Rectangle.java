package Ex_11_12_14.src;

public class Rectangle extends Shape{

    private double width, height;
    
    public Rectangle(Ponto topLeft, double width, double height) {
        super(topLeft.getX(), topLeft.getY());
        this.height = height;
        this.width = width;
    }

    @Override
    public Ponto getCenter() {
        return new Ponto(super.getPonto().getX()/2.0, super.getPonto().getY()/2.0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rectangle aux = (Rectangle) super.clone();
        aux.ponto = new Ponto(ponto.getX(), ponto.getY());
        aux.height = this.height;
        aux.width = this.width;
        return aux;
    }
}
