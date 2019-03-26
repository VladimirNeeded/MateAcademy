package homework1;

public class MethodsObjeckt {
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

