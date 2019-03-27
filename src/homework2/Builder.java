package homework2;

public class Builder {
    public static void main(String[] args){

        Human student1 = new Human.HumanBuilder()
                .withName("Andrey")
                .withSurname("Pacan")
                .withAge(22)
                .withHeight(175)
                .withWeight(75)
                .build();

        Human student2 = new Human.HumanBuilder()
                .withName("Karina")
                .withSurname("Avakova")
                .withAge(20)
                .withHeight(160)
                .withWeight(47)
                .build();

        System.out.println(student1);
        System.out.println(student2);
    }
}