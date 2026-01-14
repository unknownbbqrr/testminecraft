package net.minecraft.world.item;

import net.minecraft.world.item.component.DeathProtection;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class TotemOfUndyingItem extends Item {
    public TotemOfUndyingItem(Properties properties) {
        super(properties);
    }

    // Vanilla'da totem, DATA_COMPONENTS.DEATH_PROTECTION ile çalışır.
    // Bu class sadece referans / okuma amaçlı iskelettir.
    public static DeathProtection createDeathProtection() {
        return new DeathProtection(stack -> new MobEffectInstance[] {
            new MobEffectInstance(MobEffects.REGENERATION, 900, 1),
            new MobEffectInstance(MobEffects.ABSORPTION, 100, 1),
            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 0)
        });
    }
}