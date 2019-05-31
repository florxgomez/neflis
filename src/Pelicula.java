import java.util.ArrayList;

public class Pelicula implements Contenido{

    protected ArrayList<Actor> actores =new ArrayList<>();
    private String genero;
    protected Double duracion;

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

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
