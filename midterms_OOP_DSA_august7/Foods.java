package midterms_OOP_DSA_august7;

public class Foods{
    private String[] category;
    private String[][] foodTypes;

    public  void setcategory(String[] category) {
        this.category = category;
    }
    public void setfoodTypes(String[][] foodTypes) {
        this.foodTypes = foodTypes;
    }
    public String[] getcategory() {
        return category;
    }
    public String[][] getfoodTypes() {
        return foodTypes;
    }

    public void displayFoods() {
        System.out.println("*************************************************");
        System.out.println("      Food Category and Types Report:            ");   
        System.out.println("*************************************************");

        for (int i = 0; i < category.length; i++){
            System.out.println("Category: " + category[i]);
            System.out.println("Food Types:");
        
         for (int j = 0; j < foodTypes[i].length; j++) {
                System.out.println(foodTypes[i][j]);

        if (j > foodTypes[i].length - 1) {
            System.out.print(",");
          }
         }
      System.out.println(); //move to the next line 
      System.out.println("-------------------------------------------------");
        }
        System.out.println("*************************************************");
       }
      }
    
        
        