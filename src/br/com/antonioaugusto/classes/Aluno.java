package br.com.antonioaugusto.classes;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String cpf;
	private String nomePai;
	private String nomeMae;
	private Disciplina disciplina;
	

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Aluno() {
		System.out.println("Objeto vazio criado");
	}
	
	public Aluno(String novoNome, int novaIdade) {
		nome = novoNome;
		idade = novaIdade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
				+ ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", disciplina=" + disciplina + "]";
	}
	
	
	
	
	

}
