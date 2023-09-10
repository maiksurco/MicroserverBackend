package maik.example.mscatalogo.controller;

import maik.example.mscatalogo.entity.Catalogo;
import maik.example.mscatalogo.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
    @Autowired
    private CatalogoService catalogoService;
    @GetMapping()
    public ResponseEntity<List<Catalogo>> list() {
        return ResponseEntity.ok().body(catalogoService.listar());
    }
    @PostMapping()
    public ResponseEntity<Catalogo> save(@RequestBody Catalogo categoria) {return ResponseEntity.ok(catalogoService.guardar(categoria));
    }
    @PutMapping()
    public ResponseEntity<Catalogo> update(@RequestBody Catalogo categoria) {return ResponseEntity.ok(catalogoService.actualizar(categoria));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Catalogo> listById(@PathVariable(required = true) Integer id) {return ResponseEntity.ok().body(catalogoService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {catalogoService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }

}
