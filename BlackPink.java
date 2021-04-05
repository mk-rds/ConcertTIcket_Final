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
        songList.add("\n\t\t\t\t\t\t\t   SONGS PERFORMING\t\n\n\t\t\t\t\t\t |\t'Kill This Love'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Don't Know What to Do'\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Kick It'\t\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Hope Not'\t\t\t|");
        songList.add("\t\t\t\t\t\t |\t'Ddu-Du Ddu-Du'\t\t\t|");

        for (int i = 0; i <= songList.size() - 1; i++) {

            System.out.println(songList.get(i));

        }

        return "";

    }

    @Override
    public String toString() {
        return super.toString() + "\n\n                             Available Tickets\t:" + TicketType;
    }

}

  

