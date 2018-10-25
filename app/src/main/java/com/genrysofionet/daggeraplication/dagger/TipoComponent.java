package com.genrysofionet.daggeraplication.dagger;


import com.genrysofionet.daggeraplication.MainActivity;

import dagger.Component;

@Component(modules={TipoModule.class})
public interface TipoComponent {
    void inject(MainActivity mainActivity);
}
