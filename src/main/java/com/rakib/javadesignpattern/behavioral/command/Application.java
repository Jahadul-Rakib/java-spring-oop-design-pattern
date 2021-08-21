package com.rakib.javadesignpattern.behavioral.command;

import com.rakib.javadesignpattern.behavioral.command.hardware.Light;
import com.rakib.javadesignpattern.behavioral.command.hardware.Music;
import com.rakib.javadesignpattern.behavioral.command.service.CommandReceiver;
import com.rakib.javadesignpattern.behavioral.command.service.ICommand;
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
        ICommand allOnCommand = new AllOnCommand(light, music);
        ICommand allOffCommand = new AllOffCommand(light, music);
        ICommand lightOnCommand = new LightOnCommand(light);
        ICommand lightOffCommand = new LightOffCommand(light);
        ICommand musicOnCommand = new MusicOnCommand(music);
        ICommand musicOffCommand = new MusicOffCommand(music);
        ICommand musicStationCommand = new MusicStationCommand(music);
        ICommand musicVolumeCommand = new MusicVolumeCommand(music);
        ICommand noOpsCommand = new NoOpsCommand();


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
