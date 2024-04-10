package com.alurajrh.screenmatch.modelos;

public class Pelicula extends Titulo{
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void muestraFichaTecnica(){
        super.muestraFichaTecnica();
        // System.out.println("El nombre de la película es: " + getNombre());
        System.out.println("Director:"+ director);
        System.out.println("\n****************************");
    }

}
