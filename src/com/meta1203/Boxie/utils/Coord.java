package com.meta1203.Boxie.utils;

import com.meta1203.Boxie.interfaces.World;

public class Coord {
	public int x = 0;
	public int y = 0;
	public int z = 0;
	public World world;
	
	public Coord(World w, int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.world = w;
	}
	
	public Coord(World w) {
		this.world = w;
	}
}
