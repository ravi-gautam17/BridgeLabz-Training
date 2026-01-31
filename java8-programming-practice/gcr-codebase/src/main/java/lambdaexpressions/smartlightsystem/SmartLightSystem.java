package lambdaexpressions.smartlightsystem;

import java.util.HashMap;
import java.util.Map;

class SmartLightSystem {

    private Map<String, LightAction> triggers = new HashMap<>();

    // Register behaviour dynamically
    public void addTrigger(String triggerName, LightAction action) {
        triggers.put(triggerName, action);
    }

    // Execute behaviour
    public void executeTrigger(String triggerName) {
        LightAction action = triggers.get(triggerName);
        if (action != null) {
            action.activate();
        } else {
            System.out.println("No action configured for: " + triggerName);
        }
    }
}

