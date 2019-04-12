package homework1;

public class MethodsObjeckt {
    public static void main (String[] args) throws CloneNotSupportedException{

        Human pavlo = new Human("Pavlo", 20);
        Human igor = new Human("Igor", 20);
        Human clonedIgor = (Human)igor.clone(); //пример реализация clone

        System.out.println(pavlo);              //пример реализация toString
        System.out.println(pavlo.equals(igor)); //пример реализация equals
        System.out.println(pavlo.hashCode());   //пример реализация hashCode
        System.out.println(igor.hashCode());    //пример реализация hashCode
        System.out.println(igor.equals(igor));
    }
}

