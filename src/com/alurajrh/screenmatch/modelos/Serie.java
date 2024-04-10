package com.alurajrh.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int minutosPorTemporada;
    private int episodiosPorTemporadas;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }

    public int getEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }
    @Override
    public void muestraFichaTecnica() {

        super.muestraFichaTecnica();
        System.out.println("temporadas: " + temporadas);
        System.out.println("Capitulos por temporadas: " + episodiosPorTemporadas);
    }
}
