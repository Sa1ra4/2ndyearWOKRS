package midterms_OOP_DSA_august7;

public class FoodTypes {
    public static void main(String[] args){
        Foods FoodTypes = new Foods();

    String[] category = {"Pagkaing-dagat", "Karne","Gulay","Prutas","Butil","Inumin"};

    String[][] foodTypes = {
        {"Isda","Hipon","Alimango","Pusit","Tahong"},                    //Pagkaing-dagat
        {"Baboy","Kamibing", "Baka", "Manok","Pato"},                    //Karne
        {"Talong","Kamatis", "Kalabasa", "Patola", "Ampalaya"},          //Gulay
        {"Saging","Mansanas","Mangga","Pakwan","Pinya"},                 //Prutas
        {"Mais","Palay","Bawang","Sibuyas","Linga"},                     //Butil
        {"Gatas","Tubig","Yogurt","Juice","Softdrinks"}                  //Inumin
    };

        FoodTypes.setcategory(category);
        FoodTypes.setfoodTypes(foodTypes);

        FoodTypes.displayFoods();
    }
    
}
