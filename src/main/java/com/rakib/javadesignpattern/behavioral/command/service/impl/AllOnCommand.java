package com.rakib.javadesignpattern.behavioral.command.service.impl;

import com.rakib.javadesignpattern.behavioral.command.hardware.Light;
import com.rakib.javadesignpattern.behavioral.command.hardware.Music;
import com.rakib.javadesignpattern.behavioral.command.service.ICommand;
import org.springframework.stereotype.Component;

@Component
public class AllOnCommand implements ICommand {

    Light light;
    Music music;

    public AllOnCommand(Light light, Music music) {
        this.light = light;
        this.music = music;
    }

    @Override
    public void execute() {
        light.onLight();

        music.setVolume(10);
        music.setStation(10);
        music.onMusic();
    }
}
