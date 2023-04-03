//package mx.ipn.escom.compiladores;

import javax.imageio.stream.ImageInputStreamImpl;
import javax.print.attribute.standard.PagesPerMinuteColor;

/**
 * La clase TipoToken es la encargada de almacenar todos los tokens que el analizador puede detectar
 */
public enum TipoToken {
    // Crear un tipoToken por palabra reservada
    ABSTRACT,
    ASSERT,
    BOOLEAN,
    BREAK,
    BYTE,
    CASE,
    CATCH,
    CHAR,
    CLASS,
    CONTINUE,
    DEFAULT,
    DO,
    DOUBLE,
    ELSE,
    ENUM,
    EXTENDS,
    FINAL,
    FINALLY,
    FLOAT,
    FOR,
    IF,
    IMPLEMENTS,
    IMPORT,
    INSTANCEOF,
    INT,
    INTERFACE,
    LONG,
    NATIVE,
    NEW,
    PACKAGE,
    PRIVATE,
    PROTECTED,
    PUBLIC,
    RETURN,
    SHORT,
    STATIC,
    STRICTFP,
    SUPER,
    SWITCH,
    SYNCHRONIZED,
    THIS,
    THROW,
    THROWS,
    TRANSIENT,
    TRY,
    VOID,
    VOLATILE,
    WHILE,
    // Crear un tipoToken: identificador, una cadena y numero
    IDENTIFICADOR,
    CADENA,
    NUMERO,
    // Crear un tipoToken por cada "Signo del lenguaje" (ver clase Scanner)
    PARENTESISA,            //  (
    PARENTESISC,            //  )
    LLAVEA,                 //   {
    LLAVEC,                //   }
    COMA,                  //   ,
    PUNTO,                 //   .
    PUNTOCOMA,             //   ;
    RESTA,                 //   -
    SUMA,                  //   +
    MULTIPLICACION,        //   *
    DIVISION,              //   /
    ADMIRACION,
    DIFERENTE,
    IGUAL,
    ASIGNACION,
    MENOR,
    MENORIGUAL,
    MAYOR,
    MAYORIGUAL,
    // Palabras clave:
    Y, 
    CLASE,
    // Final de cadena
    EOF
}
