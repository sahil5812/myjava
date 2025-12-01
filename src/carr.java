
    public class carr {
        public static void main(String[] args){
            carr1 car1 = new carr1("Mustang","Red");
            carr1 car2= new carr1("Suzuki","Blue");
            carr1 car3 = new carr1("BMW","White");

            carr1[] car={car1,car2,car3};
            for(carr1 cars : car){
                cars.drive();
            }

        }
    }


