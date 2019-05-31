import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario{
    private List<Contenido> contenidosVistos=new ArrayList<>();


    public Boolean visteCompleto(Contenido contenido) {
        return this.contenidosVistos.contains(contenido);
    }

    public void ver(Contenido contenido){
        contenidosVistos.add(contenido);
    }

    public List getContenidosVistos(){
        return contenidosVistos;
    }

    public Boolean esFanDe(Actor actor) {
        return contenidosVistos.stream().allMatch(c-> c.actuo(actor));
    }

   public List<String> generosQueVio(){
        return this.contenidosVistos.stream().map(c->c.getGenero()).distinct()
                .collect(Collectors.toList());
    }

    /*public String generoPreferido(){
      this.generosQueVio();
      return this.contenidosVistos.stream().map(c-> c.getGenero().equals(this.generosQueVio()))
              .stream().max(map(c-> c.getDuracion()).reduce(0., Double :: sum));
        //sumatoria de duraciones de contenido por genero
    } */
}
