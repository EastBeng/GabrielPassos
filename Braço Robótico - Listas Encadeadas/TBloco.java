import java.util.Scanner;
import java.io.*;


public class TBloco {
  private ListaEncadeada[] vetor;
  String sc;

  //Construtor que inicializa a leitura do arquivo
  public TBloco() {
    lerArquivoEntrada();
  }

  //Classe de leitura de arquivos
  private void lerArquivoEntrada(){
    try{
      //Inicia a leitura 
      String fileName = "entrada.txt"; 
      FileReader fr = new FileReader(fileName);
      BufferedReader br = new BufferedReader(fr);
      sc = br.readLine();
      
      //Chamada do método de iniciar vetor
			iniciaVetor();
      //Chamada do método de inserir um valor em cada posição
			inicializaValoresLista();
			sc = br.readLine();
      
      //Percorre o arquivo enquanto a linha não for nula ou quando não possuir o quit.
      while(sc != null && !sc.equals("quit")){
        System.out.println(toString()); // Imprime na tela a lista formatada

        int a = Integer.parseInt(sc.split(" ")[1]); //Transforma os valores na linha seprado por espaço em uma lista e pega a posição 1 que é o valor de A, e faz uma conversão para inteiro

        int b = Integer.parseInt(sc.split(" ")[3]);//Transforma os valores na linha seprado por espaço em uma lista e pega a posição 3 que é o valor de Be, e faz uma conversão para inteiro

        //Verificações para ver qual movimento fazer de acordo com oque está na linha do arquivo
        if(sc.contains("move") && sc.contains("onto")){
				  moveOnto(a, b);
        }else if(sc.contains("move") && sc.contains("over")){
					moveOver(a, b);
        }else if(sc.contains("pile") && sc.contains("onto")){
          pileOnto(a, b);
        }else if(sc.contains("pile") && sc.contains("over")){
          pileOver(a, b);
        }
				sc = br.readLine();//Passa para a proxima linha 
      }

      salvaArquivo();//Chama o método para escrever no arquivo 
      
    }catch(Exception e){
      e.getStackTrace();
    }
  }

  //Método que salva a última configuração da lista no arquivo saida.txt
  private void salvaArquivo(){
    try{
      String fileName = "saida.txt";
      FileWriter file = new FileWriter(fileName);
      BufferedWriter arq = new BufferedWriter(file);
      arq.write(this.toString());
      arq.close();
    }catch(Exception e){
      e.getStackTrace();
    }
  }

  //Inicia o tamanho do vetor a partir do arquivo e cria as listas encadeadas em cada posição do vetor
  public void iniciaVetor() {
    int quantidade = Integer.parseInt(sc);
    vetor = new ListaEncadeada[quantidade];
    for (int i = 0; i < vetor.length; i++) { //Cria em cada posição do vetor uma lista encadeada
      vetor[i] = new ListaEncadeada();
    }
  }

  //insere em cada posição do vetor um numero inteiro, sendo ele o mesmo numero da posição.Ex : posição 0, valor 0; posição 1 valor 1
  private void inicializaValoresLista(){
    int index = 0;
    for(ListaEncadeada base : vetor){ //Iniciaiza em cada posição do vetor um valor 
      base.inserirInicio(index);
      index++;
    }
  }
  
  //Método que formata a informação
  public String toString() {
    String aux = "";
    int count = 0;
    for (ListaEncadeada indice : vetor) {
      aux += count + " : " + indice.toString() + "\n";
      count++;
    }
    return aux;
  }

  public void moveOnto(int a, int b){
    //Faz a Verificação se o valor de A é o mesmo do B ou se caso eles estão no mesmo vetor
    if( a == b || pesquisaVetor(a) == pesquisaVetor(b) ){ 
      return;
    }

		int indice_valor_a = pesquisaIndice(a); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o indice

    int indice_vetor_a = pesquisaVetor(a);  //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o vetor

    int indice_vetor_b = pesquisaVetor(b);  //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o vetor

		/* Retorna os eventuais valores de A para sua posição original */
		while( pesquisaPorIndice( 1, vetor[indice_vetor_a] ) != -1 ){
			int valorRemovido = vetor[indice_vetor_a].retirarIndice(1);
      vetor[valorRemovido].inserirFim(valorRemovido);
    }

		/* Retorna os eventuais valores de B para sua posição original */
		while( pesquisaPorIndice( 1, vetor[indice_vetor_b] ) != -1 ){
			int valorRemovido = vetor[indice_vetor_b].retirarIndice(1);
      vetor[valorRemovido].inserirFim(valorRemovido);
    }

		/* Move A para cima de B */
    while( pesquisaPorIndice( indice_valor_a, vetor[indice_vetor_a] ) != -1 ){
      int valorRemovido = vetor[indice_vetor_a].retirarIndice(indice_valor_a);
      vetor[indice_vetor_b].inserirFim(valorRemovido);
    }
  }

  public void moveOver(int a, int b){
    //Faz a Verificação se o valor de A é o mesmo do B ou se caso eles estão no mesmo vetor
    if( a == b || pesquisaVetor(a) == pesquisaVetor(b) ){
      return;
    }
    int indice_valor_a = pesquisaIndice(a); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o indice

    int indice_vetor_a = pesquisaVetor(a); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o vetor

    int indice_vetor_b = pesquisaVetor(b); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o vetor

		/* Retorna os eventuais valores de A para sua posição original */
		while( pesquisaPorIndice( 1, vetor[indice_vetor_a] ) != -1 ){
			int valorRemovido = vetor[indice_vetor_a].retirarIndice(1);
      vetor[valorRemovido].inserirFim(valorRemovido);
    }

		/* Move A para cima de B */
    while( pesquisaPorIndice( indice_valor_a, vetor[indice_vetor_a] ) != -1 ){
      int valorRemovido = vetor[indice_vetor_a].retirarIndice(indice_valor_a);
      vetor[indice_vetor_b].inserirFim(valorRemovido);
    }
  
  }
  
  public void pileOnto(int a, int b){
    //Faz a Verificação se o valor de A é o mesmo do B ou se caso eles estão no mesmo vetor
    if( a == b || pesquisaVetor(a) == pesquisaVetor(b) ){
      return;
    }
    
    int indice_valor_a = pesquisaIndice(a); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o indice

    int indice_vetor_a = pesquisaVetor(a); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o vetor

    int indice_vetor_b = pesquisaVetor(b); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o vetor
  
		/* Retorna os eventuais valores de B para sua posição original */
		while( pesquisaPorIndice( 1, vetor[indice_vetor_b] ) != -1 ){
			int valorRemovido = vetor[indice_vetor_b].retirarIndice(1);
      vetor[valorRemovido].inserirFim(valorRemovido);
    }

		/* Move A para cima de B */
    while( pesquisaPorIndice( indice_valor_a, vetor[indice_vetor_a] ) != -1 ){
      int valorRemovido = vetor[indice_vetor_a].retirarIndice(indice_valor_a);
      vetor[indice_vetor_b].inserirFim(valorRemovido);
    }
    
  }
  

  public void pileOver(int a, int b){
    //Faz a Verificação se o valor de A é o mesmo do B ou se caso eles estão no mesmo vetor
    if( a == b || pesquisaVetor(a) == pesquisaVetor(b) ){
      return;
    }
    
    int indice_valor_a = pesquisaIndice(a); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o indice

    int indice_vetor_a = pesquisaVetor(a); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o vetor

    int indice_vetor_b = pesquisaVetor(b); //Inicia uma variavel atribuindo a ela a chamada do método de pesquisar o vetor
  
    /* Move A para cima de B */
    while( pesquisaPorIndice( indice_valor_a, vetor[indice_vetor_a] ) != -1 ){
      int valorRemovido = vetor[indice_vetor_a].retirarIndice(indice_valor_a);
      vetor[indice_vetor_b].inserirFim(valorRemovido);
    }
    
  }

  //Método que faz uma pesquisa do valor a partir da posição e da lista que ele está
  public int pesquisaPorIndice(int index, ListaEncadeada lista){
    No primeiro = lista.inicio;

    //Verifica se o indice é negativo, ou se é maior ou igual que o tamnho da lista ou se está vazio 
    if( index < 0 || index >= lista.tamanho || primeiro == null ){ 
      return -1;
    }

    //Percorre a lista até ser menor que o indice e aramazena o valor do proximo nó 
    for( int i = 0; i < index ; i++ ){
      primeiro = primeiro.proximo;
    }

    return primeiro.info;
  }

  //Método que faz uma pesquisa da posição a partir de um valor
  public int pesquisaIndice(int valorProcurado){
    for( ListaEncadeada lista : vetor ){ //Percorre cada elemento da lista
      int count = 0; 
      No primeiro = lista.inicio; //Em cada posição ele recebe o primeiro valor dali
      while(primeiro != null){ 
        if( primeiro.info == valorProcurado ){ //Caso o valor que está for igual ao procurado ele retorna o indice
          return count;
        }
        primeiro = primeiro.proximo; 
        count++;
      }
    }
    return -1;
  }

  //Método que faz uma pesquisa de qual posição do vetor um valor está 
  public int pesquisaVetor(int valorProcurado){
    int count = 0;
    boolean achou = false;
    
    //Percorre cada elemento da lista
    for( ListaEncadeada lista : vetor ){
      No primeiro = lista.inicio; //Em cada posição ele recebe o primeiro valor dali

      while(primeiro != null){
        if( primeiro.info == valorProcurado ){ //Caso o valor que está for igual ao procurado um sentinela recebe true para sair do laço de repetição while e vai para uma outra verificaçao 
          achou = true;
          break;
        }
        primeiro = primeiro.proximo;
      }

      if( achou ){//Verifica se a sentinela é true e retorna a posição do vetor
        return count;
      }

      count++;//Vai para a próxima posição
    }

    return -1;
  }

}