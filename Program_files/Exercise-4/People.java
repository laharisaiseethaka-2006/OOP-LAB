class Person {

void introduce() {

System.out.println("I am a person.");

}

}

class Student extends Person {

void study() {

System.out.println("Students study hard.");

}

}

class Teacher extends Person {

void teach() {

System.out.println("Teachers teach with passion.");

}

}

public class People {

public static void main(String[] args) {

Student student = new Student();

student.introduce();

student.study();

Teacher teacher = new Teacher();

teacher.introduce();

teacher.teach();

}

}