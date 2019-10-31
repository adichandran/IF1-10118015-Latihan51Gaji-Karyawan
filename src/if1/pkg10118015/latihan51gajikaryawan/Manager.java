/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan51gajikaryawan;

/**
 *
 * @author ACER
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int kehadiran){
        return kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
         if (jabatan.equals("manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        switch (golongan){
            case 1 : tunjanganGolongan = 500000;
                break;
            case 2 : tunjanganGolongan = 1000000;
                break;
            case 3 : tunjanganGolongan = 1500000;
                break;
            default: tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
