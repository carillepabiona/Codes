/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Carille
 */
public class TP1 {

    public static void main(String[] args) {
     ArrayList<String> songs = new ArrayList<String>();
	        songs.add("1. Somebody");
	        songs.add("2. Happiness");
	        songs.add("3. Heaven Knows");
	        songs.add("4. Lowkey");
	        songs.add("5. Long Live");
	    
	    ArrayList<String> artists = new ArrayList<String>();
	        artists.add("Do Kyungsoo");
	        artists.add("Rex Orange County");
	        artists.add("Orange and Lemons");
	        artists.add("NiKi");
	        artists.add("Taylor Swift");
	        
	    ArrayList<String> albums = new ArrayList<String>();
	        albums.add("Expectation");
	        albums.add("Apricot Princess");
	        albums.add("Strike Whilst The Iron Is Hot");
	        albums.add("Wanna take this downtown?");
	        albums.add("Speak Now");
	        
        combine(songs.listIterator(), artists.listIterator(), albums.listIterator());

    }

    public static void combine(Iterator<String> songs, Iterator<String> artists, Iterator<String> albums) {

        if (songs.hasNext() && artists.hasNext() && albums.hasNext() ) {
                System.out.println(songs.next() + " -> " + artists.next() + " -> " + albums.next());
                        combine(songs, artists, albums);
        }
    }
}
