package homework2;

public class Task2_1 {
    public static void main(String[] args){

        Human student1 = new Student.Builder()
                .withName("Andrey")
                .withSurname("Pacan")
                .withAge(22)
                .withHeight(175)
                .withWeight(75)
                .build();

        Human student2 = new Student.Builder()
                .withName("Karina")
                .withSurname("Avakova")
                .build();
        System.out.println(student1);
    }
}

class Human {

    String name;
    String surname;
    int age;
    int height;
    int weight;

    static class Builder {
        private Human newHuman;

        public Builder(){
            newHuman = new Human();
        }
        public Builder withName(String name){
            newHuman.name=name;
            return this;
        }
        public Builder withSurname(String surname){
            newHuman.surname = surname;
            return this;
        }
        public Builder withAge(int age){
            newHuman.age = age;
            return this;
        }
        public Builder withHeight(int height){
            newHuman.height = height;
            return this;
        }
        public Builder withWeight(int weight){
            newHuman.weight = weight;
            return this;
        }
        public Human build(){
            return newHuman;
        }
    }
    @Override
    public String toString() {
        return "{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

class Student extends Human {}