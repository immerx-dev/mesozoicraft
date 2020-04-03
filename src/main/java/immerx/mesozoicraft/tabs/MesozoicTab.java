package immerx.mesozoicraft.tabs;

import immerx.mesozoicraft.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MesozoicTab extends CreativeTabs
{
	public MesozoicTab(String label)
	{
		super("mesozoictab");
		this.setBackgroundImageName("mesozoic.png");
	}
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.AMBER);
	}
}
