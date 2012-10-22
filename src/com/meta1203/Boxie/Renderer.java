package com.meta1203.Boxie;

import java.util.ArrayList;
import java.util.List;

import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.meta1203.Boxie.blocks.Air;
import com.meta1203.Boxie.interfaces.Block;

public class Renderer {
	private List<Geometry> toRender = new ArrayList<Geometry>();
	
	public void addObject(Geometry g) {
		toRender.add(g);
	}
	
	public void renderAll(Node root) {
		for (Geometry current : toRender) {
			if (!root.hasChild(current)) {
				root.attachChild(current);
			}
		}
	}
	
	public void removeBlock(Node root, Block b) {
		Geometry geom = new Geometry("Block:" + b.getLocation().x + b.getLocation().y + b.getLocation().z);
		root.detachChild(geom);
		b = new Air(b.getLocation());
	}
}
