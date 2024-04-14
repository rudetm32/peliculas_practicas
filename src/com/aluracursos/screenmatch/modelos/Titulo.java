package com.aluracursos.screenmatch.modelos;

// Clase base que representa un título, como una película o serie.
public class Titulo {

    // Atributos privados que representan las características del título.
    private String nombre; // Nombre del título.
    private int fechaDeLanzamiento; // Año de lanzamiento del título.
    private int duracionEnMinutos; // Duración en minutos del título.
    private boolean incluidoEnElPlan; // Indica si el título está incluido en el plan de suscripción.
    private double sumaDeLasEvaluaciones; // Suma total de las evaluaciones recibidas por el título.
    private int totalDelasEvaluaciones; // Total de evaluaciones recibidas por el título.


    // Métodos getter y setter para acceder y modificar los atributos encapsulados.
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getFechaDeLanzamiento() { return fechaDeLanzamiento; }
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) { this.fechaDeLanzamiento = fechaDeLanzamiento; }

    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }

    public boolean isIncluidoEnElPlan() { return incluidoEnElPlan; }
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) { this.incluidoEnElPlan = incluidoEnElPlan; }

    public double getSumaDeLasEvaluaciones() { return sumaDeLasEvaluaciones; }
    public void setSumaDeLasEvaluaciones(double sumaDeLasEvaluaciones) { this.sumaDeLasEvaluaciones = sumaDeLasEvaluaciones; }

    public int getTotalDelasEvaluaciones() { return totalDelasEvaluaciones; }
    public void setTotalDelasEvaluaciones(int totalDelasEvaluaciones) { this.totalDelasEvaluaciones = totalDelasEvaluaciones; }


    // Método que muestra la ficha técnica del título, incluyendo nombre, fecha de lanzamiento y duración.
    public void muestraFichaTecnica(){
        System.out.println("Nombre del título: " + getNombre());
        System.out.println("Fecha de lanzamiento: " + getFechaDeLanzamiento());
        System.out.println("Duración en minutos: "+ getDuracionEnMinutos());
    }

    // Método que permite agregar una evaluación al título, sumando la calificación y aumentando el total de evaluaciones.
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;
    }

    // Método que calcula y devuelve la media de las evaluaciones recibidas por el título.
    public double calculaMediaEvaluaciones(){
        if(totalDelasEvaluaciones == 0) {
            return 0; // Evita división por cero si no se han recibido evaluaciones.
        }
        return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
    }
}
