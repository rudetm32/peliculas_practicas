import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {

        Pelicula mejorImposible = new Pelicula();
        mejorImposible.setNombre("Mejor imposible");
        mejorImposible.setDirector("Guillermo del Toro");
        mejorImposible.setFechaDeLanzamiento(2007);
        mejorImposible.setDuracionEnMinutos(95);

        mejorImposible.evalua(10);
        mejorImposible.evalua(10);
        mejorImposible.evalua(7.8);

        System.out.println("Média de evaluaciones de la película: " + mejorImposible.calculaMediaEvaluaciones());
        mejorImposible.muestraFichaTecnica();


        var anneE = new Serie();
        anneE.setNombre("Anne with an E");
        anneE.setFechaDeLanzamiento(2021);
        anneE.setTemporadas(3);
        anneE.setMinutosPorEpisodio(50);
        anneE.setEpisodiosPorTemporada(10);
        anneE.muestraFichaTecnica();

        var calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(mejorImposible);
        calculadora.incluye(anneE);
        System.out.println(calculadora.getTiempoTotal());

        var filtroRecomendacion = new FiltroRecomendaciones();
        filtroRecomendacion.filtro(mejorImposible);

        var episodio = new Episodio();
        episodio.setNombre("conociendo a la familia");
        episodio.setNumero(1);
        episodio.setSerie(anneE);
        episodio.setVisualizaciones(99);

        filtroRecomendacion.filtro(episodio);
    }
}
