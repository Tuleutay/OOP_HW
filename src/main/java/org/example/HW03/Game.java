package org.example.HW03;

import java.io.IOException;

public interface Game {
    void start( Integer sizeWord, Integer maxTry) throws IOException;
    Answer inputAnswer(String value);
    GameStatus getGameStatus();
}
