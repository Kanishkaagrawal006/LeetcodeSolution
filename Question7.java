public Question7 {
    public int reverse(int x) {
         int reversed  =0;
         int y =0;
        
        while(x!=0){
            int number = x%10;
             if (reversed<Integer.MIN_VALUE/10||reversed>Integer.MAX_VALUE/10){
                return 0;
                }
         reversed = reversed*10+ number ;
                x=x/10;
        
    }
    return  reversed;
    }
}
   
