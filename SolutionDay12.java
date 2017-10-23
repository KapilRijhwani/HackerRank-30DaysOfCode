class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
        Student(String firstName, String lastName, int id, int[] scores){
            super(firstName, lastName, id);
            this.testScores = scores;
        }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int total, avg, count;
        char grade='T';
        total = avg = count = 0;
        for(int score : testScores){
            total += score;
            count++;
        }
        avg = Math.round(total/count);
        if(avg <=100 && avg >=90){
            grade = 'O';
        }
        else if(avg < 90 && avg >= 80){
            grade = 'E';
        }
        else if(avg < 80 && avg >= 70){
            grade = 'A';
        }
        else if(avg < 70 && avg >= 55){
            grade = 'P';
        }
        else if(avg < 55 && avg >= 40){
            grade = 'D';
        }
        else if(avg < 40){
            grade = 'T';
        }
        return grade;
    }
}