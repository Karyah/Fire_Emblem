package com.rpg.FireEmblem.model;

public enum ClassePersonagem {
	ARCHER("17/17",6,0,4,3,9,7,5,6), BARD("17/17",2,3,1,5,6,6,11,6);
	
	public final String hp;
	public final int str;
	public final int mag;
	public final int def;
	public final int res;
	public final int skl;
	public final int spd;
	public final int luk;
	public final int mov;
	
	private ClassePersonagem(String hp, int str, int mag, int def, int res, int skl, int spd, int luk, int mov) {
		this.hp = hp;
		this.str = str;
		this.mag = mag;
		this.def = def;
		this.res = res;
		this.skl = skl;
		this.spd = spd;
		this.luk = luk;
		this.mov = mov;
		
	}
}
