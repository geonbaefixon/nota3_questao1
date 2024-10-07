public class Gerente extends Funcionario{
    private String projeto;

    public Gerente(String projeto){
       this.projeto = projeto;
    }
    
    public String getProjeto() {
       return projeto;
    }

    public void setProjeto(String projeto) {
       this.projeto = projeto;
    }

    public String exibirInfo() {
       return "Projeto: " + projeto;
    } 
}