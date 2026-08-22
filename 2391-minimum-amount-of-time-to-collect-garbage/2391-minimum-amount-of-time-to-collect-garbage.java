class Solution {

    public int garbageCollection(String[] garbage, int[] travel) {

        int total = 0;

        int metalLast = 0;
        int paperLast = 0;
        int glassLast = 0;

        // Count garbage and find the last house
        for (int i = 0; i < garbage.length; i++) {

            String s = garbage[i];

            for (int j = 0; j < s.length(); j++) {

                total++;

                if (s.charAt(j) == 'M') {
                    metalLast = i;
                }

                if (s.charAt(j) == 'P') {
                    paperLast = i;
                }

                if (s.charAt(j) == 'G') {
                    glassLast = i;
                }
            }
        }

        // Add travel time for each truck
        for (int i = 0; i < metalLast; i++) {
            total += travel[i];
        }

        for (int i = 0; i < paperLast; i++) {
            total += travel[i];
        }

        for (int i = 0; i < glassLast; i++) {
            total += travel[i];
        }

        return total;
    }
}