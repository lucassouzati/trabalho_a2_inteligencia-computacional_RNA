/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuronioa;

/**
 *
 * @author Tarcisio
 */
public class NeuronioA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  int[][] x, float[] w, int[] d, float a, float e, int max_int
        int [][]x = {{0,0,1,1}, {0,1,0,1}};
        double [][]w={{-0.5,0.2,-0.3},{1,1,-0.5},{0.6,-0.3,-0.8}};
        //double [][]w={{0.5,0.2,-0.6},{0.5,0.3,0.6},{0.3,0.2,-0.4}};
        int [][]d= {{0,1,0,0},{0,0,1,0},{0,1,1,0}};
        
        
        Perceptron p=new Perceptron(x,w,d,0.1,0,100000);
        p.treinar();
        
    }
    
}
