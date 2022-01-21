package br.org.generation.projetointegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_tema")
public class Tema {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

	@NotBlank(message="O atributo tema é obrigatório e não pode conter espaços em branco!")
	@Size(max=255,min=5,message="O atributo tema deve conter no mínimo 5 e no máximo 255 caracteres")
	private String tema;
	

	@NotBlank(message="O atributo descrição é obrigatório e não pode conter espaços em branco!")
	@Size(max=255,min=10,message="O atributo descrição deve conter no mínimo 10 e no máximo 255 caracteres")
	private String descricao;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
