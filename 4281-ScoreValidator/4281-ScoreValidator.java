// Last updated: 6/7/2026, 6:28:49 PM
class Solution {
    public int[] scoreValidator(String[] events) {
        int n = events.length;
        int score = 0;
        int counter = 0;
        
        int i = 0;
        while(i<n && counter<10){
            if(events[i].equals("0")){
                score += 0;
            }
            else if(events[i].equals("1")){
                score += 1;
            }
            else if(events[i].equals("2")){
                score += 2;
            }
            else if(events[i].equals("3")){
                score += 3;
            }
            else if(events[i].equals("4")){
                score += 4;
            }
            else if(events[i].equals("6")){
                score += 6;
            }
            else if(events[i].equals("W")){
                counter++;
            }
            else if(events[i].equals("WD")){
                score += 1;
            }
            else if(events[i].equals("NB")){
                score += 1;
            }

            i++;
        }

        int[] ans = new int[2];
        ans[0] = score;
        ans[1] = counter;

        return ans;
    }
}