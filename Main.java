public class Main {
 public void executeGradeReport(double score) {
  if (!validateScore(score)) {
   System.out.println("Invalid Score");
   return;
  }
  //stop execution
  char grade = calculateLetterGrade(score);
  display PerformanceMessage (grade);
 }
}

