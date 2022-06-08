package com.bridge.villain;

import com.bridge.attack.Attackable;

public abstract class Villain {
	private Attackable attackable;
	
	public Villain(Attackable attackable) {
		this.attackable = attackable;
	}
	
	public void attack() {
		this.attackable.perform();
	}
}
