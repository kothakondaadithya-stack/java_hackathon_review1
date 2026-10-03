
public class SolarSystemDetails {
    public static void main(String[] args) {
        // Storing solar system details using appropriate data types
        int panelId = 10452;
        double energyGenerated = 450.75; // double is preferred for precise decimal values
        int numberOfPanels = 12;
        char systemStatus = 'A'; // 'A' for Active, 'I' for Inactive, etc.

        // Displaying the details
        System.out.println("--- Rooftop Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}