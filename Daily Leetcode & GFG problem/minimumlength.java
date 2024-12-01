public class minimumlength {  
    public static int minLength(String s) {  
        StringBuilder sb = new StringBuilder();  

        for (int i = 0; i < s.length(); i++) {  
            if (sb.length() > 0 &&   
            ((sb.charAt(sb.length() - 1) == 'A' && s.charAt(i) == 'B') ||   
            (sb.charAt(sb.length() - 1) == 'C' && s.charAt(i) == 'D'))) {  
                sb.deleteCharAt(sb.length() - 1);  
            } else {  
                sb.append(s.charAt(i));  
            }  
        }  
        
        return sb.length(); 
    }  

    public static void main(String[] args) {  
        String s = "ABFCACDB";  
        System.out.println(minLength(s));   
    }  
}