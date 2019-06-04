import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Pelicula implements Contenido{

    private List<Actor> actores = new ArrayList<>();
    private String genero;
    private Integer duracion;
    private Boolean esDestacado;

    public Boolean fueVistoCompletoPor(Usuario usuario){

        return usuario.getContenidosVistos().contains(this);
    }

    public void ver(Usuario usuario){
        usuario.getContenidosVistos().add(this);

    }

    public Boolean actuo(Actor actor){

        return actores.contains(actor);
    }

    public void addActor(Actor actor){

        actores.add(actor);
    }

    public Boolean esDestacado() {
        return esDestacado;
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
