package frc.robot.AutonCommands; //folder the file is in

//wpilib imports
import edu.wpi.first.wpilibj2.command.CommandBase;

//local imports
import frc.robot.Subsystems.HazyIntake;

public class CommandStopIntake extends CommandBase {

    private HazyIntake c_hazyIntake;
    private long startTime;

    public CommandStopIntake(HazyIntake subsystem){
        c_hazyIntake = subsystem;
        addRequirements(c_hazyIntake);
    }

    @Override
    public void initialize(){
        startTime = java.lang.System.currentTimeMillis();
    }

    @Override
    public void execute () {
        c_hazyIntake.defaultC();
    }

    @Override
    public boolean isFinished() {
        if (java.lang.System.currentTimeMillis() > startTime + 750) {
            return true;
        }
        return false;
    }
}