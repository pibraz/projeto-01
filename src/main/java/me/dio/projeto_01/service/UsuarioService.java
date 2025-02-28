package me.dio.projeto_01.service;

import me.dio.projeto_01.domain.model.Usuario;

public interface UsuarioService {
    Usuario findById(Long id);
    Usuario create(Usuario usuarioToCreate);

}
