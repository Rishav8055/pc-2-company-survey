package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData) {
        String result = "";
        double sum = 0;
        double avg = 0;

        try {
            for (int i = 0; i < ageRawData.length; i++) {
                sum += (Integer.parseInt(ageRawData[i]));
                avg = sum / ageRawData.length;
                result = String.valueOf(avg);
            }
            //Write the logic
            //Handle specific exception
        } catch (Exception exception) {
            return exception.toString();
        }
        return result;
    }


}
