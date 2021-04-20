package br.com.fiap.model;



import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cadastro {


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	@Temporal(TemporalType.DATE)
    private Calendar dataNascimento = Calendar.getInstance();
	
	private String email;
	private String senha;
	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cadastro [name=" + name + "Data Nascimento"+dataNascimento+", E-mail=" + email + ", senha=" + senha
				+ "]";
	}

}