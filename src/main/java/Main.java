import io.github.noooda.employee.domain.models.*;

class Main {
    public static void main(String[] args) {
        JuniorEngineer Kazuki = new JuniorEngineer(1, "Kazuki");
        SeniorEngineer Taro = new SeniorEngineer(2, "Taro");

        String code = "[Login Logic]";

        Kazuki.writeCode(code);
        Taro.refactorCode(code);
    }
}