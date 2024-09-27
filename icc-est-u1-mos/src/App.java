public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(" Metodo de ordenamiento seleccion");

        MetodosOrdenamiento mOrdenamiento= new MetodosOrdenamiento();

        //Arreglo que sera Ordenado 
        int[] arreglo ={5,8,10,0,2};

        //Arreglo Ordenado de manera Ascendente

       mOrdenamiento.SortBySelection(arreglo, true);
       System.out.print("\nArreglo Ascendente: ");
       mOrdenamiento.printArreglo(arreglo);

        //Arreglo Ordenado de manera Descdente 
        
       mOrdenamiento.SortBySelection(arreglo, false);
       System.out.print("\nArreglo Descendente: ");
       mOrdenamiento.printArreglo(arreglo);


    
        
    }
}