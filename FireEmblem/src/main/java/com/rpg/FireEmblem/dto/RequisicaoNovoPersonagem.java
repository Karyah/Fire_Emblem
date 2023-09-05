package com.rpg.FireEmblem.dto;

import com.rpg.FireEmblem.model.ClassePersonagem;

public record RequisicaoNovoPersonagem(
		String nome,
		String idade,
		ClassePersonagem classe,
		String hp,
		int str,
		int mag,
		int def
		) {

}
