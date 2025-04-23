package nestorc.tienda_libros.servicio;

import nestorc.tienda_libros.modelo.Libro;
import nestorc.tienda_libros.repositorio.LibroRepositorio;

import java.util.List;

public class LibroServicio implements ILibroServicio{

    private LibroRepositorio libroRepositorio;

    @Override
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro buscarLibroPorId(Integer idLibro) {
        Libro libro = libroRepositorio.findById(idLibro).orElse(null);
        return libro;
    }

    @Override
    public void guardarLibro(Libro libro) {
        libroRepositorio.save(libro);
    }

    @Override
    public void eliminaLibro(Libro libro) {
        libroRepositorio.delete(libro);
    }
}
