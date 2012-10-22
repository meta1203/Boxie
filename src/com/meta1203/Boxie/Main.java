package com.meta1203.Boxie;

import com.jme3.app.SimpleApplication;
import com.jme3.asset.AssetManager;
import com.jme3.scene.shape.Box;

public class Main extends SimpleApplication {
	
	public static AssetManager pubAssetManager = null;
	public static Player player = null;
	public static Renderer renderer = null;

	@Override
	public void simpleInitApp() {
		renderer = new Renderer();
		pubAssetManager = assetManager;
		player = new Player();
	}

	@Override
	public void simpleUpdate(float tpf) {
		
	}

	public Box cube = new Box(1, 1, 1);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.start();
	}

}
