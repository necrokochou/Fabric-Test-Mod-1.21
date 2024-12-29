package net.necrokochou.testmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200), 0.15f)
            .build();

    public static final FoodComponent MILO_DRINK = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200), 0.15f)
            .build();
}