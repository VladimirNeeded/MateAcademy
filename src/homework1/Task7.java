package homework1;

public class Task7 {
    public static void main (String[] args) throws CloneNotSupportedException{

        Student Pavlo = new Student("Pavlo", 20);
        Student Igor = new Student("Igor", 20);
        Student igor = (Student)Igor.clone(); //пример реализация clone

        System.out.println(Pavlo);              //пример реализация toString
        System.out.println(Pavlo.equals(Igor)); //пример реализация equals
        System.out.println(Pavlo.hashCode());   //пример реализация hashCode
        System.out.println(Igor.hashCode());    //пример реализация hashCode
        System.out.println(Igor.equals(igor));
    }
}
    class Human implements Cloneable{
    int age;
    String name;

        @Override
        public Object clone() throws CloneNotSupportedException {     //переопределение clone
            return super.clone();
        }

        @Override
        public String toString(){     //реализация toString
            return "Name: " + name + "\n"+ "Age : " + age;
        }

        @Override
        public boolean equals (Object object){      //реализация equals (сравниваем объекты по возрасту)
            Human human = (Human) object;
            return this.age == ((Human)object).age;
        }

        @Override
        public int hashCode (){                     // переопределение hashCode
            return age;
        }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}
    class Student extends Human {

        public Student(String name, int age) {
            super(name, age);
        }
    }