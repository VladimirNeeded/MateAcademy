package homework1;

public class MethodsObjeckt {
    public static void main (String[] args) throws CloneNotSupportedException{

        Human Pavlo = new Human("Pavlo", 20);
        Human Igor = new Human("Igor", 20);
        Human igor = (Human)Igor.clone(); //пример реализация clone

        System.out.println(Pavlo);              //пример реализация toString
        System.out.println(Pavlo.equals(Igor)); //пример реализация equals
        System.out.println(Pavlo.hashCode());   //пример реализация hashCode
        System.out.println(Igor.hashCode());    //пример реализация hashCode
        System.out.println(Igor.equals(igor));
    }
}

