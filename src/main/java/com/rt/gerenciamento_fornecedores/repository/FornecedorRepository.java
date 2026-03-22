package com.rt.gerenciamento_fornecedores.repository;

import com.rt.gerenciamento_fornecedores.models.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
