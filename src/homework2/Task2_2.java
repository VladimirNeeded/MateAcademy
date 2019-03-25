package homework2;

public class Task2_2 {

    public static void main(String[] args){

        Country ukraine = new Country("Ukraine", "Kyiv", 45000000);


        double perPop = ((double)ukraine.odessa.population/(double)ukraine.population)*100; // Какой процент населения страны проживает в Одессе?
        System.out.println(perPop);

        System.out.println(ukraine.odessa.changeCountry());
        System.out.println(ukraine.krym.changeCountry());

        Country.President vova = new Country.President();
        System.out.println(vova.getInfo());


    }
       static class Country{

        String name;
        String capital;
        Integer population;

        public Country(String name, String capital, Integer population) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        }
           static class President extends Human {
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
           class Сity{                                                    //внутренний класс
                String country;
                String name;
                Integer population;

            public Сity(String country, String name, Integer population) {
                this.country = country;
                this.name = name;
                this.population = population;
            }

             public String changeCountry() {
                return this.country;
             }
        }
           Сity odessa = new Сity("Ukraine","Odessa", 990000);

           Сity krym = new Country.Сity("Ukraine", "Krym", 2000000) {        // анонимный класс
               public String changeCountry(){
                   this.country = "Russia";
                   return this.country;
               }
           };

    }


}
