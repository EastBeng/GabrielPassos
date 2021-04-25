//Cria classe com o atributo de nó inical nulo e o tamanho 0
class ListaEncadeada{
  No inicio = null;
  int tamanho = 0;

  //Método que insere uma informação no inicio da lista
  public void inserirInicio(int info){
    No no = new No();//Cria um nó
    no.info = info;
    no.proximo = inicio;
    inicio = no;
    tamanho++;//Adiciona mais um ao tamanho da lista
  }

  //Método que retira uma informação no inicio da lista 
  public int retirarInicio(){
    if(inicio == null){ //Verifica se o valor do primeiro nó é nulo
      return -1;
    }
    int info = inicio.info; 
    inicio = inicio.proximo;//coloca na variavel inicio o próximo valor do bloco 
    tamanho--;//Decrementa um do tamanho da lista
    return info;
  }

  //Método que insere uma informação no fim da lista
  public void inserirFim(int info){
    No no = new No();//Cria um nó
    no.info = info;

    if(inicio == null){//Verifica se o o valor é nulo
      no.proximo = null; //Caso seja, o valor do proximo aponta para o null
      inicio = no;
    } else {
      No local = inicio;
      while (local.proximo != null){// Percorre o campo proximo até chegar e no ultimo valor e o ultimo valor apontar para null
        local = local.proximo;
      }
      local.proximo = no;
      no.proximo = null;
    }
    tamanho++;//Adiciona um ao tamanho da lista
  }

  public int retirarFim(){
    if(inicio == null){//Verifica se o valor do primeiro nó é nulo
      return -1;
    }
    No local = inicio;
    while(local.proximo != null){// Percorre o campo proximo até chegar e no ultimo valor  e cria uma auxiliar para receber o nó anterior
      No aux = local;
      local = local.proximo;
      if(local.proximo == null){//Verifica se a referencia do nó é nulo
        aux.proximo = null; //Seta a variavel auxiliar para nula
        tamanho--;//E decresse menos um do tamanho da lista
        return local.info;
      }
    }
    inicio = null;//Valor inical setado para nulo
    tamanho--;//Decrementa um do tamanho da lista
    return local.info;
  }

  public void inserirIndice(int indice, int info){//Passa o indice desejado e a informação
    if (indice <= 0){ //Caso o indice seja menor ou igual a zero
      inserirInicio(info); //Chama o Método de inserir valor no inicio
    }else if(indice >= tamanho){//Verifica se o indice é maior ou igual o tamanho da lista
      inserirFim(info);//Caso seja ele chama
    }else{
      No local = inicio;
      for (int i = 0; i < indice - 1; i++){// Caso ele entre no else, ele roda cada posiçao na lista e insere na posição desejada
        local = local.proximo;//Seta o próximo 
      }
      No no = new No();
      no.info = info;
      no.proximo = local.proximo;
      local.proximo = no;
      tamanho++;//Adiciona mais um no tamanho da lista 
    }
  }

  public int retirarIndice(int indice){
    if(indice < 0 || indice >= tamanho || inicio == null){ //verifica se o indice for negativo ou o indice maior que o tamanho ou o inicio seja nulo
      return -1;
    } else if (indice == 0){ //Verfica se a lista só possui um valor 
      return retirarInicio(); //Chama o método de retirar no inicio
    } else if (indice == tamanho -1){ //Verifica se o indice é igual ao length - 1 
      return retirarFim(); //Retorna o método de retirar no final
    }
    No local = inicio;
    for (int i = 0; i < indice - 1; i++){//Ele roda cada posiçao na lista e retira na posição desejada
      local = local.proximo;
    }
    int info = local.proximo.info;
    local.proximo = local.proximo.proximo;
    tamanho --; //Decrementa um no tamanho da lista
    return info;
  }

  //Método que formata a informação
  public String toString(){
    String str = "";
    No local  = inicio;
    while(local != null){
      str += local.info + " ";
      local = local.proximo;
    }
    return str;
  }

}