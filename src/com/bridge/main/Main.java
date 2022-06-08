package com.bridge.main;

import java.util.ArrayList;
import java.util.List;

import com.bridge.Hero.Mario;
import com.bridge.attack.Bite;
import com.bridge.attack.Kick;
import com.bridge.attack.Punch;
import com.bridge.attack.Shoot;
import com.bridge.villain.BoomBoom;
import com.bridge.villain.Bower;
import com.bridge.villain.Clawgrip;
import com.bridge.villain.KingBoo;
import com.bridge.villain.Villain;

public class Main {

	public static void main(String[] args) {
		List<Villain> villains = new ArrayList();

		villains.add(new Bower(new Bite()));
		villains.add(new BoomBoom(new Kick()));
		villains.add(new KingBoo(new Punch()));
		villains.add(new Clawgrip(new Shoot()));
		
		Mario mario = new Mario();
		mario.setVillains(villains);
		
		mario.fight();
	}

}
