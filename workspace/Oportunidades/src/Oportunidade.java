public class Oportunidade {

	String titulo;
	String area;
	String descricao;
	int cargaHoraria;	
	int remuneracao;
//Construtor	
	public Oportunidade(String titulo, String area, String descricao, int cargaHoraria, int remuneracao) {
		super();
		this.titulo = titulo;
		this.area = area;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.remuneracao = remuneracao;
	}
//FimConstrutor
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(int remuneracao) {
		this.remuneracao = remuneracao;
	}

	
	//metodo a ser implementado 
	
	void cadastrarOportunidade(){
	}
	
}
