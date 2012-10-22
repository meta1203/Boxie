package com.meta1203.Boxie.interfaces;

import java.util.List;
import java.util.Random;

public interface Populator {
	public List<Block> populate(Random seed, short id);
}
