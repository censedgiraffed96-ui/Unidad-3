//ARATH 👍
package eva3_1_metodos;

public class EVA3_1_METODOS {

     public static void main(String[] args) {
    //invocar el metodo
    //LLAMADA PROCEDIMIENTO FUNCION
    //1. SI QUEREMOS RECUPERAR EL VALOR
    int resu = calcularCuadrado(4);
         System.out.println("El cuadrado de 100 es: " + resu);
    //2. USAR EL VALOR SIN GUARDARLO
         System.out.println("El cuadrado de 4 es: " + calcularCuadrado(4));
    //3. No me interesa el resultado
    calcularCuadrado(4);
    }
    //Modificadores
    //modificador de acceso: public, private, protect, default
    //static ---> se necesita para usar nuestros metodos en el main
    //public static
                    //VALOR DE RETORNO(TIPO DE DATO)
                      //NOMBRE DEL METODO (USAR VERBO)
                                   //Lista de parametros
                                   //Cero o N cantidad
    public static int calcularCuadrado(int num){ //ENCABEZADO (HEADER)
        //() ---> IMPLEMENTACION DEL METODO (CUERPO DEL METODO)
    int  cuadrado = num * num;
    return cuadrado; //REGRESAMOS EL RESULTADO
    //YA NO SE PUEDE PONER CODIGO AQUI
    //System.out.println(""); Error, no se puede poner el codigo fuera del metodo(despues del return) ya que acaba
    }
}
    
    
    
    