package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Usuario;
import com.example.service.UsuarioService;

@RestController
@RequestMapping("/url/login")
public class UsuarioController {
	private UsuarioService usuarioService;
	
	@GetMapping("/lista")
	public List<Usuario> lista(){
		return usuarioService.listaTodos();
	}
}
