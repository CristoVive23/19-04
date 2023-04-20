
package av2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Motorista extends Funcionario{
    private String carteiraDeHabilitação;

    public Motorista() {
    }

    public Motorista(String carteiraDeHabilitação, String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
        this.carteiraDeHabilitação = carteiraDeHabilitação;
    }

    public String getCarteiraDeHabilitação() {
        return carteiraDeHabilitação;
    }

    public void setCarteiraDeHabilitação(String carteiraDeHabilitação) {
        this.carteiraDeHabilitação = carteiraDeHabilitação;
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
        return LocalDate.now();
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
    
    
    @Override
    public String toString() {
        return"\n Nome: " + super.nome +
                "\n CPF: " + super.cpf + 
                "\n Data de Nascimento: " + super.getDataNascimento() +
                "\n Genêro: " + super.genero +
                "\n Salário Base: " + super.getSalarioBase() +
                "\n Data de Admissão: " + super.dataAdmissao + 
                "\n Carteira de Habilitação: " + this.carteiraDeHabilitação;
                
    }
    
}
