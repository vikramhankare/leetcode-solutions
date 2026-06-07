// Last updated: 6/7/2026, 6:30:59 PM
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int n = commands.length;
        char direction = 'N';   
        int[][] position = new int[1][2];
        int ans = 0;

        for(int i =0; i<n; i++){
            if(commands[i] == -2)
                direction = turnLeft(direction);
            else if(commands[i] == -1)
                direction = turnRight(direction);
            else{
                int distance = commands[i];
                position = walk(position, direction, obstacles, distance);
                ans = Math.max(ans, (position[0][0]*position[0][0] + position[0][1]*position[0][1]));
            }
        }

        return ans;
    }

    public char turnLeft(char direction){
        if(direction == 'N')
            direction = 'W';
        else if(direction == 'E')
            direction = 'N';
        else if(direction == 'S')
            direction = 'E';
        else if(direction == 'W')
            direction = 'S';

        return direction;
    }

    public char turnRight(char direction){
        if(direction == 'N')
            direction = 'E';
        else if(direction == 'W')
            direction = 'N';
        else if(direction == 'S')
            direction = 'W';
        else if(direction == 'E')
            direction = 'S';

        return direction;
    }

    public int[][] walk(int[][] position, char direction, int[][] obstacles, int distance){
        if(direction == 'N'){

            if(obstacles.length == 0){
                position[0][0] = position[0][0];
                position[0][1] = position[0][1]+distance;
                distance = 0;
            }

            while(distance > 0){
                int[][] futurePosition = new int[1][2];
                futurePosition[0][0] = position[0][0];
                futurePosition[0][1] = position[0][1]+1;

                if(notObstacle(futurePosition, obstacles)){
                    position[0][0] = position[0][0];
                    position[0][1] = position[0][1]+1;
                    distance--;
                }
                else
                    break;
            }
        }
        else if(direction == 'W'){
            if(obstacles.length == 0){
                position[0][0] = position[0][0]-distance;
                position[0][1] = position[0][1];
                distance = 0;
            }

            while(distance > 0){
                int[][] futurePosition = new int[1][2];
                futurePosition[0][0] = position[0][0]-1;
                futurePosition[0][1] = position[0][1];

                if(notObstacle(futurePosition, obstacles)){
                    position[0][0] = position[0][0]-1;
                    position[0][1] = position[0][1];
                    distance--;
                }
                else
                    break;
            }
        }
        else if(direction == 'S'){
            if(obstacles.length == 0){
                position[0][0] = position[0][0];
                position[0][1] = position[0][1]-distance;
                distance = 0;
            }

            while(distance > 0){
                int[][] futurePosition = new int[1][2];
                futurePosition[0][0] = position[0][0];
                futurePosition[0][1] = position[0][1]-1;

                if(notObstacle(futurePosition, obstacles)){
                    position[0][0] = position[0][0];
                    position[0][1] = position[0][1]-1;
                    distance--;
                }
                else
                    break;
            }
        }
        else if(direction == 'E'){
            if(obstacles.length == 0){
                position[0][0] = position[0][0]+distance;
                position[0][1] = position[0][1];
                distance = 0;
            }

            while(distance > 0){
                int[][] futurePosition = new int[1][2];
                futurePosition[0][0] = position[0][0]+1;
                futurePosition[0][1] = position[0][1];

                if(notObstacle(futurePosition, obstacles)){
                    position[0][0] = position[0][0]+1;
                    position[0][1] = position[0][1];
                    distance--;
                }
                else
                    break;
            }
        }

        return position;
    }

    public boolean notObstacle(int[][] futurePosition, int[][] obstacles){
        int n = obstacles.length;
        for(int i = 0; i<n; i++){
            if(futurePosition[0][0] == obstacles[i][0] && futurePosition[0][1] == obstacles[i][1])
                return false;
        }
        return true;
    }
}