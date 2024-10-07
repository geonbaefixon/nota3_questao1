import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Programador p = new Programador();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        g.nome = sc.nextLine();
        System.out.println("Informe sua data de nascimento(dd/mm/aa)");
        g.nascimento = sc.nextLine();
        System.out.println("Informe seu salário: ");
        g.salario = sc.nextDouble();
        System.out.println("Informe o projeto: ");
        g.projeto = sc.nextLine();
        
        System.out.println("Informações do gerente:");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Idade: " + g.calcularIdade());
        System.out.println("Salario: " + g.getsalario());
        System.out.println("Projeto: " + g.getprojeto());

        System.out.println("Informe seu nome: ");
        g.nome = sc.nextLine();
        System.out.println("Informe sua data de nascimento(dd/mm/aa)");
        g.nascimento = sc.nextLine();
        System.out.println("Informe seu salário: ");
        p.salario = sc.nextDouble();
        System.out.println("Informe a linguagem: ");
        p.projeto = sc.nextLine();

        System.out.println("Informações do gerente:");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.calcularIdade());
        System.out.println("Salario: " + p.getsalario());
        System.out.println("Linguagem: " + p.getlinguagem());
        }
}