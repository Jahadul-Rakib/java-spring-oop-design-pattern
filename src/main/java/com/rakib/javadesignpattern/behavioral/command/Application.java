package com.rakib.javadesignpattern.behavioral.command;

import com.rakib.javadesignpattern.behavioral.command.hardware.Light;
import com.rakib.javadesignpattern.behavioral.command.hardware.Music;
import com.rakib.javadesignpattern.behavioral.command.service.CommandReceiver;
import com.rakib.javadesignpattern.behavioral.command.service.Command;
import com.rakib.javadesignpattern.behavioral.command.service.impl.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        setCommand();
    }

    private static void setCommand() {
        Light light = new Light();
        Music music = new Music();
        Command allOnCommand = new AllOnCommand(light, music);
        Command allOffCommand = new AllOffCommand(light, music);
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command musicOnCommand = new MusicOnCommand(music);
        Command musicOffCommand = new MusicOffCommand(music);
        Command musicStationCommand = new MusicStationCommand(music);
        Command musicVolumeCommand = new MusicVolumeCommand(music);
        Command noOpsCommand = new NoOpsCommand();


        CommandReceiver commandReceiver = new CommandReceiver();
        commandReceiver.setCommand(allOffCommand);
        commandReceiver.setCommand(allOnCommand);
        commandReceiver.setCommand(musicVolumeCommand);
        commandReceiver.setCommand(noOpsCommand);
        commandReceiver.setCommand(lightOnCommand);
        commandReceiver.setCommand(lightOffCommand);
        commandReceiver.setCommand(musicOnCommand);
        commandReceiver.setCommand(musicOffCommand);
        commandReceiver.setCommand(musicStationCommand);
        commandReceiver.setCommand(allOffCommand);

    }

}
