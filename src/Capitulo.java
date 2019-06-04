import java.util.ArrayList;
import java.util.List;

public class Capitulo implements Contenido{

    private Integer duracion;
    private Temporada temporada;
    private List<Actor> actoresInvitados = new ArrayList<>();
    private Boolean esDestacado;

    public Capitulo(Integer duracion, Temporada temporada, Boolean esDestacado){
        this.duracion = duracion;
        this.temporada = temporada;
        this.esDestacado = esDestacado;
    }

    public Boolean fueVistoCompletoPor(Usuario usuario){
        return usuario.getContenidosVistos().contains(this);
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Boolean actuo(Actor actor){
        return actoresInvitados.contains(actor);
    }

    public String getGenero(){
        return this.temporada.getGenero();
    }

    public void setDuracion(Integer min) {
        this.duracion = min;
    }

    public void ver(Usuario usuario){
        usuario.getContenidosVistos().add(this);
        if (!usuario.getContenidosVistos().contains(this.temporada)){
            this.temporada.ver(usuario);
        }
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public Boolean esDestacado() {
        return esDestacado;
    }


    public void setEsDestacado(Boolean esDestacado) {
        this.esDestacado = esDestacado;
    }
}
