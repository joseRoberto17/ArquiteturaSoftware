package br.usjt.arqsw.controller;

import java.io.IOException;



import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqsw.entity.Usuario;
import br.usjt.arqsw.service.UsuarioService;

/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */

public class UsuarioController {
	UsuarioService us;
	
	@Autowired
	public UsuarioController(UsuarioService us){
		this.us = us;
	}
	
	@RequestMapping("telaLogin")
	public String telaLogin(){
		return "Login";
	}
	
	@RequestMapping("/fazer_Login")
	public String fazerLogin(@Valid Usuario usuario, BindingResult result,HttpSession session){
		try {
			System.out.println("***************** " + usuario.getPassword() + usuario.getUsername());
			if(us.validar(usuario)){
				
				return "index";
			}else{
				return "telaLogin";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}

}
