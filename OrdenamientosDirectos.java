
class OrdenamientosDirectos{

	//ATRIBUTOS
	static int []a;
	static int []b; 
	static int []c;
	static int max;

	//CONSTRUCTOR
	//SE UTILIZARA EL CONSTRUCTOR PADRE
	
	public static void main(String[] args) {

		Ordenamientos ordena = new Ordenamientos();
		
		Inicializar();
		GeneraNumeros();
		Imprimir(a);
		ordena.sortIntercambio(a, a.length-1);
		Imprimir(a);
		ordena.sortSeleccion(b, b.length-1);
		Imprimir(b);
		ordena.sortInsercion(c, c.length-1);
		Imprimir(c);
		

	}
	//METODOS

	public static void GeneraNumeros(){
		int i;
		for(i= 0; i < max; i++)
			a[i]= b[i]= c[i]= (int)(Math.random()*100);
	}
	
	public static void Inicializar(){

		max = Teclado.LeeEntero("Dame el tamaño del arreglo: ");
		a = b = c =  new int [max];
	}
	public static void Imprimir(int []arr){
		for (int i=0; i<max ; i++)
		System.out.println(arr);

	}


}