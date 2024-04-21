package homework24;

import java.time.LocalDateTime;

public class SocialNetworkTest {
    public static void main(String[] args) {
        UserCommunity util = new UserCommunity();

        User userAleksandrBadaev = new User("Aleksandr Badaev", 465);
        User userElizavetaBogdan = new User("Elizaveta Bogdan", 777);
        User userAndreyBadaev = new User("Andrey Badaev", 654);
        User userEduardVasilenko = new User("Eduard Vasilenko", 647);

        System.out.println("----------addFriendsList----------");
        userAleksandrBadaev.addFriends(userAleksandrBadaev, userElizavetaBogdan);
        userElizavetaBogdan.addFriends(userElizavetaBogdan, userAleksandrBadaev);
        userAleksandrBadaev.addFriends(userAleksandrBadaev, userAndreyBadaev);
        userAleksandrBadaev.addFriends(userAleksandrBadaev, userAndreyBadaev);
        userAleksandrBadaev.addFriends(userAleksandrBadaev, userEduardVasilenko);
        util.findUser(userAleksandrBadaev);

        userElizavetaBogdan.printListFriends(userElizavetaBogdan);
        userAleksandrBadaev.printListFriends(userAleksandrBadaev);
        userAndreyBadaev.printListFriends(userAndreyBadaev);

        System.out.println("----------removeFriend----------");
        userAleksandrBadaev.removeFriend(userAleksandrBadaev, userEduardVasilenko);
        userAleksandrBadaev.printListFriends(userAleksandrBadaev);
        userAleksandrBadaev.removeFriend(userAleksandrBadaev,userEduardVasilenko);

        System.out.println("----------addUserList----------");
        util.addUser(userElizavetaBogdan);
        util.addUser(userAleksandrBadaev);
        util.addUser(null);
        util.addUser(userAleksandrBadaev);
        util.addUser(userAndreyBadaev);
        util.addUser(userEduardVasilenko);

        System.out.println("-------------------");

        Message userAleksandrBadaevMessage = new Message(userAleksandrBadaev, "Do you have time this weekend to meet me?", LocalDateTime.now());

        userAleksandrBadaev.sendMessage(userAleksandrBadaevMessage.getText(), userAleksandrBadaevMessage.getTime());

        userElizavetaBogdan.sendMessage("Yes. Lets meet on saturday", LocalDateTime.now());

        userAleksandrBadaevMessage.likeMessage(userElizavetaBogdan);


        Community communityResidents = new Community("Residents of the house N5");
        communityResidents.addMember(userAleksandrBadaev);
        communityResidents.addMember(userElizavetaBogdan);
        communityResidents.addMember(userAndreyBadaev);
        communityResidents.addMember(userEduardVasilenko);
        communityResidents.printListCommunity();
        communityResidents.removeFromCommunityList(userAndreyBadaev);
        communityResidents.printListCommunity();
        communityResidents.removeFromCommunityList(userAndreyBadaev);
        communityResidents.foundUser(userAleksandrBadaev);





    }
}
