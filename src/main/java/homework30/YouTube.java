package homework30;


public class YouTube {
    public static void main(String[] args) {
        User alex = new User(1, "Alex");
        User lisa = new User(2, "Lisa");
        User eduard = new User(3, "Eduard");
        Video videoOne = new Video(1, "Sport", 25);
        Video videoTwo = new Video(2, "Joga", 55);
        Video videoThree = new Video(3, "Dance", 14);
        Video videoFour = new Video(4, "Music", 5);
        Video videoFive = new Video(5, "Samba", 35);
        Comment alexComment = new Comment("hello everybody", alex, videoOne);
        Comment lisaComment = new Comment("Top Video!!!", lisa, videoTwo);
        Comment eduardComment = new Comment("love this music", eduard, videoFour);
        alex.addVideo(videoOne, alex);
        alex.addVideo(videoFour, alex);
        alex.addVideo(videoFour, alex);
        alex.addVideo(videoFive, alex);
        lisa.addVideo(videoThree, lisa);
        lisa.addVideo(videoTwo, lisa);
        lisa.addVideo(videoFive, lisa);
        eduard.addVideo(videoFour, eduard);
        eduard.addVideo(videoTwo, eduard);
        eduard.addVideo(videoFive,eduard);
        System.out.println("--------------------");
        alex.displayListVideo();
        lisa.displayListVideo();
        eduard.displayListVideo();
        System.out.println("--------------------");
        alexComment.info();
        lisaComment.info();
        eduardComment.info();
        System.out.println("--------------------");
        videoOne.like(alex,videoOne);
        videoOne.like(lisa,videoOne);
        videoOne.like(eduard,videoOne);
        videoThree.like(lisa,videoThree);
        videoThree.like(alex,videoThree);
        videoThree.disLike(eduard,videoThree);
        videoFive.disLike(eduard,videoFive);
        videoFive.disLike(lisa,videoFive);
        videoFive.disLike(alex,videoFive);
        videoFour.like(alex,videoFour);
        videoFour.like(lisa,videoFour);
        videoOne.disLike(eduard, videoOne);
        videoOne.views(eduard, videoOne);
        videoOne.views(lisa, videoOne);
        videoOne.views(lisa, videoOne);
        videoOne.views(lisa, videoOne);
        videoThree.views(alex, videoThree);
        videoThree.views(eduard, videoThree);
        videoThree.views(lisa, videoThree);
        videoTwo.views(lisa, videoTwo);
        videoFour.views(lisa, videoFour);
        videoTwo.views(eduard, videoTwo);
        videoFour.views(eduard, videoFour);
        videoFive.views(eduard, videoFive);
        System.out.println("--------------------");
        alex.displayListVideo();
        lisa.displayListVideo();
        eduard.displayListVideo();
        System.out.println("--------------------");
        alex.removeVideo(videoOne, alex);
        alex.removeVideo(videoThree, alex);
        lisa.removeVideo(videoTwo,lisa);
        lisa.removeVideo(videoTwo,lisa);
        eduard.removeVideo(videoFour,eduard);
        System.out.println("--------------------");
        videoOne.info();
        videoTwo.info();
        videoThree.info();
        videoFour.info();
        videoFive.info();


    }
}
