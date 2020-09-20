import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class main {

	public static void treinandoHashMap() {
		System.out.println("=> Explicação: ");
		System.out.println("O HashMap armazena um par chave/valor e você pode acessar os valores por suas chaves.");

		System.out.println("\n=> Criando hashMap ...");
		HashMap<String, String> capitalECidades = new HashMap<String, String>();

		System.out.println("=> Adicionando no hashMap ... ");
		capitalECidades.put("England", "London");
		capitalECidades.put("Germany", "Berlin");
		capitalECidades.put("Norway", "Oslo");
		capitalECidades.put("USA", "Washington DC");

		System.out.println("=> Exibindo ... ");
		for (String i : capitalECidades.keySet()) {
			System.out.println("Exibindo as chaves ... " + i);
		}

		System.out.println("\n");

		for (String i : capitalECidades.values()) {
			System.out.println("Exibindo os valores: " + i);
		}

	}

	public static void treinandoLinkedList() {
		System.out.println("=> Explicação: ");
		System.out.println("Assim como o arrayList, o linkedList cria uma coleção de dados do mesmo tipo."
				+ "Você pode utilizar todos os métodos do arrayList aqui =) e qual a diferença ? ");
		System.out.println(
				"\nO linkedList armazena seus itens em containers. A lista contém um link para o primeiro container da lista "
						+ "\ne este, por sua vez, possui um link que aponta para o próximo da lista.");
		LinkedList<String> anos = new LinkedList<>();

		anos.add("2020");
		anos.add("2019");
		anos.add("2018");

		System.out.println("\n=> Imprimindo arrayList ... => " + anos);
	}

	public static void treinandoArrayList() {

		System.out.println("=> Explicação: ");
		System.out
				.println("A maior diferença entre um array e um ArrayList é que o arrayList permite você adicionar ou "
						+ "remover sempre que quiser \nenquanto o array não pode ter seu tamanho modificado.Se o array não for grande o suficiente,"
						+ "\num novo array é criado e o antigo é removido. ");

		System.out.println("\n=> Criando um arrayList ...");
		ArrayList<String> modeloDeCarros = new ArrayList<>();

		System.out.println("=> Adicionando no arrayList ... ");
		modeloDeCarros.add("Fiat");
		modeloDeCarros.add("Palio");
		modeloDeCarros.add("Fox");
		modeloDeCarros.add("C3");

		System.out.println("\n=> Exibindo arrayList ... => " + modeloDeCarros);
		System.out.println("=> Acessando arrayList ...");

		for (int i = 0; i < modeloDeCarros.size(); i++)
			System.out.println(i + " " + modeloDeCarros.get(i));

	}

	public static void usandoIterator() {

		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("nino");
		nomes.add("alison");
		nomes.add("elayne");

		System.out.println("\n=> ArrayList => " + nomes);
		System.out.println("\nPopulando HashMap com o arrayList criado ... ");

		HashMap<Integer, String> listaDeNomes = new HashMap<>();

		for (int posicao = 0; posicao < nomes.size(); posicao++)
			listaDeNomes.put(posicao, nomes.get(posicao));

		System.out.println("\n=> HashMap => " + listaDeNomes);
		System.out.println("\nUtilizando iterator ... ");

		Iterator<Integer> itr = listaDeNomes.keySet().iterator(); // Objeto que percorre uma collection

		while (itr.hasNext()) { // hasNext() retorna verdadeiro se a iteração tiver mais elementos
			Object key = itr.next(); // next() retorna o próximo elemento da iteração
			String nome = listaDeNomes.get(key);

			if (nome.toString().equals("nino")) {
				System.out.println("Apagando conjunto chave/valor encontrado ... ");
				itr.remove(); // remove da coleção subjacente o último elemento retornado por este iterator
			}

		}

		System.out.println("\n=> Resultado após remoção => " + listaDeNomes);

	}

	public static void main(String[] args) {
//		usandoIterator();
//		treinandoArrayList ();
//		treinandoLinkedList ();
//		treinandoHashMap();
	}

}
