/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conf;

import javafx.scene.control.Alert;

/**
 *
 * @author Qhuy
 */
public class Utils {
    public static Alert showBox(String msg, Alert.AlertType type){
        Alert a = new Alert(type);
        a.setContentText(msg);
        return a;
    }
}
