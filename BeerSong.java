/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author Admin
 */
public class BeerSong {

    int beer = 99;
    String song;
    public static void main(String[] args) {
        BeerSong beersong = new BeerSong();
        beersong.Ninety_Nine_Bottles_of_Beer();
    }
    
    public void Ninety_Nine_Bottles_of_Beer(){
        for(int i = 0; i < 99; i++){
            if(beer == 1){
                System.out.println(beer + " bottle of beer on the wall, " 
            + beer + " bottle of beer.");
            }
            else{
                System.out.println(beer + " bottles of beer on the wall, " 
            + beer + " bottles of beer.");
            }
            beer = beer - 1;
            if(beer == 0){
                System.out.println("Take one down, pass it around, no more bottles of beer on the wall.");
            }
            else if(beer == 1){
                System.out.println("Take one down, pass it around, " + beer + " bottle of beer on the wall.");
            }
            else{
                System.out.println("Take one down, pass it around, " + beer + " bottles of beer on the wall.");
            }
        }
    }
    
}
