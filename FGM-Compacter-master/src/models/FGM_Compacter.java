package models;

public class FGM_Compacter {

    private Node raiz;
    private Lista frequencia = new Lista();
    private Lista char_binarios = new Lista();

    private String texto;
    private String binCabecalhoStr;
    private String textoCompactado;

    private Lista MapCabecalho = new Lista();
    private String cabecalho;
    private String textoDescompactado;

    /* Funções Internas Privadas */

    private void GeraFrequencia() {
        // Pega a frequencia de caracteres na string e mapeando dentro de uma
        // lista encadeada, ja com o Node para inserir na lista o mesmo.
        for (int i = 0; i < this.texto.length(); i++) {
            char caractere = this.texto.charAt(i);
            String newCaracter = Character.toString(caractere);
            // Função criada na lista encadeada para buscar o caracter dentro da mesma
            // Caso não exista retorna null
            int ascii = (int) caractere;
            if( ascii == 13 ){
                continue;
            }
            if( ascii == 10 ){
                newCaracter = Integer.toString(ascii);
            }  
            Node obj = (Node) this.frequencia.getObjectPalavra( newCaracter );
            // Se retornar null, iremos criar o caracter e inserir ja para a contagem da
            // frequencia
            // Se não retornar null, ele vai retornar o obj Node do caracter e somar mais 1
            // no atributo freq do objeto !
            if (obj == null) {
                this.frequencia.insertEnd(new Node( newCaracter ));
            } else {
                obj.freq += 1;
            }
        }
    }

    private void GeraArvoreRaiz() {
        // De acordo com a regra do Algoritimo de Huffman, pegando os 2 caracteres de
        // menor frequencia da lista
        // retornando e somando para criar uma arvore com os dois e inserindo no final
        // da lista com valor, assim ate
        // formando a arvore no Node Raiz onde esta somente no primeiro indice da lista.
        while (this.frequencia.length() != 1) {
            int primeiro = this.frequencia.getIndexMenorFreq();
            Node nodeEsquerda = (Node) this.frequencia.removeIndex(primeiro);

            int segundo = this.frequencia.getIndexMenorFreq();
            Node nodeDireita = (Node) this.frequencia.removeIndex(segundo);

            int soma = nodeEsquerda.freq + nodeDireita.freq;

            this.frequencia.insertEnd(new Node("Node", soma, nodeEsquerda, nodeDireita));
        }

        this.raiz = (Node) this.frequencia.removeEnd();
    }

    private void GeraBinarios() {
        this.RecursivaGeraBinarios(this.raiz, "", this.char_binarios);
        this.binCabecalhoStr = this.char_binarios.toString();
    }

    private void Texto_to_Binario() {
        this.textoCompactado = "";
        // Faz a compactação das palavras, em Binario
        for (int i = 0; i < this.texto.length(); i++) {
            char caractere = this.texto.charAt(i);
            String newCaracter = Character.toString(caractere);
            int ascii = (int) caractere;
            if( ascii == 10 ){
                newCaracter = Integer.toString(ascii);
            } 
            Objeto obj = (Objeto) this.char_binarios.getLetraBinario(newCaracter);
            if (obj != null) {
                this.textoCompactado += obj.valor;
            } else {
                System.out.println("Letra não encontrada => " + newCaracter);
            }
        }
        
    }

    private void GeraCabecalhoLista() {
        String[] baseSplit = this.cabecalho.split("¨");
        for (String string : baseSplit) {
            String[] base = string.split(":");
            if(  base.length != 2 ){
                this.MapCabecalho.insertEnd(new Objeto(":", base[base.length-1]));
            }else{
                this.MapCabecalho.insertEnd(new Objeto(base[0], base[1]));
            }
        }
    }

    private void Binario_To_Texto() {
        String joinBin = "";
        for (int i = 0; i < this.textoCompactado.length(); i++) {
            char binario = this.textoCompactado.charAt(i);
            joinBin += binario;
            Objeto obj = (Objeto) this.MapCabecalho.getBinarioLetra(joinBin);
            if (obj != null) {
                if(obj.chave.equals("10")){
                    this.textoDescompactado += (char) 10;
                }else{
                    this.textoDescompactado += obj.chave;
                }
                joinBin = "";
            }
        }
    }

    private void Func_Auxiliar_Compactar() {
        this.GeraFrequencia();
        this.GeraArvoreRaiz();
        this.GeraBinarios();
        this.Texto_to_Binario();
    }

    private void Func_Auxiliar_Descompactar(){
        this.GeraCabecalhoLista();
        this.Binario_To_Texto();
    }

    /* Funções auxiliares das funções principais */
    private void RecursivaGeraBinarios(Node r, String _be, Lista binarios) {
        if (r.left != null) {
            this.enterLeft(r, _be, binarios);
        }
        if (r.right != null) {
            this.enterRight(r, _be, binarios);
        }
        if (!r.caractere.equals("Node")) {
            binarios.insertEnd( new Objeto(r.caractere, _be) );
        }
        _be = "";

    }

    private void enterLeft(Node r, String _be, Lista binarios) {
        _be += "0";
        this.RecursivaGeraBinarios(r.left, _be, binarios);
    }

    private void enterRight(Node r, String _be, Lista binarios) {
        _be += "1";
        this.RecursivaGeraBinarios(r.right, _be, binarios);
    }

    /* Funções Public de uso do Programa */
    public void Compactar(String _texto) {
        this.texto = _texto;
        this.Func_Auxiliar_Compactar();
    }

    public void Descompactar(String _cabecalho, String _textoCompactado){
        this.textoCompactado = _textoCompactado;
        this.cabecalho = _cabecalho;
        this.textoDescompactado = "";
        this.Func_Auxiliar_Descompactar();
    }

    public String getCabecalho() {
        return this.binCabecalhoStr;
    }

    public String getTextoCompactado() {
        return this.textoCompactado;
    }

    public String getTextoDescompactado(){
        return this.textoDescompactado;
    }

}
