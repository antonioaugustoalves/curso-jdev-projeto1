package br.com.antonioaugusto.classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Aluno aluno1 = new Aluno();
		Disciplina mat = new Disciplina();
		aluno1.setCpf(JOptionPane.showInputDialog("CPF do aluno:"));
		aluno1.setDataNascimento("Data de nascimento: ");
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("idade: ")));
		aluno1.setNome(JOptionPane.showInputDialog("Nome do aluno: "));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Nome da mãe: "));
		aluno1.setNomePai(JOptionPane.showInputDialog("Nome do pai: "));
		
		/*
		mat.setNome(JOptionPane.showInputDialog("Disciplina:"));
		mat.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1:")));
		mat.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2:")));
		mat.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Nota 3:")));
		mat.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Nota 4:")));
		*/
		List<Disciplina> materias = new ArrayList<Disciplina>();
		
		materias.add(new Disciplina("Java", 40, 40, 20, 35));
		materias.add(new Disciplina("SQL", 80, 100, 100, 80));
		materias.add(new Disciplina("HTML e CSS", 75, 90, 75, 100));
		
		for (Disciplina disciplina : materias) {
			System.out.println(disciplina.getNome());
			System.out.println("Nota 1:"+disciplina.getNota1());
			System.out.println("Nota 2:"+disciplina.getNota2());
			System.out.println("Nota 3:"+disciplina.getNota3());
			System.out.println("Nota 4:"+disciplina.getNota4());
			System.out.println("Média: "+disciplina.getMedia());
			System.out.println("Resultado: "+ disciplina.getAprovado());
			System.out.println("|--------------------------------------|");
			
		}
		
		
		
		
		
		
			

		
	}

}
