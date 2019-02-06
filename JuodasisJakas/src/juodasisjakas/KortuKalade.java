/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juodasisjakas;

import java.awt.List;
import java.awt.PopupMenu;
import java.util.Arrays;
import javax.smartcardio.Card;

/**
 *
 * @author julekas
 */
class KortuKalade {

   

    int[] deck = new int [53];
    
    
    
    static int Traukimas() {
        
        int random = (int )(Math.random() * 11 + 1);
        return random;
    }
    
    
    
}
