/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Herc
 */
public class Voter {
    
    
    private String name;
    private int id_cand;

    public Voter(String name, int id_cand) {
        this.name = name;
        this.id_cand = id_cand;
    }

    public Voter() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_cand() {
        return id_cand;
    }

    public void setId_cand(int id_cand) {
        this.id_cand = id_cand;
    }
}
