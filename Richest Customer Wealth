class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        // Loop through each customer
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            
            // Sum up all bank accounts for this customer
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            
            // Update max wealth if current customer is richer
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        
        return maxWealth;
    }
}
