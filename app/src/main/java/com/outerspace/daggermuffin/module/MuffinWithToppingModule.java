package com.outerspace.daggermuffin.module;

import com.outerspace.daggermuffin.model.MuffinWithTopping;

import dagger.Module;
import dagger.Provides;

@Module
public class MuffinWithToppingModule {

    @Provides
    MuffinWithTopping provideMuffinWithTopping() {
        MuffinWithTopping muffin = new MuffinWithTopping();
        muffin.muffinFlavor = "no flavor";
        muffin.muffinTopping = "no topping";
        return muffin;
    }
}
