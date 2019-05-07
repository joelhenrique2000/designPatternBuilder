package main;

import model.Pessoa;

public class View {
	public static void main(String args[]) {
		
		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.nome("Joel")
				.ultimoNome("Santos")
				.nomeDoMeio("Henrique")
				.apelido("")
				.nomeDoPai("Edvaldo")
				.criar();

	}
}
