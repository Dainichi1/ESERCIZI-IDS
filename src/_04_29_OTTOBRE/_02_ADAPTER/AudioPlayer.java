package _04_29_OTTOBRE._02_ADAPTER;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Supporto integrato per la riproduzione di file MP3.
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // Utilizzo del MediaAdapter per riprodurre altri formati.
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        // Tipo di file non supportato.
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

