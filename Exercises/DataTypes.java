package Exercises;

public class DataTypes {
    public String cadena;
    public int entero;
    public float flotante;
    public char caracter;
    public boolean boleano;

    public DataTypes(String cadena, int entero, float flotante, char caracter, boolean boleano) {
        this.cadena = cadena;
        this.entero = entero;
        this.flotante = flotante;
        this.caracter = caracter;
        this.boleano = boleano;
    }

    public DataTypes(){
        this("Tipos de datos", 20, 3.30f, 'V', true);
    }
}
        
