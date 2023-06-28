class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans=new double[2];
        ans[1]=(celsius * 9/5)+32;
        ans[0]=celsius+273.15;
        return ans;
    }
}
