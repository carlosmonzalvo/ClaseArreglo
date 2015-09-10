
class OrdenamientosDirectos{

	//ATRIBUTOS
	int []a;
	int []b; 
	int []c;
	int max;

	//CONSTRUCTOR


	//METODOS

	public void GeneraNumeros(){
		int i;
		for(i= 0; i < max; i++)
			a[i]= b[i]= c[i]= (int)(Math.random()*100);
	}
	
	public void Inicializar(){

		max = Teclado.LeeEntero("Dame el tamaño del arreglo: ");
		a = b = c =  new int [max];
	}
	public void Imprimir(){
		for (int i=0; i<max ; i++)
		System.out.println(a);

	}





}