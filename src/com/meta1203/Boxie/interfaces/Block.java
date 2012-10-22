package com.meta1203.Boxie.interfaces;

import com.jme3.material.Material;
import com.meta1203.Boxie.utils.Coord;

public interface Block {
	public short getId();
	public Coord getLocation();
	public Material getMaterial();
}
