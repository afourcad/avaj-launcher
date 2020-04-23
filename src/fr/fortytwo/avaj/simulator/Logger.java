package fr.fortytwo.avaj.simulator;

import java.io.File;
import java.io.IOException;

public class Logger {
    private File logger;

    Logger(){
        try {
            this.logger = new File("simulation.txt");
            if (this.logger.createNewFile()) {
                System.out.println("File created: " + this.logger.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public void setNewLog(String string){
        this.logger.canWrite();
    }
}
