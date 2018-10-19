/**
* Curso de Programa��o JAVA
*
* Exemplo de Thread
*
* @author         Prof. Eric Loque M. Xavier
* @version        2.0.0
* Data            12/10/2018
* 
* Problema:
* 	Pesquise, analise e compreenda este programa.
* 	Elabore uma interface gr�fica para o sem�foro.
* 
* Objetivo:
* 	Comente e explique o programa fornecido pelo Professor
* 	Crie uma interface gr�fica utilizando Swing.
* 
* Refer�ncia:
* 	https://www.youtube.com/watch?v=N-vc74o3SlQ&index=24&list=PLGxZ4Rq3BOBoqYyFWOV_YbfBW80YGAGEI
* 	Curso de Java: Exerc�cios Aula 74: Sem�faro com Threads
*/
package br.com.ericxavier.semaforo;

public class ThreadSemaforo implements Runnable {
	private CorSemaforo cor;	//Cores das L�mpadas
	private boolean parar;		//Para o funcionamento do sem�foro
	private boolean corMudou;	//Indica mudan�a da cor ativa

	//**********************************************************
	// M�todo Construtor
	//**********************************************************
	public ThreadSemaforo() {
		this.cor = CorSemaforo.VERMELHO;
		new Thread(this).start();
	}

	//**********************************************************
	// M�todo Construtor
	//**********************************************************
	@Override
	public void run() {

		while(!parar) {
			try {
				switch (this.cor) {
				case VERMELHO: 	Thread.sleep(2000); break;
				case AMARELO: 	Thread.sleep(300); break;
				case VERDE: 	Thread.sleep(1500); break;
				}
				
				this.mudarCor(); //Mudar a cor
			}catch (Exception e) {e.printStackTrace();}
		}
	}

	//**********************************************************
	// M�todo para mudan�a da cor ativa do sem�foro
	//**********************************************************
	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO: this.cor = CorSemaforo.VERDE ; break;
		case AMARELO:  this.cor = CorSemaforo.VERMELHO ; break;
		case VERDE:    this.cor = CorSemaforo.AMARELO ; break;
		}
		this.corMudou = true;
		notify();
	}

	public synchronized void esperaCorMudar() {

		while(!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		this.corMudou = false;
	}

	public synchronized void desligarSemaforo() {
		this.parar = true;
	}	

	public CorSemaforo getCor() {
		return cor;
	}
}
