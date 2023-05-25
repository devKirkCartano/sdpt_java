package inheritance;

public class Kid extends Toddler{
    int gradeLevel;

    Kid() {

    }

    Kid(String name, String sex, int age, String favoriteGame, int gradeLevel){
        super(name, sex, age, favoriteGame);
        this.gradeLevel = gradeLevel;
    }

    void sayGradeLevel(){
        System.out.println("Grade Level: " + gradeLevel);
    }
}
