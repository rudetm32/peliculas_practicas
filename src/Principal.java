import com.alurajrh.screenmatch.modelos.Pelicula;
import com.alurajrh.screenmatch.modelos.Serie;

import java.text.MessageFormat;

public class Principal {
    public static void main(String[] args) {
        Pelicula mejorImposible = new Pelicula();
        mejorImposible.setNombre("Mejor imposible");
        mejorImposible.setDirector("Guillermo del Toro");
        mejorImposible.setFechaDeLanzamiento(2007);
        mejorImposible.setDuracionEnMinutos(95);
        mejorImposible.setIncluidoEnElPlan(true);

        mejorImposible.muestraFichaTecnica();
        mejorImposible.evalua(10);
        mejorImposible.evalua(10);
        mejorImposible.evalua(7.8);
        System.out.println(MessageFormat.format("Média de evaluaciones de la película: {0}", mejorImposible.calculaMedia()));

        Serie anneE = new Serie();
        anneE.setNombre("Anne with an E");
        anneE.setFechaDeLanzamiento(2021);
        anneE.getEpisodiosPorTemporadas(10);
        anneE.setMinutosPorTemporada(180);
        anneE.setIncluidoEnElPlan(true);

        anneE.muestraFichaTecnica();


    }
}
