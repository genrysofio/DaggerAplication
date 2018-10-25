package com.genrysofionet.daggeraplication.dagger;

import android.app.Application;

public class TipoAplication extends Application {

    private TipoComponent tipoComponent;

    @Override
    public void onCreate(){
        super.onCreate();

       tipoComponent = DaggerTipoComponent.builder().tipoModule(new TipoModule()).build();
    }

    public TipoComponent getTipoComponent(){
        return tipoComponent;
    }
}
