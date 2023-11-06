
import java.awt.Frame;
import view.LoginJDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Application {

    private static Frame parent;
    public static void main(String[] args) {
        new LoginJDialog(parent, true).setVisible(true);
    }
}
