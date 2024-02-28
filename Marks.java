import java.util.*;
public class Marks{
    public static void main(String args[]){
        //Taking input from the user
        Scanner upsc=new Scanner(System.in);
        System.out.print("Enter Hindi subject marks:");
        int s1=upsc.nextInt();
        System.out.print("Enter Maths subject marks:");
        int s2=upsc.nextInt();
        System.out.print("Enter English subject marks:");
        int s3=upsc.nextInt();
        System.out.print("Enter Science subject marks:");
        int s4=upsc.nextInt();
        System.out.print("Enter Social subject marks:");
        int s5=upsc.nextInt();
        //calculating total
        int total=s1+s2+s3+s4+s5;
        int avg=total/5;
        //Giving grades and percentage
        if(avg<=100&&avg>=90&&s1>=35&&s2>=35&&s3>=35&&s4>=35&&s5>=35){
            System.out.println("Totalmarks"+" "+"Avgpercentage"+" "+"Grade");
            System.out.println(total+"        "+avg+"%"+"          "+"A grade");
        }
        else if(avg<=89&&avg>=80&&s1>=35&&s2>=35&&s3>=35&&s4>=35&&s5>=35){
            System.out.println("Totalmarks"+" "+"Avgpercentage"+" "+"Grade");
            System.out.println(total+"        "+avg+"%"+"          "+"B grade");
        }
        else if(avg<=79&&avg>=70&&s1>=35&&s2>=35&&s3>=35&&s4>=35&&s5>=35){
            System.out.println("Totalmarks"+" "+"Avgpercentage"+" "+"Grade");
            System.out.println(total+"        "+avg+"%"+"          "+"C grade");
        }
        else if(avg<=69&&avg>=60&&s1>=35&&s2>=35&&s3>=35&&s4>=35&&s5>=35){
            System.out.println("Totalmarks"+" "+"Avgpercentage"+" "+"Grade");
            System.out.println(total+"        "+avg+"%"+"          "+"D grade");
        }
        else if(avg<=59&&avg>=50&&s1>=35&&s2>=35&&s3>=35&&s4>=35&&s5>=35){
            System.out.println("Totalmarks"+" "+"Avgpercentage"+" "+"Grade");
            System.out.println(total+"        "+avg+"%"+"          "+"E grade");
        }
       else{
        System.out.println("You have Failed - F grade");
       }
    } 
} 