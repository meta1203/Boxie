package com.meta1203.Boxie.blocks;

import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.meta1203.Boxie.Main;
import com.meta1203.Boxie.interfaces.Block;
import com.meta1203.Boxie.utils.Coord;

public class Air implements Block {
	private Coord loc; 
	public static short id = 0;
	
	public Air(Coord c) {
		this.loc = c;
	}
	
	@Override
	public short getId() {
		return id;
	}

	@Override
	public Coord getLocation() {
		return loc;
	}

	@Override
	public Material getMaterial() {
		Material mat = new Material(Main.pubAssetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		mat.setColor("Brown", new ColorRGBA(0,0,0,0));
		return mat;
	}

}
