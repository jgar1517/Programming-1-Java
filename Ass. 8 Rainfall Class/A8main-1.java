/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a8main;

/**
 *
 * @author jonathangarcia
 */
public class A8main {
    double [ ] rainfallAmount;

    public double getRainfallTotal () {
        double rainfallTotal = 0;
        
        for(int index = 0; index < rainfallAmount.length; index++){
            rainfallTotal = rainfallTotal + rainfallAmount [index];
        }
        return rainfallTotal;

}
    public double getRainfallAverage() {
        return getRainfallTotal() / rainfallAmount.length;
}

    public int getMostRainMonth() {
        double mostRain = rainfallAmount[0];
        int mostRainMonth = 1;

        for(int index = 0; index < rainfallAmount.length; index++){
            if ( rainfallAmount[index] > mostRain) {
                mostRain = rainfallAmount[index];
                mostRainMonth = index + 1;
    }
}
        return mostRainMonth;
}   

 public int getLeastRainMonth() {
        double leastRain = rainfallAmount[0];
        int leastRainMonth = 1;

        for(int index = 0; index < rainfallAmount.length; index++){
            if (rainfallAmount[index] < leastRain) {
                leastRain = rainfallAmount[index];
                 leastRainMonth = index + 1;
            }
        }
        return leastRainMonth;
}

    public A8main(double [ ] rainfallAmountGiven) {
        rainfallAmount = new double [rainfallAmountGiven.length];
        
        for(int index = 0; index < rainfallAmountGiven.length; index++) {
            rainfallAmount[index] = rainfallAmountGiven[index];
        }
    }
}