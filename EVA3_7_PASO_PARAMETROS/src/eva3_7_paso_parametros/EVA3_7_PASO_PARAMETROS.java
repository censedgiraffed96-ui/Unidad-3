//ARATH👍
package eva3_7_paso_parametros;

public class EVA3_7_PASO_PARAMETROS {

    public static void main(String[] args) {
        int nume= 5;
        System.out.println("Original" + nume);
        incrementar(nume);//SE manda una copia del valor almacenado
        System.out.println("Despues de incremenrar" + nume);
    }
    //INCREMENTA UN ENTEERO EN 1
    public static void incrementar(int valor){
        valor = valor + 1;
    }
}
