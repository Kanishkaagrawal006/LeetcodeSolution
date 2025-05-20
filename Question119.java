 public class Question119 {
    public List<Integer> getRow(int rowIndex) {
         if(rowIndex == 0){
            return Arrays.asList(1);
        }
        List<Integer> prevrow = getRow(rowIndex - 1);
        List<Integer> currentrw = new ArrayList<>();
        currentrw.add(1);
        for(int i =1;i<prevrow.size();i++){
            int curr = prevrow.get(i-1 )+prevrow.get(i);
            currentrw.add(curr);
        }
        currentrw.add(1);
        return currentrw;
    }
}
