public class Principal{

    public static void main(String[] args){

        int Arreglo[] = {1,4,8,20,100,500};
        System.out.print(Arreglo[4]);

        System.out.print("Busqueda de un numero: ");
        for(int i =0; i<Arreglo.length; i++){
            if(Arreglo[i] == 20)
            {
                System.out.println("El 20 se encuetra en el arreglo: ");
            }
            else{
                System.out.println("No se encuentra");
            }
        }
    }
}