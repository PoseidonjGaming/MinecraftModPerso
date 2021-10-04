package fr.poseidonj.mcu.utils;

import fr.poseidonj.mcu.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static final ItemGroup itemGroupPerso= new ItemGroup("mcu") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.vibranium_ingot.get());
        }
    };

}
