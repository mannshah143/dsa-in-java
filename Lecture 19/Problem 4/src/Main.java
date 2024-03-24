// number of ways in which one can invite n people to a party, single or in pairs

public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(invitePeople(n));
    }

    public static int invitePeople(int n) {
        if (n <= 1) {
            return 1;
        }

        // when guests are called single
        int single = invitePeople(n-1);

        // when guests are called in pairs
        int pair = (n-1) * invitePeople(n-2);

        // total ways to invite n guests
        return single + pair;
    }
}