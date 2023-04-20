
package av2;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args, Diretor Diretor) {
        Motorista motorista = new Motorista("00000000", "Carlos", "666.666.666-66", LocalDate.of(1999, Month.MARCH, 12), Genero.MASCULINO, 66, LocalDate.now());
        Gerente gerente = new Gerente(Bonificacao.DIRETOR, "Denise", "000.000.000-00", LocalDate.of(1990, Month.MARCH, 15), Genero.FEMININO, 34, LocalDate.now());
        Diretor diretor = new Diretor("Cosme", "000.000.000-00", LocalDate.of(1971, Month.MARCH, 21), Genero.MASCULINO, 45, LocalDate.ofEpochDay(1));
        Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Denise", "000.000.000-00", LocalDate.of(1990, Month.MARCH, 15), Genero.FEMININO, 34, LocalDate.now());
        System.out.println("\n by NewStyle");
        
        System.out.println(motorista);
        System.out.println(gerente);
        System.out.println(diretor);
        System.out.println(gerente1);
                
        diretor.toString(diretor);
       
    }

}
