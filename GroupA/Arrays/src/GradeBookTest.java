// Fig. 7.15: GradeBookTest.java
// GradeBookTest creates a GradeBook object using an array of grades, 
// then invokes method processGrades to analyze them.
public class GradeBookTest
{ 
   // main method begins program execution
   public static void main(String[] args)
   {
      // one-dimensional array of student grades
      double[] gradesArray = {87.8, 68.7, 94.9, 100.0, 83.7, 78.45, 85.87, 91.8, 76.4, 87.7};
      
      GradeBook myGradeBook = new GradeBook(
         "CS101 Introduction to Java Programming", gradesArray);
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      myGradeBook.processGrades();
   } 
} // end class GradeBookTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
