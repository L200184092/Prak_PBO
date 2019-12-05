package Sarangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABRPL-9
 */
public class NestedClass {
    String nama = "Ganno";
    String nim = "L200184092";
    
    public void printNama() {
        System.out.println(nama + " : " + nim);
    }
    
    static class StaticNestedClass {
        static String jurusan = "Informatika";
    }
    
    class InnerClass {
        public String getJurusan() {
            return StaticNestedClass.jurusan;
        }
    }
}
