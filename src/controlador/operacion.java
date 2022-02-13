/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author mutsu
 */
public class operacion {
    
    
    
  public int rel(int resul) {
        int retorno=0;
  
  int min = -1000000;
		int max =1000000 ;
		
	int getRandomValue = (int) (Math.random()*(max-min)) + min;
      resul = getRandomValue;
        return retorno;
}
             
        		
		  
		
    
}
 

