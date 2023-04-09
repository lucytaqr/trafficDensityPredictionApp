public class hitung extends input{ //inheritance
    private double problarge; //enkapsulasi
    private double probmed;
    private double probsmall;
    private double smallScatterd, smallOvercast, smallClear, smallFew, smallBroken, smallLight, smallIntensity,
            smallMist, smallProximity, smallHaze, smallFog;
    private double medScatterd, medOvercast, medClear, medFew, medBroken, medLight, medIntensity,
            medMist, medProximity, medHaze, medFog;
    private double largeScatterd, largeOvercast, largeClear, largeFew, largeBroken, largeLight, largeIntensity,
            largeMist, largeProximity, largeHaze, largeFog;

    public hitung(){
        double totaldata = gettraffic_volume().length;
        for (int i = 0; i<totaldata; i++){
            int traffic_volume = gettraffic_volume()[i];
            String weather_desc = getweather_desc()[i];
            if (traffic_volume <= 2500){
                probsmall++;
                if (weather_desc == "scattered clouds"){
                    smallScatterd++;
                }
                else if(weather_desc == "overcast clouds"){
                    smallOvercast++;
                }
                else if(weather_desc == "sky is clear"){
                    smallClear++;
                }
                else if(weather_desc == "few clouds"){
                    smallFew++;
                }
                else if(weather_desc == "broken clouds"){
                    smallBroken++;
                }
                else if(weather_desc == "light rain"){
                    smallLight++;
                }
                else if(weather_desc == "light intensity drizzle"){
                    smallIntensity++;
                }
                else if(weather_desc == "mist"){
                    smallMist++;
                }
                else if(weather_desc == "proximity shower rain"){
                    smallProximity++;
                }
                else if(weather_desc == "haze"){
                    smallHaze++;
                }
                else if(weather_desc == "fog"){
                    smallFog++;
                }
            }

            if (traffic_volume >= 2501 && traffic_volume <= 5000){
                probmed++;
                if (weather_desc == "scattered clouds"){
                    medScatterd++;
                }
                else if(weather_desc == "overcast clouds"){
                    medOvercast++;
                }
                else if(weather_desc == "sky is clear"){
                    medClear++;
                }
                else if(weather_desc == "few clouds"){
                    medFew++;
                }
                else if(weather_desc == "broken clouds"){
                    medBroken++;
                }
                else if(weather_desc == "light rain"){
                    medLight++;
                }
                else if(weather_desc == "light intensity drizzle"){
                    medIntensity++;
                }
                else if(weather_desc == "mist"){
                    medMist++;
                }
                else if(weather_desc == "proximity shower rain"){
                    medProximity++;
                }
                else if(weather_desc == "haze"){
                    medHaze++;
                }
                else if(weather_desc == "fog"){
                    medFog++;
                }
            }
            if (traffic_volume >= 5001 && traffic_volume <= 7500){
                problarge++;
                if (weather_desc == "scattered clouds"){
                    largeScatterd++;
                }
                else if(weather_desc == "overcast clouds"){
                    largeOvercast++;
                }
                else if(weather_desc == "sky is clear"){
                    largeClear++;
                }
                else if(weather_desc == "few clouds"){
                    largeFew++;
                }
                else if(weather_desc == "broken clouds"){
                    largeBroken++;
                }
                else if(weather_desc == "light rain"){
                    largeLight++;
                }
                else if(weather_desc == "light intensity drizzle"){
                    largeIntensity++;
                }
                else if(weather_desc == "mist"){
                    largeMist++;
                }
                else if(weather_desc == "proximity shower rain"){
                    largeProximity++;
                }
                else if(weather_desc == "haze"){
                    largeHaze++;
                }
                else if(weather_desc == "fog"){
                    largeFog++;
                }

            }

        }
        probsmall /= (double) totaldata;
        smallScatterd /= (double) totaldata;
        smallOvercast /= (double) totaldata;
        smallClear /= (double) totaldata;
        smallFew /= (double) totaldata;
        smallLight /= (double) totaldata;
        smallIntensity /= (double) totaldata;
        smallMist/= (double) totaldata;
        smallProximity /= (double) totaldata;
        smallBroken /= (double) totaldata;
        smallFog /= (double) totaldata;
        smallHaze /= (double) totaldata;

        probmed /= (double) totaldata;
        medScatterd /= (double) totaldata;
        medOvercast /= (double) totaldata;
        medClear /= (double) totaldata;
        medFew /= (double) totaldata;
        medLight /= (double) totaldata;
        medIntensity /= (double) totaldata;
        medMist/= (double) totaldata;
        medProximity /= (double) totaldata;
        medBroken /= (double) totaldata;
        medFog /= (double) totaldata;
        medHaze /= (double) totaldata;

        problarge /= (double) totaldata;
        largeScatterd /= (double) totaldata;
        largeOvercast /= (double) totaldata;
        largeClear /= (double) totaldata;
        largeFew /= (double) totaldata;
        largeLight /= (double) totaldata;
        largeIntensity /= (double) totaldata;
        largeMist/= (double) totaldata;
        largeProximity /= (double) totaldata;
        largeBroken /= (double) totaldata;
        largeFog /= (double) totaldata;
        largeHaze /= (double) totaldata;
                
    }
    public double getsmallOvercast(){
        return smallOvercast;
    }
    public double getsmallScatterd(){
        return smallScatterd;
    }
    public double getsmallClear(){
        return smallClear;
    }
    public double getsmallFew(){
        return smallFew;
    }
    public double getsmallBroken(){
        return smallBroken;
    }
    public double getsmallLight(){
        return smallLight;
    }
    public double getsmallIntensity(){
        return smallIntensity;
    }
    public double getsmallMist(){
        return smallMist;
    }
    public double getsmallProximity(){
        return smallProximity;
    }
    public double getsmallHaze(){
        return smallHaze;
    }
    public double getsmallFog(){
        return smallFog;
    }

    public double getmedOvercast(){
        return medOvercast;
    }
    public double getmedScatterd(){
        return medScatterd;
    }
    public double getmedClear(){
        return medClear;
    }
    public double getmedFew(){
        return medFew;
    }
    public double getmedBroken(){
        return medBroken;
    }
    public double getmedLight(){
        return medLight;
    }
    public double getmedIntensity(){
        return medIntensity;
    }
    public double getmedMist(){
        return medMist;
    }
    public double getmedProximity(){
        return medProximity;
    }
    public double getmedHaze(){
        return medHaze;
    }
    public double getmedFog(){
        return medFog;
    }
    
    public double getlargeOvercast(){
        return largeOvercast;
    }
    public double getlargeScatterd(){
        return largeScatterd;
    }
    public double getlargeClear(){
        return largeClear;
    }
    public double getlargeFew(){
        return largeFew;
    }
    public double getlargeBroken(){
        return largeBroken;
    }
    public double getlargeLight(){
        return largeLight;
    }
    public double getlargeIntensity(){
        return largeIntensity;
    }
    public double getlargeMist(){
        return largeMist;
    }
    public double getlargeProximity(){
        return largeProximity;
    }
    public double getlargeHaze(){
        return largeHaze;
    }
    public double getlargeFog(){
        return largeFog;
    }

    public double getsmallprob(){
        return probsmall;
    }
    public double getmedprob(){
        return probmed;
    }
    public double getlargeprob(){
        return problarge;
    }

    public void hasil(){ //
        System.out.println("small probability : " + probsmall);
        System.out.println("medium probability : " + probmed);
        System.out.println("large probability : " + problarge);

    }
    
}
