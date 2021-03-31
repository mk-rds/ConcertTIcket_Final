/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAssignment;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BlackPink extends Concert {

    private TicketType TicketType;

    public BlackPink(String conName, String conTime, String conDesc, String conDest, String conArtist, TicketType TicketType) {
        super(conName, conTime, conDesc, conDest, conArtist);
        this.TicketType = TicketType;
    }

    public static String printSongList() {
        ArrayList<String> songList = new ArrayList<>();
        songList.add("\nSONGS PERFORMING : \n -Kill This Love");
        songList.add(" -Don't Know What to Do");
        songList.add(" -Kick It");
        songList.add(" -Hope Not");
        songList.add(" -Ddu-Du Ddu-Du");

        for (int i = 0; i <= songList.size() - 1; i++) {

            System.out.println(songList.get(i));

        }

        return "";

    }

    @Override
    public String toString() {
        return super.toString() + "\nType of Ticket (BLACKPINK) : " + TicketType;
    }

}

  

