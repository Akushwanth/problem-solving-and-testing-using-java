class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;   // Start altitude is 0
        int currentAltitude = 0;
        
        // Traverse through the gain array
        for (int g : gain) {
            currentAltitude += g;          // Update altitude
            maxAltitude = Math.max(maxAltitude, currentAltitude); // Track highest altitude
        }
        
        return maxAltitude;
    }
}
