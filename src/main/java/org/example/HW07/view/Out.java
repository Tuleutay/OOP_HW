package org.example.HW07.view;

import org.example.HW07.logger.Logger;
import org.example.HW07.model.Complex_Numb;

public class Out implements OutInt{
    @Override
    public void print(Complex_Numb res) {
        Logger logger = new Logger();
        logger.update(res, "Результат: ");
        System.out.println(res.toString());
    }
}