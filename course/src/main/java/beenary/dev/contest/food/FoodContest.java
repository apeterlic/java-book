package beenary.dev.contest.food;

public class FoodContest {

    public static void main(String[] args) {

        int finalGrade = 10;

        Dish dish = new Dish(40);

try {
    dish.prepare();
    dish.grade(true, false);
}
catch (OvercookedException e) {
    finalGrade = finalGrade - 2;
}
catch (MissingIngredientException e) {
    finalGrade = finalGrade - 1;
}
catch (MissingSeasoningException e) {
    finalGrade = finalGrade - 5;
}


finally {
            System.out.println("Final grade is: " + finalGrade);
        }

    }
}
