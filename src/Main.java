public class Main {
    public static void main(String[] args){


        Usuario jonasa=new Usuario();
        Serie laCasaDePapel = new Serie();
        Temporada t1LaCasaDePapel = new Temporada(laCasaDePapel);
        Capitulo cap1LaCasaDePapel = new Capitulo();
        Pelicula rocky = new Pelicula();

        t1LaCasaDePapel.addCapitulo(cap1LaCasaDePapel);

        laCasaDePapel.addTemporada(t1LaCasaDePapel);

        jonasa.ver(cap1LaCasaDePapel);

        System.out.println(jonasa.visteCompleto(laCasaDePapel));

        System.out.println(laCasaDePapel.ultimoCapitulo());
    }
}
