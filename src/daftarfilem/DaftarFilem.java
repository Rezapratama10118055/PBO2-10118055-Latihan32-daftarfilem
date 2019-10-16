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
public class DaftarFilem {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        judulFilm judul = new judulFilm();
        
        judul.filmName="Venom";
        judul.filmGenre="Action,Horror,Scifi";
        judul.Rating= 8.5 ;
        judul.filmDuration= 120;
        judul.nowPlaying();
       
        judul.filmName="Small Foot";
        judul.filmGenre="Animation";
        judul.Rating= 9.0 ;
        judul.filmDuration= 96 ;
        judul.nowPlaying();
        
        judul.filmName="Crazy Rich Asian";
        judul.filmGenre="Comedy";
        judul.Rating= 7.8 ;
        judul.filmDuration= 119;
        judul.nowPlaying();
        
        judul.filmName="Asih";
        judul.filmGenre="Horror";
        judul.Rating= 6.0 ;
        judul.filmDuration= 100;
        judul.nowPlaying();
    }   
    
}
