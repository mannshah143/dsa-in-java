public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'y');
        System.out.println(sb);

        sb.insert(5, 'w');
        System.out.println(sb);

        sb.delete(4,sb.length());
        System.out.println(sb);

        sb.append("o");
        sb.append("w");
        System.out.println(sb);

        // reverse the string
        for (int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}