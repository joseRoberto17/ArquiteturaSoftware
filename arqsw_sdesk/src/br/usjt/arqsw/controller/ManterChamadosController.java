package br.usjt.arqsw.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;
import br.usjt.arqsw.service.ChamadoService;
import br.usjt.arqsw.service.FilaService;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 		   816113694
 *         Si3AN-MCA2
 *         ArqSw
 */
@Controller
public class ManterChamadosController {
	private FilaService filaService;
	private ChamadoService cs;

	public ManterChamadosController() {
		filaService = new FilaService();
		cs			= new ChamadoService();
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("index")
	public String inicio() {
		return "index";
	}

	private List<Fila> listarFilas() throws IOException{
			return filaService.listarFilas();
	}
	
	private List<Chamado> listarChamado() throws IOException{
		return cs.listarFilas();
}
	
	/**
	 * 
	 * @param model Acesso Ã  request http
	 * @return JSP de Listar Chamados
	 */
	@RequestMapping("/listar_filas_exibir")
	public String listarFilasExibir(Model model) {
		try {
			model.addAttribute("filas", listarFilas());
			return "ChamadoListar";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}
	
	@RequestMapping("/listar_chamados_exibir")
	public String listarChamadosExibir(@Valid Chamado fila, BindingResult result, Model model) {
		try {
			if (result.hasFieldErrors("id")) {
				model.addAttribute("filas", listarFilas());
				System.out.println("Deu erro " + result.toString());
				return "ChamadoListar";
				//return "redirect:listar_filas_exibir";
			}
			fila = cs.carregar(fila.getId());

			model.addAttribute("filas", listarChamado());
			System.out.println("Fufu " + listarChamado());
	
			return "ChamadoListarExibir";

		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}
	
	
	@RequestMapping("/criar_chamado")
	public String criarChamado(Model model) {
		try {
			model.addAttribute("filas", listarFilas());
			return "CriarChamado";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}
	
	@RequestMapping(value = "/Criar", method = RequestMethod.POST)
	public String sChamado(@Valid Chamado c, BindingResult result, Model model){
		try{
			
			model.addAttribute(c);
			this.cs.criar(c);
			System.out.println("Cadastro " + c);
			return "index";
		}
		
	 catch (IOException e) {
		e.printStackTrace();
		return "Erro";
	}
		
	}
	
		
	

}
