package models;

public class Lista {

    private No inicio;
    private int tamanho;
    private int limit;

    public Lista() {
        inicio = null;
        tamanho = 0;
        limit = -1;
    }

    public Lista(int _limit) {
        inicio = null;
        tamanho = 0;
        limit = _limit;
    }

    public int length() {
        return tamanho;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public boolean isFull() {
        return limit == tamanho;
    }

    public Object getValueIndex(int indice) {
        if (indice < 0 || indice >= this.tamanho || inicio == null) {
            return null;
        }
        No local = this.inicio;
        for (int i = 0; i < indice; i++) {
            local = local.proximo;
        }
        return local.info;
    }

    public void insertStart(Object obj) {
        if (isFull())
            return;

        No no = new No();
        no.info = obj;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public void insertEnd(Object obj) {
        if (isFull())
            return;

        if (isEmpty()) {
            this.insertStart(obj);
        } else {
            No no = new No();
            no.info = obj;
            No local = inicio;
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = no;
            tamanho++;
        }
    }

    public void insertIndex(int index, Object obj) {
        if (isFull())
            return;

        if (index <= 0) {
            this.insertStart(obj);
        } else if (index >= tamanho) {
            this.insertEnd(obj);
        } else {
            No local = inicio;
            for (int i = 0; i < index - 1; i++) {
                local = local.proximo;
            }
            No no = new No();
            no.info = obj;
            no.proximo = local.proximo;
            local.proximo = no;
            tamanho++;
        }
    }

    public Object removeStart() {
        if (isEmpty()) {
            return null;
        }

        Object info = inicio.info;
        inicio = inicio.proximo;
        tamanho--;
        return info;
    }

    public Object removeEnd() {
        if (isEmpty()) {
            return null;
        }
        No local = inicio;
        while (local.proximo != null) {
            No aux = local;
            local = local.proximo;
            if (local.proximo == null) {
                aux.proximo = null;
                tamanho--;
                return local.info;
            }
        }
        inicio = null;
        tamanho--;
        return local.info;
    }

    public Object removeIndex(int index) {
        if (index < 0 || index >= tamanho || isEmpty()) {
            return null;
        } else if (index == 0) {
            return this.removeStart();
        } else if (index == tamanho - 1) {
            return this.removeEnd();
        }

        No local = inicio;
        for (int i = 0; i < index - 1; i++) {
            local = local.proximo;
        }

        Object info = local.proximo.info;
        local.proximo = local.proximo.proximo;
        tamanho--;
        return info;
    }

    // ##### Funções Extras #####

    public Object getObjectPalavra(String _char) {
        if (inicio == null) {
            return null;
        }
        No local = this.inicio;
        for (int i = 0; i < tamanho; i++) {
            Node obj = (Node) local.info;
            if (obj.caractere.equals(_char)) {
                return obj;
            }
            local = local.proximo;
        }
        return null;
    }

    public int getIndexMenorFreq() {
        if (isEmpty()) {
            return -1;
        }
        int index = -1;
        int menor = 0;

        No local = this.inicio;
        for (int i = 0; i < tamanho; i++) {
            Node obj = (Node) local.info;

            if (i == 0) {
                menor = obj.freq;
                index = i;
            } else {
                if (obj.freq < menor) {
                    menor = obj.freq;
                    index = i;
                }
            }
            local = local.proximo;
        }
        return index;
    }

    public Object getLetraBinario(String _char) {
        if (inicio == null) {
            return null;
        }
        No local = this.inicio;
        for (int i = 0; i < tamanho; i++) {
            Objeto obj = (Objeto) local.info;
            if (obj.chave.equals(_char)) {
                return obj;
            }
            local = local.proximo;
        }
        return null;
    }

    public Objeto getBinarioLetra(String _bin){
        if (inicio == null) {
            return null;
        }
        No local = this.inicio;
        for (int i = 0; i < tamanho; i++) {
            Objeto obj = (Objeto) local.info;
            if (obj.valor.equals(_bin)) {
                return obj;
            }
            local = local.proximo;
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "";
        No local = this.inicio;
        for (int i = 0; i < tamanho; i++) {
            str += local.info.toString();
            if( i < tamanho - 1 ){
                str += "¨";
            }
            local = local.proximo;
        }
        return str;
    }

}
