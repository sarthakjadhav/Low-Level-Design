package lldPatterns.structural.adapter.media_player.adaptors;

import lldPatterns.structural.adapter.media_player.MediaPlayer;
import lldPatterns.structural.adapter.media_player.third_party_api.AviPlayer;

public class AviAdapter implements MediaPlayer {
    private AviPlayer player;

    public AviAdapter(AviPlayer player){
        this.player= player;
    }

    @Override
    public void play(String fileName) {
        player.runAvi(fileName);
    }
}
