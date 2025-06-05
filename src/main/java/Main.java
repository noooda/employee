import io.github.noooda.employee.domain.models.*;

class Main {
    public static void main(String[] args) {
        JuniorEngineer Taro = new JuniorEngineer(1, "Taro");
        System.out.println("ID: " + Taro.getId());
        System.out.println("Name: " + Taro.getName());
    }
}