package com.meta1203.Boxie.interfaces;

public interface WorldGenerator {
	public Chunk generateChunk(int x, int z);
	public void populate(Chunk c, Populator p, short id);
}
