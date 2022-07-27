package br.com.antonioaugusto.classes;

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno();
		Disciplina mat = new Disciplina();
		aluno1.setCpf(JOptionPane.showInputDialog("CPF do aluno:"));
		aluno1.setDataNascimento("Data de nascimento: ");
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("idade: ")));
		aluno1.setNome(JOptionPane.showInputDialog("Nome do aluno: "));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Nome da mãe: "));
		aluno1.setNomePai(JOptionPane.showInputDialog("Nome do pai: "));
		
		mat.setNome(JOptionPane.showInputDialog("Disciplina:"));
		mat.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1:")));
		mat.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2:")));
		mat.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Nota 3:")));
		mat.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Nota 4:")));
		aluno1.setDisciplina(mat);
		
		System.out.println(aluno1);
		System.out.println(aluno1.getDisciplina().getMedia());
		System.out.println(aluno1.getDisciplina().getAprovado());
		
		
	
		
		
		
			

		
	}

}
