package com.meta1203.Boxie.interfaces;

import java.util.List;

public interface Chunk {
	public List<Entity> getEntities();
	public WorldGenerator getWorldGenerator();
	public void setBlock(Block b);
}
