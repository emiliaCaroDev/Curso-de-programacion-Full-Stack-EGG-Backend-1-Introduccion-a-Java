package servicio;

import entidad.ParDeNumeros;

public class ParDeNumerosServicio {

    public ParDeNumeros crearParDeNumeros(){
        return new ParDeNumeros();
    }

    public String mostrarValores(ParDeNumeros parDeNum){
        return "\nnumero 1= "+parDeNum.getNum1()+" \nnumero 2= "+parDeNum.getNum2();
    }

    public Double devolverMayor(ParDeNumeros parDeNum){
        Double mayor = 0.0;
        if(parDeNum.getNum1() > parDeNum.getNum2()){
            mayor = parDeNum.getNum1();
        }
        else{
            mayor = parDeNum.getNum2();
        }
        return mayor;
    }

    public Integer calcularPotencia(ParDeNumeros parDeNum){
        Double mayor = devolverMayor(parDeNum);
        Double menor = 0.0;
        if(parDeNum.getNum1()==mayor){
            menor = parDeNum.getNum2();
        }
        else{
            menor = parDeNum.getNum1();
        }
        return (int) Math.pow(mayor,menor);
    }

    public Double calcularRaiz(ParDeNumeros parDeNum){
        Double mayor = devolverMayor(parDeNum);
        Double menor = 0.0,valorAbs=0.0;
        if(parDeNum.getNum1()==mayor){
            menor = parDeNum.getNum2();
        }
        else{
            menor = parDeNum.getNum1();
        }
        valorAbs = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
