public class MaxPopulationYear {
    public static void main(String[] args) {
        int[][] nums = {{1993,1999}, {2000,2010}};
        System.out.println(maximumPopulation(nums));
    }
    public static int maximumPopulation(int[][] logs){
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for(int j = logs[i][0]; j < logs[i][1]; j++){
                arr[j - 1950]++;
            }
        }
        int maxValue = 0;
        int maxYear = 1950;
        for(int i = 0; i < 100; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
                maxYear = i + 1950;
            };
        }
        return maxYear;
    }

}
