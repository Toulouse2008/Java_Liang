/** Listing 8.2 GradeExam  */

public class Listing82_GradeExam {
  public static void main(String[] args) {

    // Students' answer to the questions
    char[][] answers ={
      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

    // Key to the questions
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    int[] count = new int[answers.length];
    for (int i = 0; i < answers.length; i++) {
      for (int j = 0; j <answers[0].length; j++) {
        if (answers[i][j] == keys[j])
          count[i]++;
      }
    }
    for(int i = 0; i < count.length; i++)
      System.out.println("Student " + i + "'s correct count is " + count[i]);
  }
}
