package ve.edu.ucab;

public class AudioLibro extends ContenidoMultimedia implements ContenidoDescargable{
    private String narrador;
    private double sizeMB;

    public AudioLibro(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito) {
        super(titulo, genero, duracion, vecesReproducido, esFavorito);
    }

    @Override
    public void reproducir() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public int obtenerDuracion() {
        return 0;
    }

    @Override
    public String obtenerTitulo() {
        return "";
    }

    @Override
    public String obtenerGenero() {
        return "";
    }

    @Override
    public boolean esFavorito() {
        return false;
    }

    @Override
    public double calcularPuntuacion() {
        return 0;
    }

    @Override
    public double descargar() {
        return 0;
    }

    @Override
    public boolean verificarEspacioRequerido(double espacioDisponible) {
        return false;
    }
}
