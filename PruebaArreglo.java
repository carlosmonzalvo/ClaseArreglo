class PruebaArreglo {

	public static int ListaMenu(){
		int opcion;
		do{
		opcion = Teclado.LeeEntero("1) Insertar\n2) Listar\n3) Actualizar\n4) Buscar\n5) Elimanar\n6) Ordenar\n7) Salir\n");
		if (opcion > 7 || opcion < 1)
			System.out.println("Error: opcion no valida");
		}while(opcion>7 || opcion<1);

		return opcion;

	}
	public static void main(String[] args) {
		//variables locales
		int dato, pos, max, opcion;
		Arreglo miarreglo; // Aqui se declara el objeto de tipo arreglo

		max = Teclado.LeeEntero("Dame el tamaño del Arreglo: ");
		miarreglo = new Arreglo(max); //aqui se crea el objeto arreglo

		do{
			opcion = ListaMenu();
			switch (opcion){
				case 1: if (miarreglo.ValidarEspacio()){
					dato = Teclado.LeeEntero("Dame numero: ");
					miarreglo.Insertar(dato);
					//tambien se puede escribir en una sola linea y seria ( miarreglo.Insertar(Teclado.entero("Dame numero: ")); )
				}
				else
					System.out.println("No existe espacio en el arreglo");
				break;

				case 2: miarreglo.Listar();
					break;

				case 3: dato = Teclado.LeeEntero("Dame el dato de actualizar: ");
					pos = miarreglo.Buscar(dato);
					if(pos != -1)
						miarreglo.Actualizar(pos);
					break;
				case 4: dato = Teclado.LeeEntero("Dame el dato para buscar: ");
					pos = miarreglo.Buscar(dato);
					if(pos != -1)
						miarreglo.Listar(pos);
					break;
				case 5: dato = Teclado.LeeEntero("Dame el dato para borrar: ");
				 	pos = miarreglo.Buscar(dato);
					if(pos != -1){
						dato = miarreglo.Borrar(pos);
						System.out.println("El dato eliminado es: " + dato);
						}
					break;
				case 6: miarreglo.Ordenar();
					break;
			}
		}while(opcion != 7);
	}
}