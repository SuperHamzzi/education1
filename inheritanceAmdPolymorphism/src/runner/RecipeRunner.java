package runner;

public class RecipeRunner {

	public static void main(String[] args) {
		
		Recipe1 recipe = new Recipe1();
		recipe.excute();
		System.out.println();
		RecipeWithMicrowave micro = new RecipeWithMicrowave();
		micro.excute();
	}

}
