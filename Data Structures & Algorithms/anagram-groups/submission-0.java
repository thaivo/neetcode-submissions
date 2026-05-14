class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length < 2){
            return List.of(List.of(strs[0]));
        }

        ArrayList<String> dynamicArray = new ArrayList<>(Arrays.asList(strs));
        List<List<String>> nestedList = new ArrayList<>();
        for(int i = 0; i < dynamicArray.size(); i++){
            List<String> row1 = new ArrayList<>();
            row1.add(dynamicArray.get(i));
            for(int j = i + 1; j < dynamicArray.size();){
                if(dynamicArray.get(i).length() == dynamicArray.get(j).length()){
                    char[] arr1 = dynamicArray.get(i).toCharArray();
                    char[] arr2 = dynamicArray.get(j).toCharArray();

                    Arrays.sort(arr1);
                    Arrays.sort(arr2);

                    String sorted1 = new String(arr1);
                    String sorted2 = new String(arr2);
                    if(sorted1.equals(sorted2)){
                        row1.add(dynamicArray.get(j));
                        dynamicArray.remove(j);
                    } else {
                        j++;
                    }
                } else {
                    j++;
                }
            }
            nestedList.add(row1);
        }
        return nestedList;
    }
}
