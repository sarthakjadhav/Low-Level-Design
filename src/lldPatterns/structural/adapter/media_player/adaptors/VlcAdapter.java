package lldPatterns.structural.adapter.media_player.adaptors;

import lldPatterns.structural.adapter.media_player.MediaPlayer;
import lldPatterns.structural.adapter.media_player.third_party_api.VlcPlayer;

public class VlcAdapter implements MediaPlayer {
    private VlcPlayer player;

    public VlcAdapter(VlcPlayer player){
        this.player = player;
    }

    @Override
    public void play(String fileName) {
        player.playVlc(fileName);
    }
}
