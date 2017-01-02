/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package *;

/**
 *
 * @author DelightN
 */
public class Eto {
    public char[] yearAnimals ={'子','丑','寅','卯','辰','巳','午','未','申','酉','戌','亥'};
    public int currentYear;
    public Eto(){
        this.currentYear = -8;
    }
    public Eto(int currentYear){
        this.currentYear = currentYear;
    }
    public char getEto(){
        int yearAnimalNumber = (this.currentYear + 8) % 12;
        return this.yearAnimals[yearAnimalNumber];
        
    }
    
}
