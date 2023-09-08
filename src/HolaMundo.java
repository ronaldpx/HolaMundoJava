// Mi clase de Java
public class HolaMundo {
    public static void main (String args[]){
        //Definimosla variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
    //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        
        //Modificar el valor de la variable de cadena
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Saludos";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
    }
}
