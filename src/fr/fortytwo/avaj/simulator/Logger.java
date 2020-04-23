package fr.fortytwo.avaj.simulator;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static FileWriter logger;

    static {
        try {
            logger = new FileWriter("simulation.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void setNewLog(String string){
        try {
            logger.write(string + "\n");
        } catch (IOException e) {
            System.out.println("Cannot write to the file");
        }
    }

    public static void closeLogger(){
        try {
            logger.close();
        } catch (IOException e) {
            System.out.println("Cannot close the file");
        }
    }
}
