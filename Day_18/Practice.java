package Day_18;

public class Practice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("Programming");
        System.out.println(sb);

        //Use of insert
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.insert(6, "Programming");
        System.out.println(sb1);

        //use of delete
        StringBuilder sb2 = new StringBuilder("Java Programming");
        sb2.delete(4, 16);
        System.out.println(sb2);

        //deleteCharAt()
        sb2.deleteCharAt(1);
        System.out.println(sb2);

        //replace()
        StringBuilder sb3 = new StringBuilder("Java Programming");
        sb3.replace(0,4,"C++");
        System.out.println(sb3);

        //reverse()
        sb3.reverse();
        System.out.println(sb3);

        //length()
        System.out.println(sb3.length());

        //StringBuffer()
        StringBuffer str = new StringBuffer("Java");
        str.append(" Programming");
        System.out.println(str);
    }
    
}
