public class AdapterPattern {
    // TODO: Implement Adapter Pattern

    // Pseudo code:
    // - interface MediaPlayer { void play(String audioType, String fileName); }
    // - class AdvancedMediaPlayer { void playVlc(String fileName); void playMp4(String fileName); }
    // - class MediaAdapter implements MediaPlayer { private AdvancedMediaPlayer; play() delegates }

    interface MediaPlayer {
        void play(String audioType, String fileName);
    }

    interface AdvancedMediaPlayer {
        void playVlc(String fileName);
        void playMp4(String fileName);
    }

    static class VlcPlayer implements AdvancedMediaPlayer {
        public void playVlc(String fileName) { /* play vlc */ }
        public void playMp4(String fileName) { /* not supported */ }
    }

    static class Mp4Player implements AdvancedMediaPlayer {
        public void playVlc(String fileName) { /* not supported */ }
        public void playMp4(String fileName) { /* play mp4 */ }
    }

    static class MediaAdapter implements MediaPlayer {
        AdvancedMediaPlayer advancedPlayer;

        public MediaAdapter(String audioType) {
            // TODO: instantiate based on type
        }

        public void play(String audioType, String fileName) {
            // TODO: delegate
        }
    }

    // TODO: Implement
}