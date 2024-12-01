class minadd{
    public static int minAddToMakeValid(String s){
        if(s.isEmpty()){
            return 0;
        }
        int count = 0;
        int count1 = 0;
        for (char ch : s.toCharArray()) {
            if(ch == '('){
                count ++;
            }
            else{
                if(ch == ')'){
                    if(count > 0){
                        count--;
                    }
                    else{
                        count1++;
                    }
                }
            }   
        }
            return count + count1;
    }
    public static void main(String[] args) {
        String  s = "())";
        System.out.println(minAddToMakeValid(s));
    }
}