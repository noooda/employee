package io.github.noooda.employee.domain.models;

import io.github.noooda.employee.domain.base.Employee;
import io.github.noooda.employee.domain.interfaces.*;

public class SeniorEngineer extends Employee implements CodeWritable, CodeReadable, CodeEvaluatable {

    public SeniorEngineer(int id, String name) {
        super(id, name);
    }

    @Override
    public void writeCode(String code) {
        System.out.println("Writing " + code + " is easy for me.");
    }

    @Override
    public void refactorCode(String code) {
        System.out.println("Refactoring " + code + " is straightforward for me.");
    }

    @Override
    public void readCode(String code) {
        System.out.println("Reading " + code + " is easy for me.");
    }

    @Override
    public void understandCode(String code) {
        System.out.println("Understanding " + code + " is straightforward for me.");
    }

    @Override
    public void evaluateCode(String code) {
        System.out.println("Evaluating " + code + " is straightforward for me.");
    }

    @Override
    public void provideFeedback(String code, String feedback) {
        System.out.println("Providing feedback on " + code + ": " + feedback + ".");
    }

    public void mentorJuniorEngineer(JuniorEngineer junior) {
        System.out.println("Mentoring " + junior.getName() + " to improve " + junior.getName() + "'s skills.");
    }
}

