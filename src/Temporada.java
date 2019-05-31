import java.util.ArrayList;
import java.util.List;

public class Temporada implements Contenido {


    private List<Capitulo> capitulos = new ArrayList<>();
    private List<Actor> actores=new ArrayList<>();
    private Serie serie;
    private Integer cantCapitulos;

    Temporada(Serie serie) {
        this.serie=serie;
    }

    public Boolean fueVistoCompletoPor(Usuario user){
        return this.capitulos.stream()
                .allMatch(c-> c.fueVistoCompletoPor(user));
    }

    public void addCapitulo(Capitulo capitulo){
        capitulos.add(capitulo);
    }

    protected Double getDuracion(){
        return capitulos.stream().map(c-> c.getDuracion()).reduce(0.0, Double :: sum );
    }

    public Capitulo ultimoCapitulo(){
        return capitulos.get(capitulos.size()-1);
    }

    public Boolean actuo(Actor actor){
        return actores.contains(actor);
    }

    public String getGenero(){return serie.getGenero();}


}
