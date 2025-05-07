package ve.edu.ucab;

public abstract class ContenidoMultimedia implements ContenidoReproducible {

    private String titulo, genero;
    private int duracion, vecesReproducido;
    private boolean esFavorito;

    public ContenidoMultimedia(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.vecesReproducido = vecesReproducido;
        this.esFavorito = esFavorito;
    }

    public ContenidoMultimedia(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.vecesReproducido = 0;
        this.esFavorito = false;
    }

    public int getVecesReproducido() {
        return vecesReproducido;
    }



    @Override
    public void reproducir() {
        vecesReproducido++;
        System.out.println("Reproduciendo... ");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado. ");
    }

    @Override
    public int obtenerDuracion() {
        return duracion;
    }

    @Override
    public String obtenerTitulo() {
        return titulo;
    }

    @Override
    public String obtenerGenero() {
        return genero;
    }

    @Override
    public boolean esFavorito() {
        return esFavorito;
    }

    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }

    protected void registrarInteraccion(){
        System.out.println("Interaccion registrada. " + "("+titulo + ")" + "("+ genero + ")");
    }

    public abstract double calcularPuntuacion();



}
