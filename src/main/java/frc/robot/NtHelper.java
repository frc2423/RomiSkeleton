package frc.robot;

import java.util.function.Consumer;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.EntryNotification;
import edu.wpi.first.networktables.EntryListenerFlags;
import edu.wpi.first.networktables.NetworkTableEntry;

public class NtHelper {
    /**
     * Adds an entry listener to network tables
     * @param key String for network tables key
     * @param listener Function to be called when value changes
     */
    public static void listen(String key, Consumer<EntryNotification> listener) {
        NetworkTableInstance.getDefault().addEntryListener(key, listener,
                EntryListenerFlags.kUpdate | EntryListenerFlags.kNew | EntryListenerFlags.kImmediate);
    }

    /**
     * Get current value from network tables
     * @param key Key to get value of
     * @return current value of key
     */
    public static NetworkTableEntry getEntry(String key) {
        return NetworkTableInstance.getDefault().getEntry(key);
    }

    /**
     * Get current value from network tables
     * @param key Key to get value of
     * @param defaultValue default value if key in network tables is null
     * @return current value of key
     */
    public static Number getNumber(String key, Number defaultValue) {
        return getEntry(key).getNumber(defaultValue);
    }

    /**
     * Sets the current value to network tables
     * @param key key to set
     * @param value new value for key
     */
    public static void setNumber(String key, Number value) {
        getEntry(key).setNumber(value);
    }
    
    /**
     * Get current value from network tables
     * @param key Key to get value of
     * @param defaultValue default value if key in network tables is null
     * @return current value of key
     */
    public static String getString(String key, String defaultValue) {
        return getEntry(key).getString(defaultValue);
    }

    /**
     * Sets the current value to network tables
     * @param key key to set
     * @param value new value for key
     */
    public static void setString(String key, String value) {
        getEntry(key).setString(value);
    }

    /**
     * Sets the current value to network tables
     * @param key key to set
     * @param value new value for key
     */
    public static void setBoolean(String key, Boolean value) {
        getEntry(key).setBoolean(value);
    }

    /**
     * Get current value from network tables
     * @param key Key to get value of
     * @param defaultValue default value if key in network tables is null
     * @return current value of key
     */
    public static boolean getBoolean(String key, Boolean defaultValue) {
        return getEntry(key).getBoolean(defaultValue);
    }

    /**
     * Sets the current value to network tables
     * @param key key to set
     * @param value new value for key
     */
    public static void setStringArray(String key, String[] value) {
        getEntry(key).setStringArray(value);
    }

    /**
     * Sets the current value to network tables
     * @param key key to set
     * @param value new value for key
     */
    public static void setDoubleArray(String key, double[] value) {
        getEntry(key).setDoubleArray(value);
    }
}