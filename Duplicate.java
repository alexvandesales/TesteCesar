class Duplicate
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
    
	static Node list; 
  
	void RemoverDuplicados() 
	{ 
        	Node elemento1 = list, 
	     	elemento2 = null, 
             	duplicado = null;  
  
        	while (elemento1 != null && elemento1.proximo != null) 
		{ 
            		elemento2 = elemento1; 
  
            		while (elemento2.proximo != null) 
	    		{  
				if (elemento1.valor == elemento2.proximo.valor) 
				{
					duplicado = elemento2.proximo; 
                    			elemento2.proximo = elemento2.proximo.proximo; 
                		} 
				else 
				{ 
                    			elemento2 = elemento2.proximo; 
                		} 
            		} 
            		elemento1 = elemento1.proximo; 
        	} 
	} 
  
	void ExibirLista(Node lista) 
	{ 
        	while (lista != null) 
		{ 
            		System.out.print(lista.valor + " "); 
            		lista = lista.proximo; 
        	} 
	} 
  
	public static void main(String[] args) 
	{ 
        	Duplicate msg = new Duplicate();
 
        	msg.list = new Node(1); 
        	msg.list.proximo = new Node(1); 
        	msg.list.proximo.proximo = new Node(2); 
        	msg.list.proximo.proximo.proximo = new Node(2); 
        	msg.list.proximo.proximo.proximo.proximo = new Node(3); 
        	msg.list.proximo.proximo.proximo.proximo.proximo = new Node(3); 
        	msg.list.proximo.proximo.proximo.proximo.proximo.proximo = new Node(1); 
  
        	System.out.println("Lista antes de remover msgs duplicadas : ");
		msg.ExibirLista(list); 
  
        	msg.RemoverDuplicados();
 
        	System.out.println("\n"); 
        
		System.out.println("Lista apos remover msgs duplicadas : "); 
        	msg.ExibirLista(list); 
	} 
}