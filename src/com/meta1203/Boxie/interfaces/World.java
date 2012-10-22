package com.meta1203.Boxie.interfaces;

import java.util.List;
import java.util.Random;

public interface World {
	public String getName();
	public WorldGenerator getGenerator();
	public Populator getPopulators();
	public Random getSeed();
	public List<Chunk> getLoadedChunks();
	public short getBlockId(int x, int y, int z);
}
