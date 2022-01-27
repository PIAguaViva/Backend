package br.org.generation.projetointegrador.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_postagem")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="O campo é obrigatório!")
	@Size(min = 5, max = 100, message="Este campo deve conter no mínimo 5 e máximo 100 caracteres.")
	private String titulo;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@NotBlank(message="O campo é obrigatório!")
	@Size(max = 255, message="Este campo deve conter no máximo 255 caracteres.")
	private String regiao;
	
	@NotBlank(message="O campo é obrigatório!")
	@Size(min = 10, max = 1000, message="Este campo deve conter no mínimo 5 e máximo 100 caracteres.")
	private String texto;
	
	@Size(max = 1000, message="Este campo deve conter no máximo 1000 caracteres.")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
		
}
