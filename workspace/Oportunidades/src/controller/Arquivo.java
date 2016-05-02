package controller;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Docente;
import model.Empresa;
import model.Oportunidade;

public class Arquivo extends EscolherArquivo{
	
	private BufferedWriter bw = null;
	private BufferedReader fr = null;
	
	/*
	 * 		Aluno
	 */
	
	public void salvarArquivoAluno(Aluno aluno) throws IOException{
		
		try{
			String CadastroCompleto = null;
			
			CadastroCompleto = "<id>"+aluno.getId()
					+"<nome>"+aluno.getNome().toString()
					+"<email>"+aluno.getEmail().toString()
					+"<senha>"+aluno.getSenha()
					+"<telefone>"+aluno.getTelefone().toString()
					+"<matricula>"+aluno.getMatricula()
					+"<semestreAtual>"+aluno.getSemestreAtual()
					+"<previsaoConclusao>"+aluno.getPrevisaoConclusao()
					+"<Curso>"+aluno.getCurso()
					+"<qualificacao>"+aluno.getQualificacao()
					+"<experiencia>"+aluno.getExperiencia();
			
			bw = new BufferedWriter(new FileWriter(buscarArquivoSalvar("aca"), true));  
			bw.write(CadastroCompleto);
			bw.newLine();
			bw.flush();
			bw.close(); 
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
			
		}catch(Exception e){ 
			JOptionPane.showMessageDialog(null, "Exception Caught : " +e.getMessage());
		}finally{

		}
	} 

/*
 * 		Docente
 */


public void salvarArquivoDocente(Docente docente) throws IOException{
	
	try{
		String CadastroCompleto = null;
		CadastroCompleto = "<id>"+docente.getId()
						+"<nome>"+docente.getNome().toString()
						+"<email>"+docente.getEmail().toString()
						+"<senha>"+docente.getSenha()
						+"<telefone>"+docente.getTelefone().toString()
						+"<area>"+docente.getArea();

		bw = new BufferedWriter(new FileWriter(buscarArquivoSalvar("aca"), true));  
		bw.write(CadastroCompleto);
		bw.newLine();
		bw.flush();
		bw.close(); 
		JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

	}catch(Exception e){ 
	JOptionPane.showMessageDialog(null, "Exception Caught : " +e.getMessage());
	}finally{
	
	}
	} 

/*
 * 		Empresa
 */


public void salvarArquivoEmpresa(Empresa empresa) throws IOException{
	
	try{
		String CadastroCompleto = null;
		CadastroCompleto = "<id>"+empresa.getId()
						+"<nome>"+empresa.getNome().toString()
						+"<email>"+empresa.getEmail().toString()
						+"<senha>"+empresa.getSenha()
						+"<telefone>"+empresa.getTelefone().toString();

		bw = new BufferedWriter(new FileWriter(buscarArquivoSalvar("ace"), true));  
		bw.write(CadastroCompleto);
		bw.newLine();
		bw.flush();
		bw.close(); 
		JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

	}catch(Exception e){ 
	JOptionPane.showMessageDialog(null, "Exception Caught : " +e.getMessage());
	}finally{
	
	}
	} 
/*
 * 	Oportunidades
 */


public void salvarArquivoOportunidade(Oportunidade oportunidade) throws IOException{
	
	try{
		String CadastroCompleto = null;
		CadastroCompleto = "<titulo>"+oportunidade.getTitulo().toString()
						+"<area>"+oportunidade.getArea().toString()
						+"<descricao>"+oportunidade.getDescricao().toString()
						+"<cargahoraria>"+oportunidade.getCargaHoraria()
						+"<remuneracao>"+oportunidade.getRemuneracao();

		bw = new BufferedWriter(new FileWriter(buscarArquivoSalvar("aco"), true));  
		bw.write(CadastroCompleto);
		bw.newLine();
		bw.flush();
		bw.close(); 
		JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

	}catch(Exception e){ 
	JOptionPane.showMessageDialog(null, "Exception Caught : " +e.getMessage());
	}finally{
	
	}
	}

	
}