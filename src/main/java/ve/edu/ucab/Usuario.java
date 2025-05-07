package ve.edu.ucab;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private double espacioDisponible;
    private List<ContenidoReproducible> listaFavoritos;

    public Usuario(String nombre, double espacioDisponible) {
        this.nombre = nombre;
        this.espacioDisponible = espacioDisponible;
        this.listaFavoritos = new ArrayList<>();
    }

    public void agregarFavorito(ContenidoMultimedia contenidoReproducible){
        listaFavoritos.add(contenidoReproducible);
        contenidoReproducible.setEsFavorito(true);
    }
}
