import Elements.*;

public class DiplomacyAI {
   public static void main(String[] args) {
      String half = "S";
      int year = 1;
      boolean start = true;
      
      String North_Atlantic = "water";
      String Norwegic_Sea = "water";
      String North_Sea = "water";
      String Gulf_of_Bothnia = "water";
      String Baltic_Sea = "water";
      String Skaggerak = "water";
      String Helgoland_Bight = "water";
      String English_Channel = "water";
      String Irish_Sea = "water";
      String Mid_Atlantic_Ocean = "water";
      String Western_Mediterranean = "water";
      String Gulf_of_Lyon = "water";
      String Tyrrhenian_Sea = "water";
      String Adriatic_Sea = "water";
      String Ionian_Sea = "water";
      String Aegan_Sea = "water";
      String Eastern_Mediterranean = "water";
      String Black_Sea = "water";
      String Barents_Sea = "water";
      
      String St_Petersburg = "coast,center";
      String Finland = "coast";
      String Sweden = "coast,center";
      String Norway = "coast,center";
      String Denmark = "coast,center";
      String Livonia = "coast";
      String Moscow = "coast,center";
      String Warsaw = "land,center";
      String Ukraina = "land";
      String Sevastopol = "coast,center";
      String Armenia = "land";
      String Syria = "coast";
      String Smyrna = "coast,center";
      String Ankara = "coast,center";
      String Constantinople = "coast,center";
      String Bulgaria = "coast,center";
      String Rumania = "coast,center";
      String Greece = "coast,center";
      String Serbia = "land,center";
      String Albania = "coast";
      String Galacia = "land";
      String Budapest = "land,center";
      String Trieste = "coast,center";
      String Tryolia = "land";
      String Vienna = "land,center";
      String Bohemia = "land";
      String Prussia = "coast";
      String Silesia = "land";
      String Berlin = "coast,center";
      String Munich = "land,center";
      String Kiel = "coast,center";
      String Ruhr = "land";
      String Holland = "coast,center";
      String Belgium = "coast,center";
      String Picardy = "coast";
      String Burgundy = "land";
      String Paris = "land,center";
      String Brest = "coast,center";
      String Gascony = "coast";
      String Marseilles = "coast,center";
      String Spain = "coast,center";
      String Portugal = "coast,center";
      String North_Africa = "coast";
      String Tunisia = "coast,center";
      String Pedmont = "coast";
      String Venice = "coast,center";
      String Tuscany = "coast";
      String Apulia = "coast";
      String Rome = "coast,center";
      String Naples = "coast,center";
      String Clyde = "coast";
      String Edinburgh = "coast,center";
      String York = "coast";
      String Liverpool = "coast,center";
      String Wales = "coast";
      String London = "coast,center";
      
      
      String[] Turkey = Country.Turkey(Ankara,Smyrna,Constantinople,year,half,start);
      System.out.print(Turkey[0] + " " + Turkey[1] + " " + Turkey[2]);
      String Austria_Hungary = "3c";
      String Germany = "3c";
      String Russia = "4c";
      String England = "3c";
      String Italy = "3c";
      String France = "3c";
      
      while(year != 18) {
         if (half == "S") {
            
            half = "F";
         } else if (half == "F") {
            
            half = "S";
            year++;
         }
      }
      
   }
}
