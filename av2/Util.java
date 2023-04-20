
package av2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import static javax.management.Query.value;
import static javax.management.Query.value;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class Util {
    public static LocalDate Data(LocalDate Date){
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");   
        return Data(Date);
    }
    
    public static String BrlString(){
        return("");
    }
    
   
}
