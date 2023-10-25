/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author Administrator
 */
public class KonversiSuhu {
   public void celciusToFahrenheit (float suhu){
    float f = (suhu * 9/5) + 32;
    System.out.println("Celcius\t=" + suhu +"\t\t--->" + "\t\tFahrenheit\t=" + f);
    
   }
   public void celciusToReamur (float suhu){
    float r = suhu * 4/5;
    System.out.println("Celcius\t=" + suhu +"\t\t--->" + "\t\tReamur\t\t=" + r);

   }
}
