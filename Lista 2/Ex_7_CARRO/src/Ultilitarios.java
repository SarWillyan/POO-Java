package Ex_7_CARRO.src;

public class Ultilitarios {

    public void menu() {
        System.out.println("----------------------------------");
        System.out.println("0 - Finaliza o progama\n"
                          +"1 - Criar carro\n"
                          +"2 - Ver informações do carro\n"
                          +"3 - Abastacer\n"
                          +"4 - Colocar o carro para andar");
        System.out.println("----------------------------------");
        System.out.print("Sua opção: ");
    }

    public void clearScreen() {  
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }  
    }

    public void sleepScreen(int temp){
        try {
            Thread.sleep(temp);
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}
