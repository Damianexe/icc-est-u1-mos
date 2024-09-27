public class MetodosOrdenamiento {

    /*public MetodosOrdenamiento() {
        System.out.println("Clase manejada para el metodo");
    }*/

    public int[] SortBySelection(int[] arreglo, boolean asc) {

        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio; i++) {
            int indicem = i;
            for (int j = i + 1; j < tamanio; j++) {

                if(asc
                ? arreglo[j]<arreglo[indicem]
                : arreglo[j] > arreglo[indicem]) {
                    indicem = j;
                }

            }
            // Intercambio del indice encontrando pro el pruimero
            int aux = arreglo[indicem];
            arreglo[indicem] = arreglo[i];
            arreglo[i] = aux;

        }

        return arreglo;

    }
    
    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " - ");
        }
    }
}