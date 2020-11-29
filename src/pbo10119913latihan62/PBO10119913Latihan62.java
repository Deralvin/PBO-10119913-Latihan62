/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan62;

/**
 *  Nama : Muhammad Alvin Rizqi Ramadhan
 *  Kelas : IF10K
 *  NIM : 10119913
 *  Deskripsi : Progmram LivingThing

 * @author Lenovo
 */
public class PBO10119913Latihan62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human h = new Human();
        h.setNama("Muhammad Alvin");
        
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
    
}
