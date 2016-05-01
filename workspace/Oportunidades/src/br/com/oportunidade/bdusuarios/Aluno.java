package br.com.oportunidade.bdusuarios;

public class Aluno extends Usuario {
	int matricula;
	int semestreAtual;
	int previsaoConclusao; 
	String Curso;
	String qualificacao;
	String experiencia;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getSemestreAtual() {
		return semestreAtual;
	}

	public void setSemestreAtual(int semestreAtual) {
		this.semestreAtual = semestreAtual;
	}

	public int getPrevisaoConclusao() {
		return previsaoConclusao;
	}

	public void setPrevisaoConclusao(int previsaoConclusao) {
		this.previsaoConclusao = previsaoConclusao;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}

	public String getQualificacao() {
		return qualificacao;
	}

	public void setQualificacao(String qualificacao) {
		this.qualificacao = qualificacao;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
//metodos para serem implementados
	void interesseArea(){	
	}
	
	void visualizarOportunidade(){
	}
	
	void concorrerOportunidade(){
	}
	
	void perfilLinkedin(){
	}
	
	void cadastrarSistema(){
	}
}
