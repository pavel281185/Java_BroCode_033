public class Main {
    public static void main(String[] args) {
        // static

        Friend friend1 = new Friend("Mark");
        Friend friend2 = new Friend("Thomas");
        Friend friend3 = new Friend("Mike");
        Friend friend4 = new Friend("Jane");
        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();

    }
}