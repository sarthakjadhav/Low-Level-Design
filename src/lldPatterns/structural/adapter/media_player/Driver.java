package lldPatterns.structural.adapter.media_player;

import lldPatterns.structural.adapter.media_player.adaptors.VlcAdapter;
import lldPatterns.structural.adapter.media_player.third_party_api.VlcPlayer;

public class Driver {
    // very good sarthak
    public static void main(String[] args){
        MediaPlayer player = new VlcAdapter(new VlcPlayer());
        player.play("I love you");
    }
}
