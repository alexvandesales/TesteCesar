class IntersectList
{
	static class Node 
	{ 
        	int valor; 
        	Node proximo; 
  
        	Node(int x) 
        	{ 
            		valor = x; 
            		proximo = null; 
        	} 
    	}

	static Node lista1, lista2; 
  
       	int getNode() 
    	{ 
        	int qtdeLista1 = getQtde(lista1); 
        	int qtdeLista2 = getQtde(lista2); 
        	int diff; 
  
        	if (qtdeLista1 > qtdeLista2) 
		{ 
            		diff = qtdeLista1 - qtdeLista2; 
            		return Intersect(diff, lista1, lista2); 
        	} 
        	else 
		{ 
            		diff = qtdeLista2 - qtdeLista1; 
            		return Intersect(diff, lista2, lista1); 
        	} 
   	} 
  
	int Intersect(int diff, Node lista1, Node lista2) 
	{ 
        	int i; 
        	Node copia1 = lista1; 
        	Node copia2 = lista2; 
        
		for (i = 0; i < diff; i++) 
		{ 
            		if (copia1 == null) 
			{ 
                		return -1; 
            		} 
            		copia1 = copia1.proximo; 
        	} 
        	while (copia1 != null && copia2 != null) 
		{ 
            		if (copia1.valor == copia2.valor) 
			{ 
                		return copia1.valor; 
            		} 
            		copia1 = copia1.proximo; 
            		copia2 = copia2.proximo; 
        	} 
  
        	return -1; 
	} 
  
	int getQtde(Node node) 
	{ 
        	Node copia = node; 
        	int count = 0; 
  
        	while (copia != null) 
		{ 
            		count++; 
            		copia = copia.proximo; 
        	} 
  
        	return count; 
	} 
  
	public static void main(String[] args) 
	{ 
  		IntersectList listaPrincipal = new IntersectList(); 
  
        	listaPrincipal.lista1 = new Node(1); 
        	listaPrincipal.lista1.proximo = new Node(2); 
        	listaPrincipal.lista1.proximo.proximo = new Node(3); 
        	listaPrincipal.lista1.proximo.proximo.proximo = new Node(4); 
        	listaPrincipal.lista1.proximo.proximo.proximo.proximo = new Node(5); 
  
        	listaPrincipal.lista2 = new Node(6); 
        	listaPrincipal.lista2.proximo = new Node(4); 
        	listaPrincipal.lista2.proximo.proximo = new Node(7);  
  
        	System.out.println("O elemento de intersecção é " + listaPrincipal.getNode()); 
	} 
} 