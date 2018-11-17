/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

import ec.edu.espe.Music.model.*;

/**
 *
 * @author Jazz Gutierrez / Fernanda Galarraga
 */
public class MusicPrj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Music music;
        music = new SpanishRock();
        System.out.println("The type of music is ->>"+ music.getClass().getSimpleName());
        music.showArtist();
        music = new AlternativeRock();
        System.out.println("The type of music is ->>"+ music.getClass().getSimpleName());
        music.showArtist();
        Pop jpop = new JPop();
        System.out.println("The type of music is ->>"+ music.getClass().getSimpleName());
        jpop.showArtist();
        jpop.showCountry();
        Pop kpop = new KPop();
        System.out.println("The type of music is ->>"+ music.getClass().getSimpleName());
        kpop.showArtist();
        kpop.showCountry();
        music = new ElectroHouse();
        System.out.println("The type of music is ->>"+ music.getClass().getSimpleName());
        music.showArtist();
        music = new Punk();
        System.out.println("The type of music is ->>"+ music.getClass().getSimpleName());
        music.showArtist();
    }
    
}
