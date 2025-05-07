package ve.edu.ucab;

public class Serie extends ContenidoMultimedia{
    private int temporadas, episodiosportemporadas;

    public Serie(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito, int episodiosportemporadas, int temporadas) {
        super(titulo, genero, duracion, vecesReproducido, esFavorito);
        this.episodiosportemporadas = episodiosportemporadas;
        this.temporadas = temporadas;
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
}
