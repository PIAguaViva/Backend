package br.org.generation.projetointegrador.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table (name = "tb_usuario")
public class Usuario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O Tipo Usuário é obrigatório")
	@Size(max=255, message= "A descrição deve conter no máximo 255 caracteres")
	private String tipoUsuario;
	
	@NotBlank (message = "O Nome é obrigatório")
	@Size(max=255, message= "A descrição deve conter no máximo 255 caracteres")
	private String nome;
	
	@Schema(example = "email@email.com.br")
	@NotBlank (message= "O Usuário é obrigatório")
	@Email(message= "O Usuário deve ser um e-mail")
	private String usuario;
	
	
	@NotBlank (message = "O campo Senha é obrigatório")
	@Size(min=6, message= "A senha deve conter no mínimo 6 caracteres")
	private String senha;
	
	@Size(max=1000, message= "A foto deve conter no máximo 1000 caracteres")
	private String foto;

	@OneToMany(mappedBy="usuario", cascade=CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	
	
}
