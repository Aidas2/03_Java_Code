import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;
import java.util.stream.Collectors;

public class SocialNetworkImpl implements SocialNetwork {

    LinkedList<Friend> friends;

    public SocialNetworkImpl() {
        this.friends = new LinkedList<>();
    }

    @Override
    public void addFriend(Friend friend) {
        if (friend == null || friend.getFirstName() == null && friend.getLastName() == null) { //patikrinimas ar draugas turi duomenis  + varda, pavarde
            throw new IllegalArgumentException();
        }

        if (!friends.contains(friend)) { //patikrinimas ar tokio draugo sarase dar nera/yra
            friends.add(friend);
        }
    }

    @Override
    public int getNumberOfFriends() {
        int count = 0;
        count = friends.size();
        return count;
    }

    @Override
    public Friend findFriend(String name, String surname) throws FriendNotFoundException {
        if (name == null || surname == null) { //patikinimas ar yra duomenys
            throw new IllegalArgumentException();
        }

        for (Friend friend : friends) { //patikrinimas palyginant vardus ir pavardes
            if (friend.getFirstName().equals(name) && friend.getLastName().equals(surname)) {
                return friend;
            }
        }
        throw new FriendNotFoundException(name, surname);
    }

    @Override
    public Collection<Friend> findByCity(String city) {
        if (city == null) { //patikrinimas ar miestas turi duomenis
            throw new IllegalArgumentException();
        }
        LinkedList<Friend> friendsByCity = new LinkedList<>(); //sukuriam dar viena lista i kuri desim atrinktus draugus,
        // o po to si lista returninsim (nes metodas praso grazinti draugus sarasa)

        for (Friend friend : friends) {
            if (friend.getCity().equals(city)) {
                friendsByCity.add(friend);
            }
        }
        return friendsByCity;
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
//        return friends.stream()
//                .sorted(Comparator.comparing(Friend::getCity)
//                        .thenComparing(Friend::getLastName)
//                        .thenComparing(Friend::getFirstName)).collect(Collectors.toList());
        //alternatyva:
        Comparator<Friend> sortFriends = Comparator.comparing(Friend::getCity)
                .thenComparing(Friend::getLastName)
                .thenComparing(Friend::getFirstName);
        Collections.sort(friends, sortFriends);
        return friends;
    }
}