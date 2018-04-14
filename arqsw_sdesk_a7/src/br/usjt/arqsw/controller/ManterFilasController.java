package br.usjt.arqsw.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;
import br.usjt.arqsw.service.FilaService;
/**
 * Filippe do Nascimento Valentim	
 * RA 81612333
 * Turma SI3AN-MCA
 *
 */
@Transactional
@Controller("/fila")
public class ManterFilasController {
	private FilaService filaService;
	@Autowired
	private ServletContext servletContext;

	@Autowired
	public ManterFilasController(FilaService fs) {
		filaService = fs;
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("index")
	public String inicio() {
		return "index";
	}

	private List<Fila> listarFilas() throws IOException {
		return filaService.listarFilas();
	}

	/**
	 * 
	 * @param model
	 *            Acesso à request http
	 * @return JSP de Listar Chamados
	 */
	@RequestMapping("/listar_filas")
	public String listarFilasExibir(Model model) {
		try {
			model.addAttribute("filas", listarFilas());
			return "FilaListar";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}

	@RequestMapping("/novaFila")
	public String novoChamado(Model model) {
		return "NovaFila";
	}

	@RequestMapping("/salvarFila")
	public String salvarChamado(@Valid Fila fila, BindingResult result, 
			Model model, @RequestParam("file") MultipartFile file) {

		try {
			System.out.println(fila.getNome());
			filaService.novaFila(fila);
			model.addAttribute("filas", listarFilas());
			filaService.gravarImagem(servletContext, fila, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FilaListar";
	}
	
	@RequestMapping("/excluir_fila")
	public String excluirChamado(int id, Model model) {
		try {
			Fila fila = new Fila();
			fila.setId(id);
			filaService.excluirFila(fila);
			model.addAttribute("filas", listarFilas());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FilaListar"; 
	}
	
	
}
