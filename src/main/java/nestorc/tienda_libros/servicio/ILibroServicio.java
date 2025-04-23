package nestorc.tienda_libros.servicio;

import nestorc.tienda_libros.modelo.Libro;
import nestorc.tienda_libros.repositorio.LibroRepositorio;

import java.util.List;

public interface ILibroServicio {
    public List<Libro> listarLibros();

    public Libro buscarLibroPorId(Integer idLibro);

    public void guardarLibro(Libro libro);

    public void eliminaLibro(Libro libro);


}
