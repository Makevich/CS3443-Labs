import java.util.Arrays;
/**
 * @author Dusan Makevic
 */
public class Grades {

		private String name;
		private int[] grades;
	   
		public Grades(String name, int[] gradesArray) {
			this.name = name;
			grades = gradesArray;
		}
	   
	   public Grades(String name){
	      this.name = name;
		}
		
	   public String getName(){
	      return name;
	   }
	   
	   public int length(){
	      return grades.length;
	   }
	   
	   public int minimum() { 
			int lowGrade = grades[0];
			for (int index = 0; index < grades.length; index++) {
				int grade = grades[index];
				if (grade < lowGrade)
					lowGrade = grade;
			}
			return lowGrade;
		}

	   public int maximum(){
	      int maxGrade = grades[0];
	      for (int index = 0; index < grades.length; index++){
	         int grade = grades[index];
	         if (grade > maxGrade)
	            maxGrade = grade;
	      }
	      return maxGrade;
	   }
	   
	      public double average(){      
			int total = 0;
	      
			int index = 0;
			while (index < grades.length) {
				int grade = grades[index];
				total += grade;
				index++;
			}

			return (double) total / grades.length;
		}
	      public String toString(){
	          return name + " " + Arrays.toString(grades);
	       }

	      
}
