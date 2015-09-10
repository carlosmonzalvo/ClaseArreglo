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
		int i,j;
		for (i = 0; i < indice ; i++) {
			for (j = i + 1; j <= indice; j++) {
				if(v[i] > v[j])
				auxcambiaDatos(v, i, j);
			}
		}
	}
	public void SortSeleccion(int[] v, int indice){
		int i,j,im;
		for (i=0; i<indice-1; i++) {
			im=i;
			for (j=i+1; j<=indice; j++) {
				if (v[im]>v[j]) {
					im=j;
				}
			}
			if (i !=im) {
				auxcambiaDatos(v, i, im);
			}
		}
	}
	public void SortInsercion(int [v], int indice){
		int i, j, aux;
		for (i=1; i<=indice ; i++) {
			j=i;
			aux= v[i];
			while(j>0 && v[j-1]>aux){
				v[j] = v[j-1];
				j--;
			}
			v[j]=aux;
		}
	}

}