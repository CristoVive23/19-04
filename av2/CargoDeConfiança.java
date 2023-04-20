
package av2;

import java.time.LocalDate;

public abstract class CargoDeConfiança extends Funcionario{
    
    protected Bonificacao bonificacao;

    public CargoDeConfiança() {
    }

    public CargoDeConfiança(Bonificacao bonificacao, String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    
}
