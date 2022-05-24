<h2 align="left"> GUIA LIST JAVA ☕ </h2> 

<b>Instanciar uma lista: </b> `List<String> list = new ArrayList<>();` 

<b>Adicionar um item na lista: </b>
		`list.add("Maria");`

<b>Adicionar um item na lista na segunda posição: </b>	`list.add(2, "Joana");`

<b>Encontrar posição de elemento: </b> `indexOf(obj): , lastIndexOf(obj);`

<b>Exibir tamanho da lista: </b>	`System.out.println(list.size());`
		
<b>Percorrer toda a lista: </b> `for(String x : list) { }`
		
<b>Descobrir a posição de um item na lista: </b> `System.out.println("Index of Diego: " + list.indexOf("Joao")); `
		
<b>Remover um item pela sua posição na lista: </b> `list.remove(1);` 
		
<b>Remover um item pela comparação do valor dele com outro: </b> `list.remove("Diego");` 
		
<b>Remover os itens da lista que comecem com a letra M: </b>	`list.removeIf(x -> x.charAt(0) == 'M');`
		
<b>Imprimir somente quem começa com a letra A: </b> <br>	 `List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());` <br>
`for(String x : result) {` <br>
`System.out.println(x);`<br>
`}` </br>

<b>Imprimir o primeiro item que começa com a letra A: </b> <br>
`String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);` <br>
`System.out.println(name);`

<b>Encontrar primeira ocorrência com base em predicado: </b>
`Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);`
