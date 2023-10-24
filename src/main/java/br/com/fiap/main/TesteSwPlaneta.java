package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.StarWars;
import br.com.fiap.services.SwService;

public class TesteSwPlaneta {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		//Instanciar objetos

		SwService sw = new SwService();
		
		String pl = JOptionPane.showInputDialog("Informe o numero do planeta para descricao");
		
		StarWars star = sw.getStarWars(pl);
		
		System.out.println(star);
	}

}
