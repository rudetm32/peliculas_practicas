package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {

    public void filtro(Clasificacion clasificacion){
        
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Recomendada, tiene evaluacion alta");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("popular en el momento");
        }else{
            System.out.println("puedes ingresarlo a tu lista de recomendaciones");
        }
    };
}
