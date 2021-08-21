package com.rakib.javadesignpattern.behavioral.command.service.impl;

import com.rakib.javadesignpattern.behavioral.command.hardware.Light;
import com.rakib.javadesignpattern.behavioral.command.hardware.Music;
import com.rakib.javadesignpattern.behavioral.command.service.Command;
import org.springframework.stereotype.Component;

@Component
public class AllOffCommand implements Command {

    Light light;
    Music music;

    public AllOffCommand(Light light, Music music) {
        this.light = light;
        this.music = music;
    }

    @Override
    public void execute() {
        light.offLight();

        music.setVolume(0);
        music.setStation(0);
        music.offMusic();
    }
}
