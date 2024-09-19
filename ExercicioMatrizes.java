package treinojava;
public class ExercicioMatrizes {

	public static void main(String[] args) {
	/* Criar um código onde ele apenas reconheça e imprima os números em cima de uma diagonal principal
	 */
	int [][]matriz = {{1,2,3},{4,5,6},{7,8,9}};
	
	// Imprimindo a matriz principal inferior
	for (int h = matriz.length-1; h > -1; h--) {
		for (int j = h; j > -1; j--) {
			System.out.println(matriz[h][j]);
			
		}
	}
	System.out.println();
	System.out.println();
	
	// Imprimindo a matriz principal superior
	for (int e = 0; e < matriz.length; e++) {
		for (int f = e; f < matriz[e].length; f++) {
			System.out.println(matriz[e][f]);
		}
	}
	}
}
