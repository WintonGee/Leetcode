public class Q2079_WateringPlants {

    public int wateringPlants(int[] plants, int capacity) {
        int currentStep = 1, currentWater = capacity - plants[0], steps = 1;
        while (currentStep <= plants.length - 1) {
            // Refill -> currentStep * 2
            if (currentWater < plants[currentStep]) {
                steps += (currentStep * 2);
                currentWater = capacity;
            }

            currentWater -= plants[currentStep];
            currentStep++;
            steps++;
        }
        return steps;
    }

}
