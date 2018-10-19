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

public class Semaforo {
	
	public static void main(String[] args) {
		
		ThreadSemaforo semaforo = new ThreadSemaforo();
		
		for(int i=0; i<=10; i++) {
			System.out.println(semaforo.getCor());
			semaforo.esperaCorMudar();
		}
		
		semaforo.desligarSemaforo();
	}
}
