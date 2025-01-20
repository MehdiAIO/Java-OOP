public class Friend {
    String name;
    static int numOfFriends;
    Friend(String name){
        this.name = name;
        numOfFriends++;
    }
    static void numOfFriends(){
        System.out.println("the number of friends is "+numOfFriends);
    }
}
