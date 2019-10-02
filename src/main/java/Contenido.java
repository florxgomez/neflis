
public interface Contenido {
    Boolean esDestacado();
    Boolean fueVistoCompletoPor(Usuario usuario);
    Boolean actuo(Actor actor);
    String getGenero();
    Integer getDuracion();
}
