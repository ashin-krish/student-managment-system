package model;

import utill.GradeCalculator;

public class Student {

    private String name;
    private int rollNumber;
    private int mark1;
    private int mark2;
    private int mark3;

   public Student(String name, int rollNumber, int mark1, int mark2, int mark3  )
    {
        setName(name);
        setRollNumber(rollNumber);
        setMark1(mark1);
        setMark2(mark2);
        setMark3(mark3);
    }

    public void setName(String name)
    {
        if(  name != null && name.trim().length() > 0)
        {
            this.name = name;
        }
        else{
            System.out.println("Enter a valid Name");
        }
    }

       public void setRollNumber(int rollNumber)
    {
        if(rollNumber > 0)
        {
            this.rollNumber = rollNumber;
        }
        else{
            System.out.println("Enter a valid RollNumber");
        }
    }

    
       public void setMark1(int mark1)
    {
        if(mark1 >= 0 && mark1 <=100)
        {
            this.mark1 = mark1;
        }
        else{
            System.out.println("Enter a valid Markr");
        }
    }

          public void setMark2(int mark2)
    {
        if(mark2 >= 0 && mark2 <=100)
        {
            this.mark2 = mark2;
        }
        else{
            System.out.println("Enter a valid Markr");
        }
    }


          public void setMark3(int mark3)
    {
        if(mark3 >= 0 && mark3 <=100)
        {
            this.mark3 = mark3;
        }
        else{
            System.out.println("Enter a valid Markr");
        }

    }

    public String getName()
    {
        return name;
    }

    
    public int getrollNumber()
    {
        return rollNumber;
    }

      public int getmark1()
    {
        return mark1;
    }

       public int getmark2()
    {
        return mark2;
    }

       public int getmark3()
    {
        return mark3;
    }

    public void displayStudent(GradeCalculator gc)
    {
      
        System.out.println(" Name : " + name);
        System.out.println(" RollNumber : " + rollNumber);
        System.out.println(" Mark 1 : " + mark1);
        System.out.println(" Mark 2 : " + mark2);
        System.out.println(" Mark 3 : " + mark3);

        System.out.println(" Total Mark : " + gc.calculateTotal(this));
        System.out.println(" Average Mark : " + gc.calculateAverage(this));
        System.out.println(" Grade : " + gc.calculateGrade(this));
       ;
    }


    
    

    
}
