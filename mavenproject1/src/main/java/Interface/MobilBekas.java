/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author A-12
 */
public class MobilBekas extends Mobil {
    private int tahun ;
    private double harga;
        
    public MobilBekas (int tahun, double harga, String merek, String model) {
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
    } 
    
    public int getTahun() {
        return tahun;
    }
    
    public double getHarga() {
        return harga;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("ini adalah mobil kijang ekas");
    }
}
