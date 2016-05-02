package model;
public class Docente extends Usuario{
	String area;
		
	
	public Docente(String area) {
		super();
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	//metódos a serem  implementados
	
	void cadatrarOportunidade(){
	}
	
	void visualizaroportunidade(){	
	}
	
	void perfilLinkedin(){
	}
	
	void supervisionarAluno(){	
	}
	
}
