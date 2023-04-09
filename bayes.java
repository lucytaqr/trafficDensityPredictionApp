public class bayes extends hitung{ //inheritance
    private String weather_desc;
    private double bayessmall;
    private double bayesmed;
    private double bayeslarge;
    private double pembagi;

    public bayes(){
        pembagi = getsmallprob() * getsmallScatterd() + getsmallprob() * getsmallOvercast()
                + getsmallprob() * getsmallClear() + getsmallprob() * getsmallFew() + getsmallprob() * getsmallBroken()
                + getsmallprob() * getsmallLight() + getsmallprob() * getsmallIntensity()
                + getsmallprob() * getsmallMist() + getsmallprob() * getsmallProximity()
                + getsmallprob() * getsmallHaze() + getsmallprob() * getsmallFog() 
                + getmedprob() * getmedScatterd() + getmedprob() * getmedOvercast()
                + getmedprob() * getmedClear() + getmedprob() * getmedFew() + getmedprob() * getmedBroken()
                + getmedprob() * getmedLight() + getmedprob() * getmedIntensity()
                + getmedprob() * getmedMist() + getmedprob() * getmedProximity()
                + getmedprob() * getmedHaze() + getmedprob() * getmedFog() 
                + getlargeprob() * getlargeScatterd() + getlargeprob() * getlargeOvercast()
                + getlargeprob() * getlargeClear() + getlargeprob() * getlargeFew() + getlargeprob() * getlargeBroken()
                + getlargeprob() * getlargeLight() + getlargeprob() * getlargeIntensity()
                + getlargeprob() * getlargeMist() + getlargeprob() * getlargeProximity()
                + getlargeprob() * getlargeHaze() + getlargeprob() * getlargeFog();
    }

    public void setweather_desc(String weather_desc){
        this.weather_desc = weather_desc;
    }
    public void klasifikasi(){
        try {
            if (weather_desc == "scattered clouds"){
                bayessmall = getsmallprob()*getsmallScatterd()/pembagi;
                bayesmed = getmedprob()*getmedScatterd()/pembagi;
                bayeslarge = getlargeprob()*getlargeScatterd()/pembagi;
            }
            else if (weather_desc == "overcast clouds"){
                bayessmall = getsmallprob()*getsmallOvercast()/pembagi;
                bayesmed = getmedprob()*getmedOvercast()/pembagi;
                bayeslarge = getlargeprob()*getlargeOvercast()/pembagi;
            }
            else if (weather_desc == "sky is clear"){
                bayessmall = getsmallprob()*getsmallClear()/pembagi;
                bayesmed = getmedprob()*getmedClear()/pembagi;
                bayeslarge = getlargeprob()*getlargeClear()/pembagi;
            }
            else if (weather_desc == "few clouds"){
                bayessmall = getsmallprob()*getsmallFew()/pembagi;
                bayesmed = getmedprob()*getmedFew()/pembagi;
                bayeslarge = getlargeprob()*getlargeFew()/pembagi;
            }
            else if (weather_desc == "broken clouds"){
                bayessmall = getsmallprob()*getsmallBroken()/pembagi;
                bayesmed = getmedprob()*getmedBroken()/pembagi;
                bayeslarge = getlargeprob()*getlargeBroken()/pembagi;
            }
            else if (weather_desc == "light rain"){
                bayessmall = getsmallprob()*getsmallLight()/pembagi;
                bayesmed = getmedprob()*getmedLight()/pembagi;
                bayeslarge = getlargeprob()*getlargeLight()/pembagi;
            }
            else if (weather_desc == "light intensity drizzle"){
                bayessmall = getsmallprob()*getsmallIntensity()/pembagi;
                bayesmed = getmedprob()*getmedIntensity()/pembagi;
                bayeslarge = getlargeprob()*getlargeIntensity()/pembagi;
            }
            else if (weather_desc == "mist"){
                bayessmall = getsmallprob()*getsmallMist()/pembagi;
                bayesmed = getmedprob()*getmedMist()/pembagi;
                bayeslarge = getlargeprob()*getlargeMist()/pembagi;
            }
            else if (weather_desc == "proximity shower rain"){
                bayessmall = getsmallprob()*getsmallProximity()/pembagi;
                bayesmed = getmedprob()*getmedProximity()/pembagi;
                bayeslarge = getlargeprob()*getlargeProximity()/pembagi;
            }
            else if (weather_desc == "haze"){
                bayessmall = getsmallprob()*getsmallHaze()/pembagi;
                bayesmed = getmedprob()*getmedHaze()/pembagi;
                bayeslarge = getlargeprob()*getlargeHaze()/pembagi;
            }
            else if (weather_desc == "fog"){
                bayessmall = getsmallprob()*getsmallFog()/pembagi;
                bayesmed = getmedprob()*getmedFog()/pembagi;
                bayeslarge = getlargeprob()*getlargeFog()/pembagi;
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error pada bagian klasifikasi");
        }
            
    } 
    
    public String hasill(){ 
        System.out.println("weather desc : " + weather_desc);
        System.out.println(bayessmall);
        System.out.println(bayesmed);
        System.out.println(bayeslarge);
        double hasilprediksi = Math.max(bayessmall, Math.max (bayesmed, bayeslarge));
        if(hasilprediksi == bayessmall){
            return "SMALL";
        }
        else if(hasilprediksi == bayesmed){
            return "MEDIUM";
        }
        else if(hasilprediksi == bayeslarge){
            return "LARGE";
        }
        return "";
    }

    public double getbayeslarge(){
        return bayeslarge;
    }
    public double getbayesmed(){
        return bayesmed;
    }
    public double getbayessmall(){
        return bayessmall;
    }

    
}
