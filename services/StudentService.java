package services;

import model.Student;
import utill.GradeCalculator;

public class StudentService 
{
    private Student[] s = new Student[5];
     private int count = 0;

     public void addStudent(Student student)
     {

        if(count < s.length)
        {
            s[count] = student;
            count++;
        }
        else
        {
            System.out.println("Storage Full");
        }

    }
    GradeCalculator gc = new GradeCalculator();
    
        public void viewStudent()
        {
           for(int i=0; i<count; i++)
           {

             
            s[i].displayStudent(gc);

           }
        }
            
        
        public void searchStudent(int rollNumber)
        {
             boolean find = false;

            for(int i=0; i<count; i++)
                {
                if(s[i].getrollNumber() == rollNumber)
                {
                   s[i].displayStudent(gc);
                     find = true;
                    break;
                }
               
            }
                if(!find)
                {

                      System.out.println("Student Not Found");
                }
           }
           

       

}
