package me.dio.projeto_01.service.impl;

import me.dio.projeto_01.domain.model.Usuario;
import me.dio.projeto_01.domain.repository.UsuarioRepository;
import me.dio.projeto_01.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public Usuario findById(Long id) {
        return null;
    }

    @Override
    public Usuario create(Usuario usuarioToCreate) {
        if (usuarioRepository.existsByContaNumero(usuarioToCreate.getConta().getNumero())){
            throw new IllegalArgumentException("O usuario já está cadastrado.");
        }
        return usuarioRepository.save(usuarioToCreate);
    }
}
