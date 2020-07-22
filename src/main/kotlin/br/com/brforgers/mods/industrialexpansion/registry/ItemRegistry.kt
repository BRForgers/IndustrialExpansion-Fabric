package br.com.brforgers.mods.industrialexpansion.registry

import br.com.brforgers.mods.industrialexpansion.IndustrialExpansion
import br.com.brforgers.mods.industrialexpansion.utils.identifier
import br.com.brforgers.mods.industrialexpansion.utils.item
import net.minecraft.item.Item




object ItemRegistry {
    fun register(){
        identifier("coal_ball").item(COAL_BALL)
        identifier("compact_coal_ball").item(COMPACT_COAL_BALL)
        identifier("coal_chunk").item(COAL_CHUNK)
    }

    val COAL_BALL = Item(Item.Settings().group(IndustrialExpansion.ITEM_GROUP))
    val COMPACT_COAL_BALL = Item(Item.Settings().group(IndustrialExpansion.ITEM_GROUP))
    val COAL_CHUNK = Item(Item.Settings().group(IndustrialExpansion.ITEM_GROUP))

}