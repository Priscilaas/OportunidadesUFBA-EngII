package controller;

public class ContrataController {
	int dataAdmissao;
	int dataVencimento;
	String termos;

	public ContrataController(int dataAdmissao, int dataVencimento, String termos) {
		super();
		this.dataAdmissao = dataAdmissao;
		this.dataVencimento = dataVencimento;
		this.termos = termos;
	}

	public int getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(int dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(int dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getTermos() {
		return termos;
	}

	public void setTermos(String termos) {
		this.termos = termos;
	}

	//metodos a serem implementados
	
	void relatorioSemestral(){
	}
	
	void contrato (){
	}
		
}

