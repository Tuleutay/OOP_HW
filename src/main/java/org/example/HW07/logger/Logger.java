package org.example.HW07.logger;

import org.example.HW07.model.Complex_Numb;
import java.io.FileWriter;

public class Logger implements Log {
    @Override
    public void update(Complex_Numb numb, String massage) {
        try (FileWriter fw = new FileWriter("log_lesson_7.txt", true)){
            fw.append("log: " + massage + numb.toString() + "\n");
            fw.flush();
        } catch (Exception e){
            System.out.println(e);
        }
    }

}