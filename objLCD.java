package TugasLCD;

import java.util.Scanner;

public class objLCD {
    public static void main(String[] args) {
        clsLCD LCD1 = new clsLCD();
        clsLCD LCD2 = new clsLCD();
        clsLCD LCD3 = new clsLCD();

        LCD1.turnOn();
        LCD1.setCable();
        LCD1.setCableUp();
        LCD1.setCableUp();
        LCD1.setCableUp();
        LCD1.setVolume(32);
        LCD1.volumeDown();
        LCD1.volumeUp();
        LCD1.volumeUp();
        LCD1.volumeUp();
        LCD1.setBrightness(20);
        LCD1.brightnessDown();
        LCD1.brightnessDown();
        
        LCD2.turnOff();
        LCD2.setCable();
        LCD2.setCableUp();
        LCD2.setCableUp();
        LCD2.setCableDown();
        LCD2.setVolume(57);
        LCD2.volumeDown();
        LCD2.volumeDown();
        LCD2.volumeUp();
        LCD2.setBrightness(68);
        LCD2.brightnessDown();
        LCD2.brightnessDown();
       
        LCD3.turnOn();
        LCD3.freeze();
        LCD3.setCable();
        LCD3.setCableUp();
        LCD3.setCableUp();
        LCD3.setCableUp();
        LCD3.setCableUp();
        LCD3.setCableUp();
        LCD3.setCableUp();
        LCD3.setVolume(100);
        LCD3.volumeDown();
        LCD3.volumeDown();
        LCD3.volumeDown();
        LCD3.volumeDown();
        LCD3.volumeUp();
        LCD3.setBrightness(43);
        LCD3.brightnessDown();
        LCD3.brightnessDown();


        LCD1.display();
        LCD2.display();
        LCD3.display();
    }
}
