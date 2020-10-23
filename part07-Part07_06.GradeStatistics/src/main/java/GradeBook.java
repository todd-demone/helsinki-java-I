import java.util.ArrayList;

public class GradeBook {
    private ArrayList<Integer> scores;
    private ArrayList<Integer> grades;
    
    public GradeBook() {
        this.scores = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addScore(int score) {
        this.scores.add(score);
        this.addGrade(score);
    }
    
    public void addGrade(int score) {
        int grade = scoreToGrade(score);
        this.grades.add(grade);
    }
    
    public double getAverage() {
        int total = 0;
        int index = 0;
        while (index < this.scores.size()) {
            total += this.scores.get(index);
            index++;
        }
        return 1.0 * total / scores.size();
    }
    
    public double getPassingAverage() {
        int total = 0;
        int index = 0;
        int count = 0;
        while (index < scores.size()) {
            if (scores.get(index) >= 50) {
                total += scores.get(index);
                count++;
            }
            index++;
        }
        if (count == 0) {
            return -1;
        }
        return 1.0 * total / count;
    }
    
    public double getPassingPercentage() {
        int index = 0;
        int passing = 0;
        while (index < scores.size()) {
            if (scores.get(index) >= 50) {
                passing += 1;
            }
            index++;
        }
        if (passing == 0) {
            return 0.0;
        }
        return 100.0 * passing / grades.size();
    }
    
    public int scoreToGrade(int score) {
        int grade = 0;
        if (score < 50) {
            grade = 0;
        } else if (score < 60) {
            grade = 1;
        } else if (score < 70) {
            grade = 2;
        } else if (score < 80) {
            grade = 3;
        } else if (score < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    
    // returns number of grades in a particular range. e.g., 5 people get a "3" grade (between 80 and 89) then numberOfGrades(3) will return 5
    public int numberOfGrades(int gradeToBeChecked) {
        int count = 0;
        for (int grade: this.grades) {
            if (grade == gradeToBeChecked) {
                count += 1;
            }
        }
        return count;
    }
    
    public String toString() {
        String returnStr = "";
        for (int score: scores) {
            returnStr += score + ", ";
        }
        returnStr += "\n";
        for (int grade: grades) {
            returnStr += grade + ", ";
        }
        return returnStr;
    }

}
