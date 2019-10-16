/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarfilem;

/**
 *
 * @author User
 */
public class judulFilm {
    public String filmName,filmGenre;
    public static double Rating;
    public static int filmDuration;
    
    
    
    
    public void nowPlaying(){
    System.out.println("===Daftar Filem Sedang Tayang===");
    System.out.println("Judul Film :"+filmName);
    System.out.println("Genre Film :"+filmGenre);
    System.out.println("Rating film:"+Rating);
    System.out.println("Duration Film :"+filmDuration+" menit");
        System.out.println("");
    }
}