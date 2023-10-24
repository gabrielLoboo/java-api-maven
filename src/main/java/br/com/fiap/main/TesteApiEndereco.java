package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteApiEndereco {

	
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		// Instanciar objetos
	
		ViaCepService viaCep = new ViaCepService();
		
		String cep = JOptionPane.showInputDialog("Informe o cep a ser pesquisado");
		
		Endereco endereco = viaCep.getEndereco(cep);
		
		System.out.println(endereco);
		
	}

}
