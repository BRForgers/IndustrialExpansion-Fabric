package br.com.brforgers.mods.industrialexpansion

import br.com.brforgers.mods.industrialexpansion.registry.ItemRegistry
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger


object IndustrialExpansion : ModInitializer {
    const val MOD_ID = "industrialexpansion"
    var logger: Logger = LogManager.getLogger("IndustrialExpansion")
    val ITEM_GROUP = FabricItemGroupBuilder.build(Identifier(MOD_ID, "tab")) { ItemStack(Items.DIAMOND) }

    override fun onInitialize(){
        logger.info("Armelin is Topper!")
        ItemRegistry.register()
    }
}
