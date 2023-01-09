import java.util.HashMap;

public class AlignmentStrategyFactor {
    private final HashMap<String, AlignStrategy> strategyPrototypes;
    public AlignmentStrategyFactor() {
        strategyPrototypes = new HashMap<String, AlignStrategy>();
        strategyPrototypes.put("left", new AlignLeft());
        strategyPrototypes.put("right", new AlignRight());
        strategyPrototypes.put("center", new AlignCenter());
    }
    public AlignStrategy create(String textAlignment) {
        return strategyPrototypes.get(textAlignment);
    }
}