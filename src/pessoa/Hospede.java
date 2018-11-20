package pessoa;

import java.util.ArrayList;

public class Hospede extends Pessoa{
   ArrayList<Hospede>  ArrayListHospede = new ArrayList<>();

    
    public Hospede(String nome, String data_nasc, String sexo, String rg, String cpf, String telefone, String email, String pais, String uf, String cidade, String bairro, String cep, String complemento) {
        super(nome, data_nasc, sexo, rg, cpf, telefone, email, pais, uf, cidade, bairro, cep, complemento);
    }

    public ArrayList<Hospede> getArrayListHospede() {
        return ArrayListHospede;
    }

    public void setArrayListHospede(ArrayList<Hospede> ArrayListHospede) {
        this.ArrayListHospede = ArrayListHospede;
    }
         
}
