import java.util.Scanner;
class Calculate{
    int total_marks;
    float average_percentage;
    public int TotalMarks(int Telugu,int English,int Maths, int Physics, int Chemistry){
        total_marks=Telugu+English+Maths+Physics+Chemistry;
        return total_marks;
    }
    public float AveragePercentage(){
        average_percentage= total_marks/5;
        return average_percentage;
    }
    public void AssignGrades(){
        if (average_percentage>=90){
            System.out.println("Grade: A");
        }
        else if(average_percentage>=80){
            System.out.println("Grade: B");
        }
        else if(average_percentage>=70){
            System.out.println("Grade: C");
        }
        else if(average_percentage>=65){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Did not qualify!");
        }
    }
}
public class StudentMarksCalculator {
    public static void main(String[] args){
        int Telugu;
        int English;
        int Maths;
        int Physics;
        int Chemistry;
        System.out.println("<--Student Grade Calculator-->");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks obtained in Telugu: ");
        Telugu=sc.nextInt();
        System.out.println("Enter marks obtained in English: ");
        English=sc.nextInt();
        System.out.println("Enter marks obtained in Maths: ");
        Maths=sc.nextInt();
        System.out.println("Enter marks obtained in Physics: ");
        Physics=sc.nextInt();
        System.out.println("Enter marks obtained in Chemistry: ");
        Chemistry=sc.nextInt();
        Calculate c=new Calculate();
        System.out.println("Total marks obtained: "+c.TotalMarks(Telugu,English,Maths,Physics,Chemistry));
        System.out.println("Average Percentage is: "+c.AveragePercentage());
        c.AssignGrades();


    }
}
