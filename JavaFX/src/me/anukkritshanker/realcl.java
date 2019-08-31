package me.anukkritshanker;
/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class realcl extends Main implements EventHandler<ActionEvent>

{
    int num=0;

    @Override
     public void handle(ActionEvent event) {
        if (event.getSource()==button)
            System.out.println("Button Hit");
    }
}
