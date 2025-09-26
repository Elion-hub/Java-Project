package dominio;

import java.util.Objects;

public class Pelicula {
    private String name;

    public Pelicula() {
    }

    public Pelicula(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //compara dos objetos: el obj con el que estamos trabajando con un nuevo objeto
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(name, pelicula.name);
    }
    // devuelve un valor numérico que permite identificar de manera única al objeto
    @Override
    public int hashCode() {
        return name != null? name.hashCode(): 0;
    }

    @Override
    public String toString() {
        return this.name;
    }

}