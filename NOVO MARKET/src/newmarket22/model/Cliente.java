
package newmarket22.model;

import java.util.Date;

public class Cliente extends Pessoa {
    private String cpf;
    private String rg;
    private Date dtNascimento;
    private char sexo;

    public Cliente() {
    }

    public Cliente(String cpf, String rg, Date dtNascimento, char sexo, int id, String nome, String fone1, String fone2, String email, Date dtCadastro, String observacao, char status, String complementoEndereco,Endereco endereco) {
        super(id, nome, fone1, fone2, email, dtCadastro, observacao, status, complementoEndereco,endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + this.getCpf() + this.getRg() + ";" + this.getDtNascimento() + ";" ;
    }     
}
