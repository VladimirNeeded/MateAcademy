package homework2;

 public class Human {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;

    protected static class HumanBuilder {
        private Human newHuman;

        public HumanBuilder(){

            newHuman = new Human();
        }
        public HumanBuilder withName(String name){
            newHuman.name = name;
            return this;
        }
        public HumanBuilder withSurname(String surname){
            newHuman.surname = surname;
            return this;
        }
        public HumanBuilder withAge(int age){
            newHuman.age = age;
            return this;
        }
        public HumanBuilder withHeight(int height){
            newHuman.height = height;
            return this;
        }
        public HumanBuilder withWeight(int weight){
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
                 "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
