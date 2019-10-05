package ajedrez;
import processing.core.PApplet;


	public class Tablero extends PApplet {

		public static void main(String[] args) {
                    PApplet.main("ajedrez.Tablero");
                }
                @Override
                public void settings() {
                     size (800,800);
                }
		
                @Override
		public void setup() {
                     
		}
		@Override
		public void draw() {
		     
                     for (int j=0;j<700;j += 200) {
                     	  
			 
				for (int i=0;i < 700;i += 200){ 
					fill(0xFFFFFFFF);
                     			rect(i,j,100,100);
                                }
                             
		     }
                     
                     for (int j = 100;j < 800;j += 200){
				
				for (int i = 0;i < 700;i += 200){
	             	                fill(0xFF000000);
                     	                rect(i,j,100,100);
                                    }
		     }    
                }


     
}
