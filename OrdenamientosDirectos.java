
class OrdenamientosDirectos{

	//ATRIBUTOS
	int []a;
	int []b; 
	int []c;
	int max;

	//CONSTRUCTOR
	//SE UTILIZARA EL CONSTRUCTOR PADRE
	
	public static void main(String[] args) {
		OrdenamientosDirectos ordena = new OrdenamientosDirectos();
		Ordenamientos ordenar= new Ordenamientos();
		

		ordena.Inicializar();
		ordena.GeneraNumeros();
		ordena.Imprimir(a);


	}


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
	public void Imprimir(int []arr){
		for (int i=0; i<max ; i++)
		System.out.println(arr);

	}





}