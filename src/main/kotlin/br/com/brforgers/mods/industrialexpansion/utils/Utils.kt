package br.com.brforgers.mods.industrialexpansion.utils

import br.com.brforgers.mods.industrialexpansion.IndustrialExpansion
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

fun identifier(id: String) = Identifier(IndustrialExpansion.MOD_ID, id)
fun Identifier.item(item: Item): Identifier {
    Registry.register(Registry.ITEM, this, item)
    return this
}
