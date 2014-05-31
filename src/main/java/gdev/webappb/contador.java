/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gdev.webappb;

/**
 *
 * @author gaijin
 */
public class contador {
     private static int vi;

    public static int getVi() {
        vi++;
        return vi;
    }

    public void setVi(int vi) {
        this.vi = vi;
    }
    
}
