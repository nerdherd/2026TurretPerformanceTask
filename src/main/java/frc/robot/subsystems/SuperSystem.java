package frc.robot.subsystems;

import org.wpilib.command2.CommandScheduler;
import frc.robot.Constants.LoggingConstants;
import frc.robot.util.nerd_logging.NerdLog;

/**
 * Coordinates subsystems
 * <p>
 * Provides commands to be bound to controller buttons that run individual subsystems as needed
 */
public class SuperSystem extends SuperSystemBase {
    public SuperSystem(NerdDrivetrain swerveDrivetrain) {
        super(swerveDrivetrain);
    }

    // ------------------------------------ logging ------------------------------------ //
    /**
     * {@inheritDoc}
     */
    @Override
    public void initializeLogging() {
        super.initializeLogging();
        NerdLog.logData(LoggingConstants.kSupersystemTab + "/Command Scheduler", CommandScheduler.getInstance(), LOG_LEVEL.ALL);
    }
}
