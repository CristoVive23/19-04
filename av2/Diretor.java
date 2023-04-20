
package av2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Diretor extends Funcionario implements Contratacao{
    
    private double PREMIO;

    public Diretor() {
    }

    public Diretor(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public void admitir() {
        System.out.println("Admitir funcionário: ");
        System.out.println("Secretaria: ");      
        System.out.println("Nome: Vanessa ");
    }

    @Override
    public void demitir() {
        System.out.println("Demitir funcionário: ");
        System.out.println("Secretaria: ");
        System.out.println("Nome: Maria ");
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

    void toString(Diretor diretor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
