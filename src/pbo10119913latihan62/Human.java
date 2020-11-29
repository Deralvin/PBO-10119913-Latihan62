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
public class Human extends LivingThing 
{
    private String nama;

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
