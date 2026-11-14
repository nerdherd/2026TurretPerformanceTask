package frc.robot.commands.autos;

import org.wpilib.tunable.Selectable;
import org.wpilib.tunable.Tunables;
import org.wpilib.command2.Command;
import org.wpilib.command2.Commands;

import frc.robot.subsystems.SuperSystem;

public final class Autos {
    public static Selectable<Command> autoChooser = new Selectable<>();

    public static void initAutoChooser() {
        autoChooser.addDefault("Do Nothing", Commands.none());
        //EXAMPLE
        //autoChooser.add("Auto Name", AutoBuilder.buildAuto("PathPlanner Auto Name"));

        //TOP


        //MID
        

        //BOT
        Tunables.publish("Autos/Chooser", autoChooser);
    }
    

    public static void initBindings(SuperSystem superSystem) {
       



        // etc...
    }
    
}
