class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        // HashMap<Character, Integer> count = new HashMap<>();
        int maxDur= releaseTimes[0];
        char maxDurKey= keysPressed.charAt(0);
        // count.put(keysPressed.charAt(0),releaseTimes[0]);
        for(int i=1;i<keysPressed.length();i++){
            // count.put(keysPressed.charAt(i),releaseTimes[i]-releaseTimes[i-1]);
            int duration = releaseTimes[i]-releaseTimes[i-1];
            char c = keysPressed.charAt(i);
            if(duration==maxDur){
                maxDurKey = maxDurKey> c ? maxDurKey :c ;
                continue;
            }
            if(duration>maxDur){
                maxDur = duration;
                maxDurKey = c;
            }
        }
        // Character res = Character.MIN_VALUE;
        // for (char key: count.keySet()) {
        //     if (res==Character.MIN_VALUE || count.get(key)==count.get(res)) {
        //         res= res> key? res: key;
        //         continue;
        //     }
        //     if(count.get(key)>count.get(res)){
        //          // count.get(res) = count.get(key);
        //         res = key;
        //     }
        //     }
        return maxDurKey;
        
        
        
    }
}