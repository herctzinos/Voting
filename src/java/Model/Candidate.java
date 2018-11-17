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
public class Candidate {
    
    private String name;
    private int cand_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCand_id() {
        return cand_id;
    }

    public void setCand_id(int cand_id) {
        this.cand_id = cand_id;
    }

    public Candidate(String name, int cand_id) {
        this.name = name;
        this.cand_id = cand_id;
    }
}
