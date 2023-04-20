
package av2;

import static av2.Util.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Gerente extends CargoDeConfiança{

    public Gerente() {
    }

    public Gerente(Bonificacao bonificacao, String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
    }

    @Override
    public String toString() {
        return "\n Nome: " + super.nome +
                "\n CPF: " + super.cpf + 
                "\n Data de Nascimento: " + super.getDataNascimento() +
                "\n Genêro: " + super.genero +
                "\n Salário Base: " + super.getSalarioBase() +
                "\n Data de Admissão: " + super.dataAdmissao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

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

    public LocalDate getDataNascimento() {
       DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");   
        return getDataNascimento();
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

   
    
}
