package org.example.HW03;


import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("Играем в игру Быки - коровы");
        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        Scanner in=new Scanner(System.in);
        System.out.println("Выберите игру");
        int num=in.nextInt();
        System.out.println("Компьютер загадывает последовательность из 4х символов.\n" +
                "У Вас 4 попытки, Удачи!");
        Game game = null;
        switch (num){
            case 1:game=new NumberGame();
                break;
            case 2:game=new EnglishLanguageGame();
                break;
            case 3:game=new WordRussianGame();
                break;
            default:
                System.out.println("такой игры еще не существует");
        }
        game.start(4,4);
        while(game.getGameStatus().equals(GameStatus.START)){
            System.out.println("ваш ход");
            String answer=in.next();
            Answer answerGame=game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков",answerGame.getCows(),answerGame.getBulls()));
        }
        System.out.println(game.getGameStatus());
    }
}
