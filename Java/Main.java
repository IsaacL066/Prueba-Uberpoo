class Main {
    public static void main(String [] args){
        System.out.println("Inicializando");
        System.out.println("car....");
        car car = new car("AMQ123",new Accont("Andres Luisa","ADN1235","andres@hotmail.com","12365"));
        car.passenger = 4;
        car.printDataCar();

        System.out.println("Uberx....");
        UberX uberx = new UberX ("MKL185", New Accont("Maria Loyola","JKL112657", "Maria@hotmail.com","12343","Toyota"),"Toyota","Corolla");

        
    }

    public static void main(String [] args){
        System.out.println("Inicializando");
        System.out.println("car....");
        car car = new car("AMQ123",new Accont("Armando ","ADN1235","Armando@hotmail.com","12365"));
        car.passenger = 4;
        car.printDataCar();

        System.out.println("Uberx....");
        UberX uberx = new UberX ("MKL185", New Accont("Maria Loyola","JKL112657", "Marisol@hotmail.com","12343","Toyota"),"Toyota","Corolla");

        
    }
}