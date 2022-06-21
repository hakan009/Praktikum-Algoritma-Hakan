/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;
import java.util.Comparator;
/**
 *
 * @author USER
 */
public class mhsComparator implements Comparator<mahasiswa>  {
    public int compare(mahasiswa mhs1, mahasiswa mhs2) {
        if (mhs1.nim == mhs2.nim) {
            return 0;
        } else {

            return -1;
        }
    }

    @Override
    public Comparator<mahasiswa> reversed() {
        return Comparator.super.reversed();
    }
}
