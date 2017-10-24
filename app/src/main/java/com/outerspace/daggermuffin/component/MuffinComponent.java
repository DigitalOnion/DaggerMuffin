package com.outerspace.daggermuffin.component;

import com.outerspace.daggermuffin.MainActivity;
import com.outerspace.daggermuffin.SecondActivity;
import com.outerspace.daggermuffin.model.Muffin;
import com.outerspace.daggermuffin.module.MuffinModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MuffinModule.class})
public interface MuffinComponent {

    public Muffin provideMuffinPojo();

    public void inject(MainActivity anyActivity);
    public void inject(SecondActivity anyActivity);
}

