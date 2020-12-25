package DataStructure;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        String[] platform1 = {"PS$"};
        String[] platform2 = {"3DS", "Wii U"};

        VideoGame game1 = new VideoGame("WordWarI", 1980, "M", platform1);
        VideoGame game2 = new VideoGame("Pokemon Go", 2009, "E", platform2);
        VideoGame game3 = new VideoGame("Donkey Donkey", 2020, "E", platform2);

        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(0, game3);
        System.out.println(games);

    }
}
