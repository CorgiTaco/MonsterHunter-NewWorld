package com.carro1001.mhnw.client.models.entities;

import com.carro1001.mhnw.entities.NewRathalosEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

import static com.carro1001.mhnw.utils.MHNWReferences.MODID;
import static com.carro1001.mhnw.utils.MHNWReferences.RATHALOS;

public class NewRathalosModel extends DefaultedEntityGeoModel<NewRathalosEntity> {

    public NewRathalosModel() {
        super(new ResourceLocation(MODID, RATHALOS), true);
    }

    @Override
    public ResourceLocation getModelResource(NewRathalosEntity object)
    {
        return new ResourceLocation(MODID, "geo/rathalos.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NewRathalosEntity object)
    {
        return new ResourceLocation(MODID, "textures/entity/rathalos.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NewRathalosEntity object)
    {
        return new ResourceLocation(MODID, "animations/rathalos.animation.json");
    }

}
