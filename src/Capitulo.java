import java.util.ArrayList;
import java.util.List;

public class Capitulo implements Contenido{

    private Integer duracion;
    private Temporada temporada;
    private List<Actor> actoresInvitados = new ArrayList<>();

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

}
