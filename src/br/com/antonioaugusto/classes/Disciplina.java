package br.com.antonioaugusto.classes;

import java.util.Objects;

public class Disciplina {
	String nome;
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, double nota1, double nota2, double nota3, double nota4) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}
	
	
	public double getMedia() {
		double soma = nota1+nota2+nota3+nota4;
		double media = soma/4;
		return media;
	}
	
	
	public String getAprovado() {
		double media = getMedia();
		boolean aprovado = media >= 60;
		String mensagem = "";
		if(aprovado) {
			mensagem = "O aluno  foi aprovado com m?dia "+ media;
		}else {
			mensagem = "O aluno foi reprovado com m?dia "+ media;
		}
		
		return mensagem;
	}
	
	//Mais utilizado
	public boolean getRsultadoFinal() {
		double media = getMedia();
		boolean aprovado = media >= 60;
		return aprovado;
	}
	
	
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4="
				+ nota4 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, nota1, nota2, nota3, nota4);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}
	

	

}
