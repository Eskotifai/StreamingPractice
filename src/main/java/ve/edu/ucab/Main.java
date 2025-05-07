package ve.edu.ucab;

public class Main {
    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("Chuky", "amor", 7, "el quijote", Resolucion._4K);
        Pelicula pelicula2 = new Pelicula("Son carajitos", "Comedia", 2, "nose", Resolucion.HD);
        Usuario usuario = new Usuario("tralala", 10000);
        usuario.agregarFavorito(pelicula);
    }
}