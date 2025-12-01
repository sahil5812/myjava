public class TwoD_arrays {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        //                    Useful for storing a matrix of data




/*        String[] vegetable = {"potato","onion","carrot"};
        String[] fruits =  {"orange","mango","pineapple"};
        String[] meats = {"Gosh","Beef","chicken"};

        String[][] groceries = {vegetable,fruits,meats};

 */
        String[][] groceries = {{"potato","onion","carrot"},
                                {"orange","mango","pineapple"},
                                {"Gosh","Beef","chicken"},
        };
        groceries[2][1] = "egg";//change the matrix
        for (String[] foods : groceries){
            for (String food:foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
