package viana.vkmotocar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import viana.vkmotocar.model.Gasto;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long> {
}