/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leagueoflegends;
import java.util.*;

/**
 *
 * @author Crêak
 */
public class Champion {
    private String name;
    private int leben;
    private int ad;
    private int ap;
    private double atkspd;
    private int movement;
    private double lebensreg;
    private int rüstung;
    private int magieresistenz;
    private int mana;
    private double Manaregen;
    private String[] position;
    private int energy;
    private double energyreg;

    public Champion() {
    }
    
   public static void main(String[]args){ 
   }

    public Champion(String name, int leben, int ad, int ap, double atkspd, int movement, double lebensreg, int rüstung, int magieresistenz, int mana, double Manaregen, String[] position, int energy, double energyreg) {
        this.name = name;
        this.leben = leben;
        this.ad = ad;
        this.ap = ap;
        this.atkspd = atkspd;
        this.movement = movement;
        this.lebensreg = lebensreg;
        this.rüstung = rüstung;
        this.magieresistenz = magieresistenz;
        this.mana = mana;
        this.Manaregen = Manaregen;
        this.position = position;
        this.energy = energy;
        this.energyreg = energyreg;
    }
    
   public String champData () {
        return ""+ this.getLeben()+" HP\n" + this.getAd()+" AD\n" +this.getAp()+" AP\n" +this.getAtkspd()+ " ATKSPD\n" +this.getMovement()+" Movement\n" +this.getLebensreg()+" Liferegen\n" +this.getRüstung() +" Armor\n" +this.getMagieresistenz() +" Magicresistance\n" +this.getMana() +" Mana\n" +this.getManaregen()+" Manaregen\n" +this.getPosition()+" Lane\n";

}
 
    public String getName() {
        return name;
    }

    public int getLeben() {
        return leben;
    }

    public int getAd() {
        return ad;
    }

    public int getAp() {
        return ap;
    }

    public double getAtkspd() {
        return atkspd;
    }

    public int getMovement() {
        return movement;
    }

    public double getLebensreg() {
        return lebensreg;
    }

    public int getRüstung() {
        return rüstung;
    }

    public int getMagieresistenz() {
        return magieresistenz;
    }

    public int getMana() {
        return mana;
    }

    public double getManaregen() {
        return Manaregen;
    }

    public String[] getPosition() {
        return position;
    }

    public int getEnergy() {
        return energy;
    }

    public double getEnergyreg() {
        return energyreg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeben(int leben) {
        this.leben = leben;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void setAtkspd(double atkspd) {
        this.atkspd = atkspd;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public void setLebensreg(double lebensreg) {
        this.lebensreg = lebensreg;
    }

    public void setRüstung(int rüstung) {
        this.rüstung = rüstung;
    }

    public void setMagieresistenz(int magieresistenz) {
        this.magieresistenz = magieresistenz;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setManaregen(double Manaregen) {
        this.Manaregen = Manaregen;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setEnergyreg(double energyreg) {
        this.energyreg = energyreg;
    }
   
    
}
