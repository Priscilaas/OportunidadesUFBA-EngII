package controller;

import java.io.IOException;

import model.Aluno;

public class AlunoController {
	
	//private Aluno aluno;
	
	public boolean cadastraAluno(Aluno aluno) {
		
		Arquivo arquivo = new Arquivo();
	
		try {
			arquivo.salvarArquivoAluno(aluno);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean informarInteresse(Aluno interesse){
            Arquivo arquivo = new Arquivo();
	
		try {
			arquivo.salvarArquivoAluno(interesse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
