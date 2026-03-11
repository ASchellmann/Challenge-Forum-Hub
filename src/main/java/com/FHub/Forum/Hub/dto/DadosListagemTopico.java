package com.FHub.Forum.Hub.dto;

import java.time.LocalDateTime;

import com.FHub.Forum.Hub.domain.Topico;

public record DadosListagemTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        String autor,
        String curso) {
    public DadosListagemTopico(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}