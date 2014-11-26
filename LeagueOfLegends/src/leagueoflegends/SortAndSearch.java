/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leagueoflegends;

/**
 *
 * @author Crêak
 */
public class SortAndSearch{
    
    void SortAndSearch( Champion values[], int n )
{
       int i, j;       
       Champion tmp;        
 
       
        for( i = 0; i < n; i++ )
         {
    
           for( j = n - 1; j > i; j-- )
            {
      
             if ((values[j].getName().compareTo(values[j-1].getName()))>0)
              {
          // Werte vertauschen
               tmp = values[j];
                values[j] = values[j - 1];
                values[j - 1] = tmp;
      }
    }
  }
}
}
