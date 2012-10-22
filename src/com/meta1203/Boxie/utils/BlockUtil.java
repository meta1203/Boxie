package com.meta1203.Boxie.utils;

import java.util.HashMap;
import java.util.Map;

import com.meta1203.Boxie.blocks.Dirt;
import com.meta1203.Boxie.interfaces.Block;

public class BlockUtil {
	public static Map<Short, Class<? implements Block>> blocksList = new HashMap<Short, Class<? extends Block>>();
	
	static {
		blocksList.put(1, Dirt.class);
	}
}
