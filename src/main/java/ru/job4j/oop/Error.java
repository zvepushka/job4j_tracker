package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error erro = new Error(true, 404, "Ошибка 404.");
        erro.printInfo();
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Номер ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }
}
