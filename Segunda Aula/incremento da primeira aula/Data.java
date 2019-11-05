public class Data{

	int dia;
	int mes;
	int ano;
	
	String formatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	void setDia(int dia){
		if(dia <= 31){
			this.dia = dia;
		}
	}

	void setMes(int mes){
		if(mes <= 11){
			this.mes = mes;
		}
	}

	void setAno(int ano){
		if(ano >= 2019){
			this.ano = ano;
		}
	}

}
