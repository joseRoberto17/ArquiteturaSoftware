package br.usjt.arqsw.mapeamento;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class AutorizadorInterceptor extends HandlerInterceptorAdapter {
	@Override
    public boolean preHandle(HttpServletRequest request,
        HttpServletResponse response,
        Object controller) throws Exception {
    	String uri = request.getRequestURI();
        if (uri.endsWith("telaLogin") || uri.endsWith("Login") ||
            uri.contains("css") || uri.contains("jsp") ||
            uri.contains("img") || uri.contains("index")) {
            return true;
        }
        if (request.getSession().getAttribute("usuarioLogado") != null) {
            return true;
        }
        response.sendRedirect("index");
        return false;
    }
}

