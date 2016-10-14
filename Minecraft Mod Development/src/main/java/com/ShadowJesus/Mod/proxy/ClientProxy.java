package com.ShadowJesus.Mod.proxy;

import com.ShadowJesus.Mod.init.ModItems;

public class ClientProxy implements CommonProxy
{

	@Override
	public void init() {

		ModItems.registerRenders();
	}

	
	
}
