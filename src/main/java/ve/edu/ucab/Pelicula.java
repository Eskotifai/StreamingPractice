package ve.edu.ucab;

public class Pelicula extends ContenidoMultimedia implements ContenidoDescargable{

    private String director;
    private Resolucion resolucion;

    public Pelicula(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito, String director, Resolucion resolucion) {
        super(titulo, genero, duracion, vecesReproducido, esFavorito);
        this.director = director;
        this.resolucion = resolucion;
    }

    public Pelicula(String titulo, String genero, int duracion, String director, Resolucion resolucion) {
        super(titulo, genero, duracion);
        this.director = director;
        this.resolucion = resolucion;
    }

    //    @Override
//    public void reproducir() {
//
//    }
//
//    @Override
//    public void pausar() {
//
//    }
//
//    @Override
//    public int obtenerDuracion() {
//        return 0;
//    }
//
//    @Override
//    public String obtenerTitulo() {
//        return "";
//    }
//
//    @Override
//    public String obtenerGenero() {
//        return "";
//    }
//
//    @Override
//    public boolean esFavorito() {
//        return false;
//    }

    @Override
    public double calcularPuntuacion() {
        int valor = 10;
        if (resolucion == Resolucion.HD){
            valor = 0;
        }
        return getVecesReproducido() * 0.5 + valor;

    }

    @Override
    public double descargar() {
        if (resolucion == Resolucion.HD){
            return 1000;
        } else {
            return 4000;
        }

    }

    @Override
    public boolean verificarEspacioRequerido(double espacioDisponible) {
        if (espacioDisponible > descargar()){
            return true;
        } else {
            return false;
        }

    }
}
