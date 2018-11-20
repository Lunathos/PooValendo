package pessoa;

import java.util.ArrayList;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;
    private boolean atividade = false; //Referente a situação atual do funcionario
    
    ArrayList<Funcionario> ArrayListFuncionario = new ArrayList<>();

    public Funcionario(String cargo, double salario, String nome, String data_nasc, String sexo, String rg, String cpf, String telefone, String email, String pais, String uf, String cidade, String bairro, String cep, String complemento) {
        super(nome, data_nasc, sexo, rg, cpf, telefone, email, pais, uf, cidade, bairro, cep, complemento);
        this.cargo = cargo;
        this.salario = salario;
    }
    
   
    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtividade() {
        return atividade;
    }

    public void setAtividade(boolean atividade) {
        this.atividade = atividade;
    }

    public ArrayList<Funcionario> getArrayListFuncionario() {
        return ArrayListFuncionario;
    }

    public void setArrayListFuncionario(ArrayList<Funcionario> ArrayListFuncionario) {
        this.ArrayListFuncionario = ArrayListFuncionario;
    }
  
}
