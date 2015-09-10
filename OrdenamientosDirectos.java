
class OrdenamientosDirectos{

	//ATRIBUTOS
	int []vector;


	//CONSTRUCTOR






	//METODOS

	public void GeneraNumeros(){
		int i;
		for(i= 0; i < vector.length; i++)
			vector[i]= (int)(Math.random()*100);
	}
	
	public void Inicializar(int max){
		vector = new int [max];
	}
	public void Imprimir(int []arr){
		System.out.println(arr);

	}





}