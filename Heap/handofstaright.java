import java.util.Arrays;
import java.util.HashMap;

public class handofstaright{
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize != 0) return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        for(int carde : hand){
            if(!map.containsKey(carde)) continue;
            int currentCard = carde;
            while(map.containsKey(currentCard-1)){
                currentCard--;
            }   
        for(int i =0 ;i<groupSize;i++){
            int card = currentCard+i;
            if(!map.containsKey(card)) return false;
                map.put(card,map.get(card)-1);
            if(map.get(card) == 0){
                 map.remove(card);
            }
            }
        }    
            return true;
    }
}
