package com.meta1203.Boxie;

import com.jme3.app.SimpleApplication;
import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class Main extends SimpleApplication {
	
	public static AssetManager pubAssetManager = null;

	@Override
	public void simpleInitApp() {
		Geometry geom = new Geometry("Box", cube);
		pubAssetManager = assetManager;
	}

	@Override
	public void simpleUpdate(float tpf) {
		System.out.println(tpf);
		
	}

	public Box cube = new Box(1, 1, 1);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.initialize();
	}

}
