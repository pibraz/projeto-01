package me.dio.projeto_01.domain.repository;

import jdk.jfr.Registered;
import me.dio.projeto_01.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
