package main;

import java.util.Scanner;

import model.Student;
import services.StudentService;


public class mains 
{
    public static void main(String[] arg)
{
 
    Scanner sc = new Scanner(System.in);
    
    int choice;
    StudentService service = new StudentService();

    while (true) {
        System.out.println(" 1) Add Student 2)View All Students 3)Search Student 4)Show Grade 5)Exit  ");
        System.out.println(" Enter Your Choice ");
        choice = sc.nextInt();
        sc.nextLine();

         int searchKey;


     switch (choice) 
     {

        case 1:

            String name;
            int rollNumber;
            int mark1;
            int mark2;
            int mark3;
            System.out.println("Enter the name : ");
            name = sc.nextLine();

               System.out.println("Enter the RollNumber : ");
            rollNumber = sc.nextInt();

               System.out.println("Enter the Mark 1 : ");
            mark1 = sc.nextInt();

                System.out.println("Enter the Mark 2 : ");
            mark2 = sc.nextInt();

                System.out.println("Enter the Mark 3 : ");
            mark3 = sc.nextInt();
            sc.nextLine();

            Student s = new Student(name, rollNumber, mark1, mark2, mark3);

            service.addStudent(s);
            
            break;

            case 2:
                service.viewStudent();
                break;

            case 3:
                System.out.println(" Enter the RollNumber to search ");

                searchKey = sc.nextInt();
                
                service.searchStudent(searchKey);
                break;

            case 4:
               sc.close();
               return;



                

     
        default:
            break;
     }

        
    }
}

     
}
