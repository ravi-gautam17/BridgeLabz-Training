package lambdaexpressions.smartlightsystem;

public class SmartHomeLightingDemo {

    public static void main(String[] args) {

        SmartLightSystem system = new SmartLightSystem();

        // Motion detected
        system.addTrigger("MOTION", () ->
                System.out.println("Lights ON at full brightness")
        );

        // Evening time
        system.addTrigger("EVENING", () ->
                System.out.println("Warm dim lights activated")
        );

        // Night time
        system.addTrigger("NIGHT", () ->
                System.out.println("Night mode: low blue lights")
        );

        // Voice command
        system.addTrigger("VOICE_PARTY", () ->
                System.out.println("Party mode: colour cycling lights")
        );

        // Execute triggers
        system.executeTrigger("MOTION");
        system.executeTrigger("EVENING");
        system.executeTrigger("NIGHT");
        system.executeTrigger("VOICE_PARTY");
    }
}
