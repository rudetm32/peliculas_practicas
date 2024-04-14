package com.aluracursos.screenmatch.modelos;


import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;


    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }


    @Override
    public void muestraFichaTecnica(){
        super.muestraFichaTecnica();
        System.out.println("Director: "+ getDirector());
        System.out.println("\n****************************");
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMediaEvaluaciones() / 2);
    }
}