public class Student {
    // class attributes
    private String name;
    private int age;
    private String course;
    private char grade;

    // class methods

    /*
     * It's the first constructor : It initializes attributes with default values
     * */
    public Student(){
        name = "None";
        age = 18;
        course = "None";
        grade = 'X';
    }

    /*
     * It's the second constructor : It initializes name and age  attributes with parameter values
     * */
    public Student(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    /*
     * It's the second constructor : It initializes all attributes with parameter values
     * */
    public Student(String name, int age, String course, char grade){
        this(name,age);
        this.course = course;
        this.grade= grade;
    }

    /*
     * Display student information
     * @param : empty
     * @returns: void
     * */
    public void displayStudentInfo(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nCourse: "+course+"\nGrade: "+grade);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }
    public String getCourse() {
        return course;
    }

    public static void main(String[] args){
        // creation car objet
        Student student = new Student("Abel",23,"JAVA",'A');

        // display information
        student.displayStudentInfo();
    }
}

