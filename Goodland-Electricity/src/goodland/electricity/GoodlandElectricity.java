/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodland.electricity;

import java.util.Scanner;

/**
 *
 * @author CHUKWUEMEKA
 */
public class GoodlandElectricity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int K = in.nextInt();
        
        int[] cities = new int[N];
        
        for(int i=0; i < N; i++){
            cities[i] = in.nextInt();
        }
        
        int index = 0;
        int range = 0;
        int changes = 0;
        
        while(index < N){
            
            if(index < range){
                // city is already in range                
            }
            else{
                // find a tower to switch on
                
                int towerEnd = index+K;
                int towerStart = index-K+1;
                if(towerStart < 0){
                    towerStart = 0;
                }
                int tower = -1;
                
                for(int j=towerStart; j<towerEnd && j<N; j++){
                    if(cities[j] == 1){
                        tower = j;
                    }
                }
                
                // no way to handle current city
                if(tower == -1){
                    System.out.println(-1);
                    return;
                }
                else{
                    changes++;
                    index = tower;
                    range = index + K;
                }
            }
            
            index++;
        }
        
        System.out.println(changes);
    }
    
}
