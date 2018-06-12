package communications.protocol;

public class ModuleDirectory {
    public enum Module {
        SENSOR_LIDAR(0, "Sensor Lidar"), PROPULSION(1, "Propulsion Module"), COMS(2, "Communications Module"),
        DIAGNOSTICS(3, "Diagnostics Module"), POWER(4, "Power Unit"), SCIENCE(5, "Science Module"),
        KERNEL(6, "OS Kernel"), SENSOR_SPECTROMETER(7, "Spectrometer"), CAMERA_SENSOR(8, "Camera Module"),
        RADAR(9, "Radar Unit"), WEATHER_SENSOR(10, "REMS"), SPACECRAFT_CLOCK(11, "Spacecraft Clock"),
        DAN_SPECTROMETER(12, "Dynamic Albedo Neutron Spectrometer");

        int value;

        Module(int val) {
            value = val;
        }

        Module(int val, String name) {
            value = val;
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        String name;

        public String getName() {
            return name;
        }
    }

    public static final String SCLK_COMMAND      = "GetSclkInformation";
    public static final String SCLK_SYNC         = "SynchronizeClock";
    public static final String GRACEFUL_SHUTDOWN = "Graceful Shutdown.";
    public static final String SOFTWARE_UPDATE   = "Update Software";
    public static final String REQUEST_LOGS      = "Request Rover Logs";
}