import java.util.*;
/**
 *
 * @author TISAO
 */
public class GpCalculator {
public static int coursescore, courseunit, coursegrade, totalnoofcourse, point;
public static float gp, tgp;

static void display (String arg){
System.out.print(arg);
}
static void display (int arg){
System.out.print(arg);
}

static void display (boolean arg){
System.out.print(arg);
}

static void display (double arg){
System.out.print(arg);
}

static void display (char arg){
System.out.print(arg);
}

static void display (long arg){
System.out.print(arg);
}

static void display (float arg){
System.out.print(arg);
}

static void display (byte arg){
System.out.print(arg);
}

static void display (short arg){
System.out.print(arg);
}
public static void gpCalculator(){
            Scanner input = new Scanner (System.in);
        display("Enter your Course Score: ");
        coursescore = input.nextInt();
        
        display("Enter your Course Unit: ");
        courseunit = input.nextInt();
        
       if ((coursescore >= 0) && (coursescore <= 39)){
       coursegrade = 0;
       }        
       else if ((coursescore >= 40) && (coursescore <= 44)){
       coursegrade = 1;
       }
       else if ((coursescore >= 45) && (coursescore <= 49)){
       coursegrade = 2;
       }
       else if ((coursescore >= 50) && (coursescore <= 59)){
       coursegrade = 3;
       }
       else if ((coursescore >= 60) && (coursescore <= 69)){
       coursegrade = 4;
       }
       else if ((coursescore >= 70) && (coursescore <= 100)){
       coursegrade = 5;
       }
       else {
       display("Enter a Valid Exam Score");
       }
       if ((coursescore >= 0) && (coursescore <= 100)){
       display(coursegrade + "\n");
       }
    point = coursegrade*courseunit; 
    

}
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner (System.in);
        display("Enter the total no. of Course you are Offering: ");
        totalnoofcourse = input.nextInt();
        for (i=1; i <= totalnoofcourse; i++){
        gpCalculator();
        gp = point/totalnoofcourse;
        display(gp + "\n");
        }
        

    }    
}
       
 
   

