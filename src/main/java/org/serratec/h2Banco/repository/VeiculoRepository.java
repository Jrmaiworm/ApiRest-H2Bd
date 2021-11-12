package org.serratec.h2Banco.repository;

import java.util.Optional;

import javax.validation.Valid;

import org.serratec.h2Banco.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Long>{

	Optional<Veiculo> findById(Long id);

	boolean existsById(@Valid Long id);

	void deleteById(Long id);

}
