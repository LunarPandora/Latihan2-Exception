/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan2.exception;

/**
 *
 * @author Wendy
 */
public class Latihan2Exception {
    
    public static void main(String[] args) throws ProgramException {
        File file1 = new File("Text1.txt", "Ini adalah isi dari text 1.");
        File file2 = new File("Text2.txt", "Ini adalah isi dari text 2.");

        Penyimpanan disk1 = new Penyimpanan("disk1");
        disk1.tambahFile(file1);
        disk1.tambahFile(file2);    

        disk1.bacaFile("Text1.txt");
    }
}
