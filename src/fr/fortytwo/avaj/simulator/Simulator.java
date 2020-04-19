package fr.fortytwo.avaj.simulator;

import fr.fortytwo.avaj.simulator.vehicules.AircraftFactory;
import fr.fortytwo.avaj.simulator.vehicules.Flyable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Simulator {

    public static void main(String[] args) throws InterruptedException {
        List<Flyable> flyables = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();
            if(line != null) {
                WeatherTower weatherTower = new WeatherTower();
                int simulations = Integer.parseInt(line.split(" ")[0]);
                if (simulations < 0){
                    System.out.println("Invalid simulations count " + simulations);
                }
                while ((line = reader.readLine()) != null) {
                    Flyable flyable = AircraftFactory.newAircraft(
                            line.split(" ")[0],
                            line.split(" ")[1],
                            Integer.parseInt(line.split(" ")[2]),
                            Integer.parseInt(line.split(" ")[3]),
                            Integer.parseInt(line.split(" ")[4])
                    );
                    flyables.add(flyable);
                }

                for (Flyable flyable: flyables){
                    flyable.registerTower(weatherTower);
                }

                for (int i = 1; i <= simulations; i++){
                    weatherTower.changeWeather();
                }
            }
        } catch (FileNotFoundException error){
            System.out.println("Couldn't find file " + args[0]);
        } catch (IOException error){
            System.out.println("There was an error reading the file " + args[0]);
        }catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Specify simulation file");
        } finally {
            //loger.close()
        }
    }
}