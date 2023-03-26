package org.example.HW03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame{
    @Override
    List<String> generateCharList() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\tooly\\Desktop\\GB\\Java\\OOP_HW" +
                "\\src\\main\\java\\org\\example\\HW03\\RussianLanList.txt"));
        String str = reader.readLine();
        char[] s = str.toCharArray();
        List<String> charList = new ArrayList<String>();
        for (int i = 0; i < str.length(); ++i) {
            charList.add(String.valueOf(s[i]));
        }

        return charList;
    }
}

