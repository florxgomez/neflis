import java.util.ArrayList;
import java.util.List;

public class Pelicula implements Contenido{

    private List<Actor> actores = new ArrayList<>();
    private String genero;
    private Integer duracion;

    public Boolean fueVistoCompletoPor(Usuario usuario){

        return usuario.getContenidosVistos().contains(this);
    }

    public Boolean actuo(Actor actor){

        return actores.contains(actor);
    }

    public void addActor(Actor actor){

        actores.add(actor);
    }

    public String getGenero() {

        return genero;
    }

    public Integer getDuracion(){

        return duracion;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }
}
