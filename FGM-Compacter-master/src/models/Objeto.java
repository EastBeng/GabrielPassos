package models;

public class Objeto {
  public String chave;
  public String valor;

  public Objeto() {
    this.chave = null;
    this.valor = null;
  }

  public Objeto(String _chave, String _valor) {
    this.chave = _chave;
    this.valor = _valor;
  }

  @Override
  public String toString() {
    String str = this.chave + ":" + this.valor;
    return str;
  }
}
