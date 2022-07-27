package br.com.antonioaugusto.classes;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Arthur", 7);
		Aluno aluno2 = new Aluno("Maria", 9);
		Aluno aluno3 = new Aluno("Daniel", 8);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno2.getNome());
		System.out.println(aluno3.getNome());
		
		aluno1.setNota1(100);
		aluno1.setNota2(95);
		aluno1.setNota3(100);
		aluno1.setNota4(80);
		
		String resultado = aluno1.getAprovado();
		System.out.println(resultado);
		System.out.println(aluno1.getRsultadoFinal()?"Aprovado":"Reprovado");
		
		
			

		
	}

}
