package homework_nr_16;

public class People {
    private String name;
    private int age;
    private float grade;
    public People(String line){
        String[] people = line.split(",");
        name = people[0];
        age = Integer.parseInt(people[1]);
        grade = Float.parseFloat(people[2]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}' + "\n";
    }
}
