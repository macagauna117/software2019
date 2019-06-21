package game;

import java.util.ArrayList;

public class Mage extends CharacterClass {
	  public Mage(){
		  this.className="Archer";
		  this.skills.add(new MageSkill1());
		  this.skills.add(new MageSkill2());
		  this.skills.add(new MageSkill3());
		  activeSkill=null;
		  maxHealth=200;
		  armor=100;
		  magicResist=200;

	  }

	  public int fight(){
	    return this.activeSkill.use();
	  }
	}