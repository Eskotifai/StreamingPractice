package ve.edu.ucab;

public interface ContenidoReproducible {
    void reproducir();
    void pausar();
    int obtenerDuracion();
    String obtenerTitulo();
    String obtenerGenero();
    boolean esFavorito();
}
