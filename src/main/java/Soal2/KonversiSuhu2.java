/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author Administrator
 */
public class KonversiSuhu2 extends KonversiSuhu{
    public void fahrenheitToReamur(float suhu){
        float ftor = ( suhu - 32 ) * 4/9;
        System.out.println("Fahrenheit=" + suhu + "\t--->" + "\t\tReamur\t\t=" + ftor);
    }
}
