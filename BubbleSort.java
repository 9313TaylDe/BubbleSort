package projeto_taylor;

public class BubbleSort {
	public static void main(String[] args) {
		jogo();
	}

	public static void jogo() {
		int vetor[] = {4,3,5,1,7,8,3,2,9,10,6};
		boolean controle;
		int aux;

		for(int i = 0; i < vetor.length; i ++) {
			controle = true;
			for(int j = 0; j < (vetor.length - 1); j ++) {
				if(vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
				    vetor[j] = vetor[j+1];
				    vetor[j + 1] = aux;
				controle = false;
			}
			}
			if(controle) {
				break;
		}

		}
		for (int element : vetor) {
			System.out.format("Os valores corretos são: %d\n", element);
		}
	}
}
