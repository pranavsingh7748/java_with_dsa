package condiational;

public class ifelse {
    public static void main(String[] args) {
        int marks=67;
        if(marks>90){
            System.out.println("Excellent");
        } else  if(marks>80 && marks<=90){
            System.out.println("Good");
        } else if (marks>70 && marks<80) {
            System.out.println("Fair");
        } else if (marks>60  && marks<70) {
            System.out.println("Expectations");
        } else if(marks<60){
            System.out.println("Fair");
        }
    }
}
