package pessoa;

public class Pessoa extends Endereco{
//ATRIBUTOS   
    public String nome;
    public String data_nasc;
    public String sexo;
    public String rg;
    public String cpf;
    public String telefone;
    public String email;

    public Pessoa(String nome, String data_nasc, String sexo, String rg, String cpf, String telefone, String email, String pais, String uf, String cidade, String bairro, String cep, String complemento) {
        super(pais, uf, cidade, bairro, cep, complemento);
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    
 //GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
}
