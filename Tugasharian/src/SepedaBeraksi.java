/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */


public class SepedaBeraksi{
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();
        sepedaku.setGir(1); // menset nilai gir = 1 (sebelumnya 0)
        
        System.out.println(“Gir saat ini: “ + sepedaku.getGir());
        
        sepedaku.setGir(3); // menambahkan 3 pada posisi gir saat ini (1)
        
        System.out.println(“Gir saat ini: “ + sepedaku.getGir());
    }

}
    private static class Gir {

        public Gir() {
                int gir;
            // method (mutator) dengan parameter
            void setGir(int pertambahanGir) {
                gir= gir+ pertambahanGir;
            }
            // method (accessor)
            int getGir() {
                return gir;
            }
        }
    }
}