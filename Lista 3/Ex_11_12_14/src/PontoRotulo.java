package Ex_11_12_14.src;

public class PontoRotulo extends Ponto {
    /*_________________________________________ Exercicio 11 _________________________________________ */
    private String rotulo;

    public PontoRotulo(String rotulo, double x, double y) {
        super(x, y);
        this.rotulo = rotulo;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    /*________________________________________________________________________________________________ */

    
    /*_________________________________________ Exercicio 12 _________________________________________ */
    @Override
    public String toString() {
        return "PontoRotulo [rotulo=" + rotulo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((rotulo == null) ? 0 : rotulo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PontoRotulo other = (PontoRotulo) obj;
        if (rotulo == null) {
            if (other.rotulo != null)
                return false;
        } else if (!rotulo.equals(other.rotulo))
            return false;
        return true;
    } 
    /*________________________________________________________________________________________________ */
}
