public class Tree<T> {
	private Node<T> Root;

	public Node<T> getRoot() {
		return Root;
	}

	public void setRoot(Node<T> root) {
		Root = root;
	}
	
	public void walkInTree(Node<T> node) {
		System.out.println(node.getValue());
		
		for(Node<T> children: node.getChildren()) {
			this.walkInTree(children);
		}
	}
	
	/*
	adicionar
	remover
	percorrer
	busca em largura: quantos n�s existem?
	busca profundidade: n� folha com maior dist�ncia do n� raiz
	profundidade x largura: �rvores com pouca hierarquia podem se tornar listas, com um n�vel de largura e muita profundidade.
	N�meros baixos de compara��es por causa das podas
	*/
	
	//busca em largura (BFS)
	//come�a pela raiz e percorre seus filhos at� n�o tiver mais filhos
	
	//busca em profundidade (DFS)
	
}


