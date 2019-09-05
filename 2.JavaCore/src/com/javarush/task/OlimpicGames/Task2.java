package com.javarush.task.OlimpicGames;

//public class Task2 {
//}

import java.applet.*;
import java.awt.*;

public class Task2 extends Applet
{
//    public Task2() {
//    }

    //текст, отражается по кнопке Applet - Info
    public String getAppletInfo() {
        return "Name: Task2\r\n" +
                "Author: Alexandr Frolov\r\n" +
                "E-mail: frolov@glas.apc.org\n" +
                "WWW:    http://www.glasnet.ru/~frolov\n" +
                "Created with Microsoft Visual J++ Version 1.0";
    }

    public void init(){
        // Для того чтобы размеры окна аплета можно было
        // задавать в документе HTML, закрываем следующую
        // строку символом комментария
        // resize(320, 240);
    }
    // -------------------------------------------------------
    // paint
    // Метод paint, выполняющий рисование в окне аплета
    // -------------------------------------------------------
    public void paint(Graphics g)
    {
        // Определяем текущие размеры окна аплета
        Dimension dimAppWndDimension = size();

        // Стираем содержимое окна аплета. Цвет окна
        // становится таким же, как и цвет фона
        // окна навигатора
        g.clearRect(0, 0,
                dimAppWndDimension.width  - 1,
                dimAppWndDimension.height - 1);
//        // Выбираем в контекст отображения желтый цвет
        g.setColor(Color.pink);
//        // Закрашиваем внутреннюю область окна аплета
        g.fillRect(0, 0,
                dimAppWndDimension.width  - 1,
                dimAppWndDimension.height - 1);
//
        for (int i = 0; i < 90; i+=10) {
            g.setColor(new Color(255 - 2*i, 2*i, 2*i));
            g.drawRect(10 + i, 30 + i, 50 + i, 50 + i);
        }

        for (int i = 0; i < 90; i+=10) {
            g.setColor(new Color(255 - 2*i, 2*i, 2*i));
            g.drawOval(220 + i, 30 + i, 50 + i, 50 + i);
        }
    }
}