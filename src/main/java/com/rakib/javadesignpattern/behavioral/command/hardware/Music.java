package com.rakib.javadesignpattern.behavioral.command.hardware;

public class Music {
    private int volume;
    private int station;

    public void onMusic() {
        System.out.println("Music is going to on !!!");
    }

    public void offMusic() {
        System.out.println("Music is going to off !!!");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        System.out.println("volume setting......" + volume);
        this.volume = volume;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        System.out.println("station setting......." + station);
        this.station = station;
    }
}
