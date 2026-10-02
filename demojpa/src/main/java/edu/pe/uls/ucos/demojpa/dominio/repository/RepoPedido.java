package edu.pe.uls.ucos.demojpa.dominio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.pe.uls.ucos.demojpa.dominio.entity.Pedido;

public interface RepoPedido extends JpaRepository<Pedido, Integer> {

}