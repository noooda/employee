package io.github.noooda.employee.domain.models;

import io.github.noooda.employee.domain.base.Employee;
import io.github.noooda.employee.domain.interfaces.CodeReadable;
import io.github.noooda.employee.domain.interfaces.CodeWritable;

public class JuniorEngineer extends Employee implements CodeWritable, CodeReadable {

    public JuniorEngineer(int id, String name) {
        super(id, name);
    }

    @Override
    public void writeCode(String code) {
        System.out.println("Writing " + code + " is difficult for me.");
    }

    @Override
    public void refactorCode(String code) {
        System.out.println("Refactoring " + code + " is challenging for me.");
    }

    @Override
    public void readCode(String code) {
        System.out.println("Reading " + code + " is difficult for me.");
    }

    @Override
    public void understandCode(String code) {
        System.out.println("Understanding " + code + " is difficult for me.");
    }
}
