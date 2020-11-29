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
 *  Deskripsi : Program LivingThing

 * @author Lenovo
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama) 
    {
        System.out.println(nama + " Bernafas");
    }
    
    public void eat(String nama) 
    {
        System.out.println(nama + " Makan");
    }
}
