package Ex_7_CARRO.src;
/*modelo do carro pego em (https://www.asciiart.eu/vehicles/cars)
  ______
 /|_||_\`.__
(   _    _ _\
=`-(_)--(_)-' 

*/

public class Carro {
    private int gasolina;
    private int kmAndados;
    private int tab;
    private int contador;
    private int tamanhoTanque;
    private int kmPorLitro;

    Ultilitarios ultiu = new Ultilitarios();

    // Construtor 
    public Carro() {}

    public Carro(int tamanhoTanque, int kmPorLitro) {
        this.tamanhoTanque = tamanhoTanque;
        this.kmPorLitro = kmPorLitro;
    }
    
    // Metodos 
    public void mover(int moverKm) {
        
        for (int i = 1; i <= moverKm; i++) {
            if (gasolina == 0){
                System.out.println("Tanque de combustivel está vazio!");
                break;
            } 
            else {
                ultiu.sleepScreen(250);
                ultiu.clearScreen();
                this.tab += 1;
                this.contador += 1;
                System.out.printf("%dKM gasolina %dL\n", ++kmAndados, gasolina);
                tabs(); System.out.print("  ______\n");
                tabs(); System.out.print(" /|_||_\\`.__\n");
                tabs(); System.out.print("(   _    _ _\\\n");
                tabs(); System.out.print("=`-(_)--(_)-'\n");
                if (contador == kmPorLitro){ 
                    gasolina--;
                    contador = 0;
                }
            }
        }
    }

    public void abastece(int litrosGasolina) {
        this.gasolina += litrosGasolina;
    }

    public void nivelCombustivel() {
        int nivel = (gasolina*100) / (tamanhoTanque);
        System.out.println("O nível de combustivel está em "+ nivel + "%.");
    }

    private void tabs(){
        for (int i = 0; i < tab; i++) System.out.print("  ");
    }

    public void informacoes(){
        System.out.println("Tamanho do tanque: " + getTamanhoTanque() + "L.");
        System.out.println("Faz " + getKmPorLitro() + "km/L.");
        System.out.println("Qtd de gasolina atual: " + getGasolina() + "L.");
        nivelCombustivel();
        System.out.println("Km percorrido: " + getKmAndados() + "Km.");
    }
    
    //getters and setters
    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getKmAndados() {
        return kmAndados;
    }

    public void setKmAndados(int kmAndados) {
        this.kmAndados = kmAndados;
    }

    public int getTamanhoTanque() {
        return tamanhoTanque;
    }

    public void setTamanhoTanque(int tamanhoTanque) {
        this.tamanhoTanque = tamanhoTanque;
    }

    public int getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(int kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }
    
}
