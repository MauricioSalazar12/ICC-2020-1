 public class HeyJude {
      public static void main(String[] args) {

              String HEY = "Hey Jude";
              
              String DONT = "don't";

              String MAKE = "make it bad";
              String BE = "be afraid";
              String LET = "let me down";

              String TAKE = "Take a sad song and make it better";
              String YOU = "You were made to go out and get her";
              String YOUH = "You have found her, now go and get her";
              
              String REME = "Remember to";

              String LETH = "let her into you heart";
              String LETHU = "let her under your skin";

              String THEN = "Then you";
 
              String CAN = "can start";
              String BEG = "begin";
         
              String TO = "to make it better";
              String BET = "better better better better better waaaa";
              
              String NA = "na";

              int x = 0;
               
                while (x<7) {
                         if (x==0||x==1||x==3||x==5) {
                                                     System.out.print(HEY);
                                                     System.out.print(" " +DONT);

                                                     if (x==0||x==5) {
                                                                     System.out.println(" " +MAKE);
                                                                     System.out.println(TAKE);
                                                                     }
                                                     else {
                                                          if (x==1) {
                                                                    System.out.println(" " +BE);
                                                                    System.out.println(YOU);
                                                                    }
                                                          else {
                                                               System.out.println(" " +LET);
                                                               System.out.println(YOUH);
                                                               }
                                                          }

                                                     System.out.print(REME);

                                                     if (x==0||x==3) {
                                                                     System.out.println(" " +LETH);
                                                                     }
                                                     else {
                                                          System.out.println(" " +LETHU);
                                                          }

                                                     System.out.print(THEN);

                                                     if (x==0||x==3) {
                                                                     System.out.print(" " +CAN);
                                                                     }
                                                     else {
                                                          System.out.print(" " +BEG);
                                                          }

                                                     System.out.println(" " +TO);
                                                     System.out.println(" ");
                                                     
                                                     if (x==5) {
                                                               System.out.println(BET);
                                                               System.out.println(" ");
                                                               }
                                                     }     
                         else {
                              System.out.println(NA +" " + NA + " "+ NA  + " " +NA+ " " + NA + " " +NA + " "  +NA);
                              System.out.println(" ");
                              }                            
                         x = x+1;
                                                     
                         
                         }







  }
}
