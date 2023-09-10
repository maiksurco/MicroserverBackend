package maik.example.msproducto.service;

import maik.example.msproducto.entity.Producto;

import java.util.List;
import java.util.Optional;
public interface ProductoService {
    List<Producto> getAllProductos();

    Optional<Producto> getProductoById(Long id);

    Producto createProducto(Producto producto);

    Producto updateProducto(Long id, Producto producto);

    void deleteProducto(Long id);
}
