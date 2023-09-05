package com.rpg.FireEmblem.model;

import com.rpg.FireEmblem.dto.RequisicaoNovoPersonagem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Personagem")
@Table(name="Personagem")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Personagem {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String idade;
	
	private ClassePersonagem classe;
	
	private String hp;
	private int str;
	private int mag;
	private int def;
	private int res;
	private int skl;
	private int spd;
	private int luk;
	private int mov;
	
	public Personagem(RequisicaoNovoPersonagem requisicao) {
		this.nome = requisicao.nome();
		this.idade = requisicao.idade();
		this.classe = requisicao.classe();
		this.hp = requisicao.hp();
		this.str = requisicao.str();
		this.mag = requisicao.mag();
		this.def = requisicao.def();
		
	}
	
	public Personagem(ClassePersonagem classe) {
		this.hp = classe.hp;
		this.str = classe.str;
		this.mag = classe.mag;
		this.def = classe.def;
		this.res = classe.res;
		this.skl = classe.skl;
		this.spd = classe.spd;
		this.luk = classe.luk;
		this.mov = classe.mov;
	}
}
