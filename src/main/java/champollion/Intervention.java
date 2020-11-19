/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

/**
 *
 * @author Julie LEROY
 */
public class Intervention {
    public Calendar debut;
    public int duree;
    public boolean annule;
   
}

public Calendar getDebut() {
    return debut;
}

public int getDurée(){
    return duree;
}

public boolean isAnnule(){
    return annule;
}