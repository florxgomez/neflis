import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario{
    private List<Contenido> contenidosVistos = new ArrayList<>();
    private List<Contenido> contenidosDestacados = new ArrayList<>();
    private List<Contenido> contenidosCompletos=new ArrayList<>();


    public Boolean visteCompleto(Contenido contenido) {
        return this.contenidosVistos.contains(contenido);
    }

    public List<Contenido> contenidosIncompletos(){
        return contenidosVistos.stream().filter(c -> !c.fueVistoCompletoPor(this)).collect(Collectors.toList());
    }

    public void ver(Contenido contenido){
        this.contenidosVistos.add(contenido);
        if (contenido.fueVistoCompletoPor(this)){
            this.contenidosCompletos.add(contenido);
        }
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

    public String generoPreferido(){
      return this.generosQueVio().stream().max(Comparator.comparing(g -> this.minutosPorGenero(g))).get();

    }

    public Integer minutosPorGenero(String genero){
        return this.contenidosVistosPorGenero(genero).stream().mapToInt(c -> c.getDuracion()).sum();
    }

    List<Contenido> contenidosVistosPorGenero(String genero){
        return this.contenidosVistos.stream().filter(c -> c.getGenero().equals(genero)).collect(Collectors.toList());
    }

    public List<Contenido> contenidosRecomendados(){
        return this.contenidosIncompletos();
    }
}

