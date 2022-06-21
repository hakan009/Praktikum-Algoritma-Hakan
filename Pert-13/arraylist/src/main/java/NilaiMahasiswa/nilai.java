/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

/**
 *
 * @author USER
 */
public class nilai {
    String kodeNilai;
    String kodeMatkul;
    String nimMhs;
    float nilai;

    nilai(String kodeNilai, float nilai, String kodeMatkul, String nimMhs) {
        this.kodeNilai = kodeNilai;
        this.nilai = nilai;
        this.kodeMatkul = kodeMatkul;
        this.nimMhs = nimMhs;
    }
}
