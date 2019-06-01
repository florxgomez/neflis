import java.util.ArrayList;
import java.util.List;

public class Serie implements Contenido{
    private List<Temporada> temporadas= new ArrayList<>();
    protected String genero;


    public void addTemporada(Temporada temporada){
        temporadas.add(temporada);
    }

    public Boolean fueVistoCompletoPor(Usuario user){
        return this.temporadas.stream()
                .allMatch(t-> t.fueVistoCompletoPor(user));
    }

    public Capitulo ultimoCapitulo(){
        return temporadas.get(temporadas.size()-1).ultimoCapitulo();
    }

    public Boolean actuo(Actor actor){
        return temporadas.stream().anyMatch(t-> t.actuo(actor))    ;
    }

    public String getGenero(){
       return this.genero;
    }

    public Integer getDuracion(){
        return temporadas.stream().map(t-> t.getDuracion()).reduce(0, Integer :: sum);
    }

}
