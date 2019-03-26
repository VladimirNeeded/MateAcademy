package homework1;

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