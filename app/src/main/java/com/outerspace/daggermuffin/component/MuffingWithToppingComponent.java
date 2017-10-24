package com.outerspace.daggermuffin.component;

import com.outerspace.daggermuffin.MainActivity;
import com.outerspace.daggermuffin.SecondActivity;
import com.outerspace.daggermuffin.model.MuffinWithTopping;
import com.outerspace.daggermuffin.module.MuffinWithToppingModule;

import dagger.Component;

@Component(modules = {MuffinWithToppingModule.class})
public interface MuffingWithToppingComponent {

    public MuffinWithTopping provideMuffinWithTopping();

    public void inject(MainActivity mainActivity);
    public void inject(SecondActivity secondActivity);

}
