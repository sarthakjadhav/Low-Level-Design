package lldPatterns.structural.adapter.media_player.adaptors;

import lldPatterns.structural.adapter.media_player.MediaPlayer;
import lldPatterns.structural.adapter.media_player.third_party_api.Mp4Player;

public class Mp4Adapter implements MediaPlayer {
    private Mp4Player player;

    public Mp4Adapter(Mp4Player player){
        this.player = player;
    }

    @Override
    public void play(String fileName) {
        player.startMp4(fileName);
    }
}
