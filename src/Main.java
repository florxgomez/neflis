public class Main {
    public static void main(String[] args){


        Usuario jonasa = new Usuario();
        Serie laCasaDePapel = new Serie();
        Temporada t1LaCasaDePapel = new Temporada(laCasaDePapel);
        Capitulo cap1LaCasaDePapel = new Capitulo();

        laCasaDePapel.addTemporada(t1LaCasaDePapel);
         t1LaCasaDePapel.addCapitulo(cap1LaCasaDePapel);

        jonasa.ver(cap1LaCasaDePapel);
        System.out.println(t1LaCasaDePapel.getCapitulos());
        System.out.println(laCasaDePapel.getTemporadas());
        System.out.println(jonasa.visteCompleto(t1LaCasaDePapel));

         System.out.println(laCasaDePapel.ultimoCapitulo());

        Pelicula rocky = new Pelicula();

        jonasa.ver(rocky);
        System.out.println(jonasa.visteCompleto(rocky));
    }
}
