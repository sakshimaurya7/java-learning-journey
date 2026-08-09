
public class ReportCard {

    public static void main(String[] args) {
        
        String name = "Sakshi";
        int maths_mark = 90;
        int sci_mark = 85;
        int eng_mark = 92;
        int total = maths_mark + sci_mark + eng_mark;
        float avg = total/3.0f;

        System.out.println("**********************");
        System.out.println("REPORT CARD");
        System.out.println("**********************");
        System.out.println("Student Name : " + name);
        System.out.println("Maths        : " + maths_mark);
        System.out.println("Science      : " + sci_mark);
        System.out.println("English      : " + eng_mark);
        System.out.println();
        System.out.println("Total        : " + total);
        System.out.println("Average      : " + avg);
    }
    
}
