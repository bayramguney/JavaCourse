package day12;

public class CarShopping {
    public static void main(String[] args) {
        String carBrand="Tesla";
        int budget=40000;
        int carPrice=40000;


        if(carBrand.equals("Tesla") || carBrand.equals("corolla") && carPrice<=budget){
            System.out.println("CAR ACQUIRED!!");
        }else{
            System.out.println("No buy this time");
        }

    }
}
