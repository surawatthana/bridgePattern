package com.bridge.Hero;

import java.util.ArrayList;
import java.util.List;

import com.bridge.villain.Villain;

public class Mario {

	private List<Villain> villains = new ArrayList<>() ;
	
	public void fight() {
		for(Villain villain: villains) {
			System.out.println("fight with");
			villain.attack();
		}
	}

	public List<Villain> getVillains() {
		return villains;
	}

	public void setVillains(List<Villain> villains) {
		this.villains = villains;
	}
}
