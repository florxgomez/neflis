

public class Main {
    public static void main(String[] args){


        Usuario jonasa = new Usuario();
        Serie laCasaDePapel = new Serie(true);
        Temporada t1LaCasaDePapel = new Temporada(laCasaDePapel);
        Capitulo cap1LaCasaDePapel = new Capitulo(60, t1LaCasaDePapel, true);
        Capitulo cap2LaCasaDePapel = new Capitulo(50, t1LaCasaDePapel, true);

        laCasaDePapel.addTemporada(t1LaCasaDePapel);
         t1LaCasaDePapel.addCapitulo(cap1LaCasaDePapel);
         t1LaCasaDePapel.addCapitulo(cap2LaCasaDePapel);

        cap1LaCasaDePapel.setTemporada(t1LaCasaDePapel);
        cap2LaCasaDePapel.setTemporada(t1LaCasaDePapel);

        System.out.println(t1LaCasaDePapel.getDuracion());

        jonasa.ver(cap1LaCasaDePapel);

        System.out.println(jonasa.visteCompleto(t1LaCasaDePapel));
        System.out.println(jonasa.contenidosIncompletos());

       System.out.println(laCasaDePapel.ultimoCapitulo());

        Pelicula rocky = new Pelicula();

        jonasa.ver(rocky);
        System.out.println(jonasa.visteCompleto(rocky));
        System.out.println(jonasa.getContenidosVistos());
    }
}
