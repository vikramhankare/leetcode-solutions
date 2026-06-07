// Last updated: 6/7/2026, 6:29:18 PM
class Solution {
    public int minGenerations(int[][] points, int[] target) {
        ArrayList<ArrayList<Integer>> pointsList = new ArrayList<>();
        HashSet<ArrayList<Integer>> pointsSet = new HashSet<>();
        int n = points.length;

        for(int i = 0; i<n; i++){
            ArrayList<Integer> point = new ArrayList<>();
            point.add(points[i][0]);
            point.add(points[i][1]);
            point.add(points[i][2]);
            
            pointsList.add(point);
            pointsSet.add(point);
        }

        ArrayList<Integer> targetPoint = new ArrayList<>();
        targetPoint.add(target[0]);
        targetPoint.add(target[1]);
        targetPoint.add(target[2]);

        int k = 0;
        if(pointsSet.contains(targetPoint) == true)
            return k;

        ArrayList<ArrayList<Integer>> currentGen = new ArrayList<>(pointsList);        

        while(currentGen.size() > 0){

            ArrayList<ArrayList<Integer>> newGen = new ArrayList<>();
            
            int size = pointsList.size();
            
            for(int i = 0; i<currentGen.size(); i++){
                for(int j = 0; j<size; j++){
                    
                    ArrayList<Integer> point1 = currentGen.get(i);
                    ArrayList<Integer> point2 = pointsList.get(j);

                    if(point1.equals(point2))
                        continue;
                    
                    ArrayList<Integer> point3 = new ArrayList<>();
                    point3.add((point1.get(0)+point2.get(0))/2);
                    point3.add((point1.get(1)+point2.get(1))/2);
                    point3.add((point1.get(2)+point2.get(2))/2);

                    if(pointsSet.contains(point3) == false){
                        newGen.add(point3);
                        pointsSet.add(point3);

                        if(point3.equals(targetPoint))
                            return k+1;
                    }

                    
                }
            }

            pointsList.addAll(newGen);

            currentGen = newGen;

            k++;
        }

        return -1;
    }
}