package com.genrysofionet.daggeraplication.dagger;

import com.genrysofionet.daggeraplication.Animal;
import com.genrysofionet.daggeraplication.Tipo;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class TipoModule {

    @Named("mamifero")
    @Provides
    public Tipo providesMamifero(){
        return new Tipo("mamifero");
    }

    @Named("reptil")
    @Provides
    public Tipo providesReptiles(){
        return new Tipo("reptiles");
    }

    @Provides
    public Animal providesAnimal(@Named("reptil")Tipo tipo){
        return new Animal(tipo);
    }
}
