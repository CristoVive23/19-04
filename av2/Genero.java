
package av2;

public enum Genero {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
    
    private char valor;
    private String texto;

    private Genero() {
    }

    private Genero(char valor, String texto) {
        this.valor = valor;
        this.texto = texto;
    }

    public char getValor() {
        return valor;
    }

    public String getTexto() {
        return texto;
    }
    

   
    
}
