package edu.pe.uls.ucos.demojpa;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-02T22:49:47+0000",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.7.1.jar, environment: Java 25.0.4.1 (Microsoft)"
)
@Component
public class MapperRepuestoImpl implements MapperRepuesto {

    @Override
    public Repuesto toRepuesto(RequestRepuesto request) {
        if ( request == null ) {
            return null;
        }

        Repuesto repuesto = new Repuesto();

        repuesto.setNombre( request.nombre() );
        repuesto.setMarca( request.marca() );
        repuesto.setPrecio( request.precio() );

        return repuesto;
    }

    @Override
    public ResponseRepuesto toResponse(Repuesto repuesto) {
        if ( repuesto == null ) {
            return null;
        }

        int id = 0;
        String nombre = null;
        String marca = null;
        double precio = 0.0d;

        id = repuesto.getId();
        nombre = repuesto.getNombre();
        marca = repuesto.getMarca();
        precio = repuesto.getPrecio();

        ResponseRepuesto responseRepuesto = new ResponseRepuesto( id, nombre, marca, precio );

        return responseRepuesto;
    }
}
