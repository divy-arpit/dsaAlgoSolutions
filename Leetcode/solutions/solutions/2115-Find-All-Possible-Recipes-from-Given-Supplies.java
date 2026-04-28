//https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/description/?envType=daily-question&envId=2025-03-21
class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {

        HashSet<String> suppliesSet=new HashSet<>(supplies.length);
        Collections.addAll(suppliesSet, supplies);
        HashSet<String> cooked =new HashSet<>();
        ArrayList<String> recipeList=new ArrayList<>();
        Collections.addAll(recipeList,recipes);
        ArrayList<Integer> cookedThisTime;
        do{
            cookedThisTime=new ArrayList<>();
            for(int i=0;i< recipeList.size();i++){
                if(cooked.contains(recipeList.get(i))){
                    continue;
                }
                boolean cookable=Cookable(ingredients.get(i),suppliesSet);
                if (cookable){
//                    cooked.add(recipeList.get(i));
//                    suppliesSet.add(recipeList.get(i));
                    cookedThisTime.add(i);
                }
            }
            if(!cookedThisTime.isEmpty()){
                for(int i:cookedThisTime){
                    cooked.add(recipeList.get(i));
                    suppliesSet.add(recipeList.get(i));

//                    recipeList.remove(i);
//                    ingredients.remove(i);
                }
            }
        }while (!cookedThisTime.isEmpty());
        return new ArrayList<>(cooked);

    }
    private static boolean Cookable(List<String> ingredients,HashSet<String> supplies){
        return supplies.containsAll(ingredients);
    }
}