package io.github.noooda.employee.domain.interfaces;

public interface CodeEvaluatable {
    public void evaluateCode(String code);
    public void provideFeedback(String code, String feedback);
}