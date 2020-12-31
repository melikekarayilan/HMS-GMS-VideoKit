package com.example.videokitdemojava.Contracts;

public interface IPlayer {
    void readyPlayer(String videoUrl, String name);

    void releasePlayer();
}
