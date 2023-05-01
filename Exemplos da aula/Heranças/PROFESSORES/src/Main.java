public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Ivairton", 12345, 1000.0f);
        ProfessorHolista p2 = new ProfessorHolista("Max", 5555, 50.0f, 40);
        ProfessorDE p3 = new ProfessorDE("Livia", 11111, 2000.0f, 500.0f);

        System.out.println("\nNome: " + p1.getNome() + "\tCPF: " + p1.getCpf() + "\tSalario: " + p1.getSalario());
        System.out.println("\nNome: " + p2.getNome() + "\tCPF: " + p2.getCpf() + "\tSalario: " + p2.getSalario());
        System.out.println("\nNome: " + p3.getNome() + "\tCPF: " + p3.getCpf() + "\tSalario: " + p3.getSalario());
        
        if (p1 instanceof ProfessorDE) {
            System.out.println("p1 aponta para ProfessorDE");
        } else 
            System.out.println("p1 não aponta para ProfessorDE");
    }
}
