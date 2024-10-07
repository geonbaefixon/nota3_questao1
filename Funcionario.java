public class Funcionario {
    protected String nome;
    protected String nascimento;
    protected double salario;
        
    public Funcionario(String nome, String nascimento, double salario) {
    this.nome = nome;
    this.nascimento = nascimento;
    this.salario = salario;
    }

    public String getNome() {
        return nome;
        }

    public void setNome(String nome) {
        this.nome = nome;
        }

    public String getNascimento() {
        return nascimento;
        }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
        }

    public double getSalario() {
        return salario;
        }

    public void setSalario(double salario) {
        this.salario = salario;
        }

    public int calcularIdade() {
        String[] partes = nascimento.split("/");
        int anoNascimento = Integer.parseInt(partes[2]);
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return anoAtual - anoNascimento;
        }

    public void exibirInformacoes() {
        System.out.println(nome);
        calcularIdade();
        System.out.println(salario);
        }
}
