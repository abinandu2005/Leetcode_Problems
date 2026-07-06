class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,count=0;
        int a[]=new int[2];
        for(int i=0;i<events.length;i++){
            if(Character.isDigit(events[i].charAt(0))){
                score+=Integer.parseInt(events[i]);
            }
            else if(events[i].equals("NB") || events[i].equals("WD"))score++;
            else if(events[i].equals("W")){
                if(count<10)count++;
                if (count == 10) {
                    a[1] = count;   // or a[1] = 10;
                    a[0] = score;
                    return a;
                }
            }
            
            a[1]=count;
        }
        a[0]=score;
        
        return a;


    }
}