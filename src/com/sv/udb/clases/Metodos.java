/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author bernardo
 */
public class Metodos {
    
    public String crearpath()
    {
        String path = "com/sv/udb/images/"+Math.round(Math.random()*6+1)+".png";
        return path;
    }

    public boolean ganador(JLabel N1, JLabel N2, JLabel N3){
        boolean resp;
        String url = N1.getIcon().toString();
        if (N1.getIcon().equals(N2.getIcon()) && N1.getIcon().equals(N3.getIcon()) && url.contains("7")){
            resp = true;
        }
        else
        {
            resp = false;
        }
        return resp;
    }
}
