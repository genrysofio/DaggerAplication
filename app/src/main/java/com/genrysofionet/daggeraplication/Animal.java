package com.genrysofionet.daggeraplication;

public class Animal {
    private Tipo tipo;

    public Animal(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return ("Este animal es "+tipo.getTipoAnimal());
    }

}
