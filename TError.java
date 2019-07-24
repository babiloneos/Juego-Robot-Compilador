package Config;

/**
 *
 * @author gballesteros
 */
public class TError {

    String lexema;
    int line;
    int column;
    String tipo;
    String descripcion;
    Boolean a;

    public TError(String lexema, int line, int column, String tipo, String descripcion) {
        this.lexema = lexema;
        this.line = line;
        this.column = column;
        this.tipo = tipo;
        this.descripcion = descripcion;
        a = new Boolean(true);
    }
    
    @Override
    public String toString(){
        return "\nError en linea: " + this.line + ", columna: "+ this.column + ".\n"
                + this.tipo + this.descripcion + " -> " + this.lexema;
    }
    
}
