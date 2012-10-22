package com.meta1203.Boxie.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.meta1203.Boxie.blocks.Dirt;
import com.meta1203.Boxie.blocks.Stone;
import com.meta1203.Boxie.interfaces.Block;

public class BlockUtil {
	public static Map<Short, Class<? extends Block>> blocksList = new HashMap<Short, Class<? extends Block>>();
	
	static {
		blocksList.put((short)Dirt.id, Dirt.class);
		blocksList.put((short)Stone.id, Stone.class);
	}
	
	public static Block assembleBlock(Coord c) {
		short id = c.world.getBlockId(c.x, c.y, c.z);
		try {
			return blocksList.get(id).getConstructor(Coord.class).newInstance(c);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Geometry renderBlock(Block b) {
		Box box = new Box(1,1,1);
		Geometry geom = new Geometry("Block:" + b.getLocation().x + b.getLocation().y + b.getLocation().z, box);
		geom.setMaterial(b.getMaterial());
		return geom;
	}
}
