/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author aytacakkaya
 */
public class InnerClass {

    public class Dahil {

        public void goster() {
            System.out.println("Dahil class icindesin.");
        }
    }

    public static void main(String[] args) {
        InnerClass.Dahil in = new InnerClass().new Dahil();

        in.goster();
    }
}
