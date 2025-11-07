
package eva3_5_arreglos_metodos;

public class EVA3_5_ARREGLOS_METODOS {

    public static void main(String[] args) {
        int[] miArreglo;
        miArreglo = crearArreglo(50,100);
        imprimirArreglo(miArreglo);
    }
    //Crear un arreglo y lo deuelva lleno de valores aleatorios
    public static int[] crearArreglo(int tama, int valorAleatorio){
        int resu[] = new int [tama];
        for (int i = 0; i < resu.length; i++) {
            resu[i] = (int)(Math.random() * valorAleatorio);
            
        }
        return resu;
    }
    //imprimir un arreglo
    public static void imprimirArreglo(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("(" + arreglo[i] + ")");
        }
        System.out.println("");
    }
}
