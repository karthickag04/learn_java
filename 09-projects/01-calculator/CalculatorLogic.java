public class CalculatorLogic {

    public String evaluate(String expr) {
        try {
            double result = eval(expr);
            return String.valueOf(result);
        } catch (Exception e) {
            return "Error";
        }
    }

    private double eval(String expr) {
        javax.script.ScriptEngine engine = new javax.script.ScriptEngineManager().getEngineByName("JavaScript");
        try {
            Object result = engine.eval(expr);
            return Double.parseDouble(result.toString());
        } catch (Exception e) {
            throw new RuntimeException("Invalid Expression");
        }
    }
}