package Ex1_2_10.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joaquin", 15000.0f);
        Funcionario f2 = new Funcionario("Beatriz", 27000.0f);
        Funcionario f3 = new Funcionario("Larissa", 10000.0f);
        Funcionario f4 = new Funcionario("Mathias", 15000.0f);
        Mensuravel[] men = {f1, f2, f3, f4};

        System.out.println("Média dos Salários: " + media(men));
        System.out.println();
        System.out.println("Maior Salário: " + maior(men));

        /*_________________________________________ Exercicio 10 _________________________________________ */
        Arrays.sort(men, (Mensuravel o1, Mensuravel o2) -> {
            if (((Funcionario)(o1)).getSalario() > ((Funcionario)(o2)).getSalario()) {
                return 1;
            }
            if (((Funcionario)(o1)).getSalario() == ((Funcionario)(o2)).getSalario()) {
                return ((Funcionario)(o1)).getNome().length() - ((Funcionario)(o2)).getNome().length();
            }

            return -1;
        });

        System.out.println();
        System.out.println("Salários em Ordem Crescente: ");
        for (int i = 0; i < men.length; i++) {
            System.out.println(((Funcionario)(men[i])));
        }
        /*________________________________________________________________________________________________ */
    }

    public static double media(Mensuravel[] objs) { // Exercicio 1
        float soma = 0.0f;
        for (Mensuravel n: objs) {
            soma += n.getMedida();
        }
        return soma/ objs.length;
    }

    public static Mensuravel maior(Mensuravel[] objs) { //Exercicio 2
        Funcionario maiorSalario = new Funcionario();

        for (Mensuravel i: objs) {
            if (i.getMedida() > maiorSalario.getSalario()) maiorSalario = ((Funcionario)i);
        }
        return maiorSalario;
    }
}
