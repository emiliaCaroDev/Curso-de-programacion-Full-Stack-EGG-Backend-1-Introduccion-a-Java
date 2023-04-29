package servicio;

import java.util.Arrays;

public class ArregloService {

    public Integer[] inicializarA(Integer[] array){

        for(int i=0;i<array.length;i++){
            array[i] = (int) Math.round(Math.random()*((10-1)+1));
        }
        return array;
    }


    public void mostrarArray(Integer[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public void ordenarArray(Integer[] array){
        for(int i=array.length-1;i>=0;i--){
           Arrays.sort(array);
            System.out.println(array[i]);
        }
    }

    //FALTA
    public Integer[] inicializarB(Integer[] arrayA){
        Integer[] arrayB = new Integer[5];
        for(Integer elem: arrayA){
            //for(int i=0;i<3;i++){
              //  Arrays.fill(arrayB,arrayA[i]);
            //}
            Arrays.fill(arrayB,0,3,elem);
        }
        return arrayB;
    }
}
