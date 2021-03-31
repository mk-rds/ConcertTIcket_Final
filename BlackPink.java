/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BlackPink extends Concert {
    private TicketType TicketType;

    
  
    public BlackPink(String conName, String conTime,TicketType TicketType) {
        super(conName, conTime);
        this.TicketType = TicketType;
    }
    
    
    
    
    public static String printSongList(){
        ArrayList<String> songList = new ArrayList<>();
        songList.add("ddu-ddu-ddu");
        songList.add("kill this love");
        
        for(int i=0;i<=songList.size()-1;i++){
            
            System.out.println(songList.get(i));
                 
        }
        
        return "";
           
                 
        }
    
    

    @Override
    public String toString() {
        return super.toString() + "BlackPink{" + "TicketType=" + TicketType + '}';
    }

   

  
   
    
    
    }
    

