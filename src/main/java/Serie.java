import java.util.ArrayList;
import java.util.List;

public class Serie implements Contenido{
    private List<Temporada> temporadas = new ArrayList<>();
    private String genero;
    private Boolean esDestacado;

    Serie(Boolean esDestacado){
        this.esDestacado = esDestacado;
    }


    public void addTemporada(Temporada temporada){
        temporadas.add(temporada);
    }

    public Boolean fueVistoCompletoPor(Usuario usuario){
        return this.temporadas.stream()
                .allMatch(t-> t.fueVistoCompletoPor(usuario));
    }

    public void ver(Usuario usuario){
        usuario.getContenidosVistos().add(this);
    }

    public Capitulo ultimoCapitulo(){
        return this.ultimaTemporada().ultimoCapitulo();
    }

    public Temporada ultimaTemporada(){
        return temporadas.get(temporadas.size()-1);
    }

    public Boolean esDestacado() {
        return esDestacado;
    }

    public Boolean actuo(Actor actor){

        return temporadas.stream().anyMatch(t-> t.actuo(actor));
    }

    public String getGenero(){

        return this.genero;
    }

    public Integer getDuracion(){
        return temporadas.stream().map(t-> t.getDuracion()).reduce(0, Integer :: sum);
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

}
