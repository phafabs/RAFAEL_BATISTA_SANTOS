
public class Indentidade {
    
    private String nome = "Rafael";
    private String cpf;
    private int idade;
    private String sobreNome = " Santos Silva";
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public String nomeCompleto(){
        String completo;
        completo = nome+sobreNome;
        return completo;
    }
    
}