public class Programador extends Funcionario{
    private String linguagem;

    public Programador(String linguagem){
        this.linguagem = linguagem;
    }
    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String projeto) {
        this.linguagem = projeto;
    }

    public String exibirInfo() {
        return "Linguagem: " + linguagem;
    } 
}