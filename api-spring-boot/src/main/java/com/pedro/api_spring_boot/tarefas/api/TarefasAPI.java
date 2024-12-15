package com.pedro.api_spring_boot.tarefas.api;

import com.pedro.api_spring_boot.tarefas.dto.TarefaDTO;
import com.pedro.api_spring_boot.tarefas.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/tarefas", produces = MediaType.APPLICATION_JSON_VALUE)
public class TarefasAPI {

    @Autowired
    private TarefasService tarefasService;

    @PostMapping
    @ResponseBody
    public TarefaDTO criar(@RequestBody TarefaDTO tarefaDTO){
        return tarefasService.criar(tarefaDTO);
    }

    @PutMapping("/{tarefaId}")
    @ResponseBody
    public TarefaDTO atualizar(@PathVariable("tarefaId") Long tarefaId, @RequestBody TarefaDTO tarefaDTO){
        return tarefasService.atualizar(tarefaDTO, tarefaId);
    }

    @GetMapping
    @ResponseBody
    public List<TarefaDTO> getAll(){
        return tarefasService.getAll();
    }

    @DeleteMapping("/{tarefaId}")
    @ResponseBody
    public String deletar(@PathVariable("tarefaId") Long tarefaId){
        return tarefasService.delete(tarefaId);
    }
}
