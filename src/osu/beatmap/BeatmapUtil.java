package osu.beatmap;

import java.io.File;
public class BeatmapUtil {

    public static void main(String[] args) {
        System.out.println(args[0]);
	BeatmapParser.parseAllFiles(new File(args[0]));
    }
}
