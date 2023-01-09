public class AligmentStragegyFactor {
    strategyPrototypes
    public AligmentStragegyFactor() {
        strategyPrototypes = new HashMap<String, AlignStrategy>();
        strategyPrototypes.put("left", new AlignLeft());
        strategyPrototypes.put("right", new AlignRight());
        strategyPrototypes.put("center", new AlignCenter());
    }
    public create(String type) {
        return strategyPrototypes.get(type).clone();
    }
    
}