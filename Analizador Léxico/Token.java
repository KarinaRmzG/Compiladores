//package mx.ipn.escom.compiladores;

public class Token {
    //private String valor; que nos indica el nombre del token en cuestión
    final TipoToken tipo; //que nos indica el tipo de token en cuestión
    final String lexema;
    final Object literal;
    final int linea;

    public Token(TipoToken tipo, String lexema, Object literal, int linea) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.literal = literal;
        this.linea = linea;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public String toString(){
        return tipo + " " + lexema + " " + literal;
    }
}
