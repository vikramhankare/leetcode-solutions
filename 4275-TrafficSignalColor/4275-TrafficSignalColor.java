// Last updated: 6/7/2026, 6:28:53 PM
class Solution {
    public String trafficSignal(int timer) {
        if(timer == 0)
            return "Green";
        else if(timer == 30)
            return "Orange";
        else if(timer > 30 && timer <= 90)
            return "Red";
        else
            return "Invalid";
    }
}