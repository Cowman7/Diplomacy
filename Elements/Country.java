package Elements;

public class Country {
   public static String country = "";
   
   public static String[] Turkey(String area1, String area2, String area3, int year, String half, boolean start) {
      if(year == 1 && half == "S") {
         if (area1.contains("coast")) {
            area1 = area1 + ",occupiedTurkeyNavy";
            area2 = area2 + ",occupiedTurkeyArmy";
            area3 = area3 + ",occupiedTurkeyArmy";
         } else if (area1.contains("land")) {
            area1 = area1 + ",occupiedTurkeyArmy";
            if (area2.contains("coast")) {
               area2 = area2 + ",occupiedTurkeyNavy";
               area3 = area3 + ",occupiedTurkeyArmy";
            }
         }
      }
      country = "Turkey";
      moveOrders.createAndShowGUI();
      String t;
      for (int i = 0; i < 10; i = i - 1) {
         t = moveOrders.text1;
         if (t != null) {
            i = 14;
         }
      }
      String text1 = moveOrders.text1;
      while (text1 == null) {
         int i = 0;
         text1 = moveOrders.text1;
      }
      
      String text2 = moveOrders.text2;
      String text3 = moveOrders.text3;
      String[] text = {text1, text2, text3};
      return text;
   }
   /*public static String Austria_Hungary(String area1, String area2, String area3) {
   }
   public static String Germany(String area1, String area2, String area3) {
   }
   public static String Russia(String area1, String area2, String area3) {
   }
   public static String England(String area1, String area2, String area3) {
   }
   public static String Italy(String area1, String area2, String area3) {
   }
   public static String France(String area1, String area2, String area3) {
   }
   */
}
