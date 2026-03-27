package com.loja.repositorio;

import com.loja.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {
    private List<Usuario> lista = new ArrayList<>();

    public void adicionar(Usuario u) {
        lista.add(u);
    }

    public List<Usuario> listar() {
        return lista;
    }
}
