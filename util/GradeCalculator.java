package utill;

import model.Student;

public class GradeCalculator 

{


   
    public int calculateTotal(Student student)
    {
      if(student.getmark1() >= 0 && student.getmark2() >=0  && student.getmark3() >= 0)
      {
             return student.getmark1() + student.getmark2() + student.getmark3();
         
      }

      else
      {
        return -1;
      }
    }


    public float calculateAverage(Student student)
    {
        return (student.getmark1() + student.getmark2() + student.getmark3())/3.0f;

        
    }

    public char calculateGrade(Student student)
    {

        float avg = calculateAverage(student);

        if(avg >= 90)
        {
            return 'A';
        }
        else if(avg >= 80)
        {
            return 'B';
        }

         else if(avg >=70)
        {
            return 'C';
        }

           else if(avg >= 60)
        {
            return 'D';
        }

            else
        {
            return 'F';
        }

  
      
        
    }


}
