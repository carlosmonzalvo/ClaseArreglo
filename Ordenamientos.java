/*
Metodos de odenamiento directo
-intercambio
-seleccion
-inserccion
*/
class Ordenamientos{

	private void auxcambiaDatos(int []v,int i, int j){
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	public void SortIntercambio(int []v, int indice){
		for (int i = 0; i < indice ; i++) {
			for (int j = 1; j <= indice; j++) {
				if(v[i] > v[j])
				auxcambiaDatos(v, i, j);
			}
		}
	}

}