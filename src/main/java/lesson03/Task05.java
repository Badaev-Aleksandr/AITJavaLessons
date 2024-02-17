package lesson03;

public class Task05 {
    public static void main(String[] args) {
        int Treak01 = 356;
        int Treak02 = 364;
        int Treak03 = 328;
        int sumallTreaks = (Treak01 + Treak02 + Treak03);

        System.out.println(sumallTreaks);

        double STreak01 = 356.0/60;
        double STreak02 = 364.0/60;
        double STreak03 = 328.0/60;
        System.out.println(STreak01);
        System.out.println(STreak02);
        System.out.println(STreak03);

        int firstSong = 364;
        int minutesFirstSong = firstSong/60;
        int secondFirstSong = firstSong - minutesFirstSong*60;
        System.out.println(minutesFirstSong + ":" + secondFirstSong);
    }
}

