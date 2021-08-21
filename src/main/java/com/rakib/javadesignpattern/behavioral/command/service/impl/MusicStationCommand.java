package com.rakib.javadesignpattern.behavioral.command.service.impl;

import com.rakib.javadesignpattern.behavioral.command.hardware.Music;
import com.rakib.javadesignpattern.behavioral.command.service.ICommand;
import org.springframework.stereotype.Component;

@Component
public class MusicStationCommand implements ICommand {
    Music music;

    public MusicStationCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.setStation(5);
    }
}
