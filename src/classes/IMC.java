package classes;

public class IMC {

	
	public Double calcularImc(double peso, double altura){
		
		return peso/(altura*altura);
	
		
	}
	
	
	
	public String mostraSituacao(String sexo, double imc){
	
	String resultado=" ";
	
	
	if(sexo.equalsIgnoreCase("masculino")){
	
		if(imc< 20.7){
			resultado= "Abaixo do Peso";
			
		}else if(imc < 26.4){
			resultado = "Peso Ideal";
			
		}else if(imc < 27.8){
			resultado= "Sobrepeso";
			
		}else if(imc < 31.1){
			resultado= "Obesidade 1 ou Moderada";
			
		}else{ 
			resultado= "Obesidade Morbida";
			
		}
		
	
	}else{
	
		if(imc< 19.1){
			resultado= "Abaixo do Peso";
			
		}else if(imc < 25.8){
			resultado = "Peso Ideal";
			
		}else if(imc < 27.3){
			resultado= "Sobrepeso";
			
		}else if(imc < 32.3){
			resultado= "Obesidade 1 ou Moderada";
			
		}else{ 
			resultado= "Obesidade Morbida";
			
		}
		
		
	
	}
	
	
	
	
	
	return resultado;
	
	
	
	}//fim
	
}//fim class
