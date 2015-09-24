
class OrdenamientosDirectos{

	//ATRIBUTOS
	static int []a;
	static int []b; 
	static int []c;
	static int max;

	//CONSTRUCTOR
	//SE UTILIZARA EL CONSTRUCTOR PADRE
	
	public static void main(String[] args) {
		long tInicio, tFin, tiempo;

		Ordenamientos ordena = new Ordenamientos();
		
		Inicializar();
		GeneraNumeros();
		Imprimir(a);

		tInicio = System.currentTimeMillis();
		ordena.sortIntercambio(a, a.length-1);
		tFin = System.currentTimeMillis();
		System.out.println("El tiempo que se tardo en la ejecucion fue de: "+ tFin - tInicio);
		Imprimir(a);

		tInicio = System.currentTimeMillis();
		ordena.sortSeleccion(b, b.length-1);
		tFin = System.currentTimeMillis();
		System.out.println("El tiempo que se tardo en la ejecucion fue de: "+ tFin - tInicio);
		Imprimir(b);

		tInicio = System.currentTimeMillis();
		ordena.sortInsercion(c, c.length-1);
		tFin = System.currentTimeMillis();
		System.out.println("El tiempo que se tardo en la ejecucion fue de: "+ tFin - tInicio);
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