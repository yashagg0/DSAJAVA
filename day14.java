public class day14{     //STRING BUILDER
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Hello");
        sb.append("hey");
        // System.out.println(sb.capacity());
        // sb.ensureCapacity(100);
        // sb.append("Bye");
        // System.out.println(sb.substring(5));
        // System.out.println(sb.length());
        // System.out.println(sb);
        // System.out.println(sb.capacity());

        // sb.insert(2,"y");
        // System.out.println(sb);
        // sb.insert(4, 2.0);
        // System.out.println(sb);
        // sb.delete(2, 5);
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        sb.replace(2, 5, "llllll");
        System.out.println(sb);
        System.out.println(sb.capacity());


        // String s = new String("Hello");

    }
}