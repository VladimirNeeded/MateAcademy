package homework2;

public class State {

    public static void main(String[] args){
        State.Country ukraine = new State.Country("Ukraine", "Kyiv", 45000000);

        // Какой процент населения страны проживает в Одессе?
        double perPop = ((double) ukraine.odessa.population / (double) ukraine.population) * 100;

        System.out.println(perPop);
        System.out.println(ukraine.odessa.changeCountry());
        System.out.println(ukraine.crimea.changeCountry());

        Country.President vova = new Country.President();
        System.out.println(vova.getInfo());
    }
        protected static class Country {
        private String name;
        private String capital;
        private Integer population;

        public Country(String name, String capital, Integer population) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        }
           private static class President extends Human {
            String address;

            public String getInfo(){
                class Info{                                     //локальный класс
                    private String street = "Presidentska";
                    private int house = 666;
                    private String number = "0933062466";
                }
                Info info = new Info();
                return info.street +" "+ info.house + " "+info.number;
            }
           }
           private class Сity {                                                    //внутренний класс
               protected String country;
               private String name;
               private Integer population;

            public Сity(String country, String name, Integer population) {
                this.country = country;
                this.name = name;
                this.population = population;
            }

             public String changeCountry() {
                return this.country;
             }
        }
           protected Сity odessa = new Сity("Ukraine","Odessa", 990000);

           protected Сity crimea = new Country.Сity("Ukraine", "crimea", 2000000) {        // анонимный класс
               public String changeCountry(){
                   this.country = "Russia";
                   return this.country;
               }
           };
    }
}