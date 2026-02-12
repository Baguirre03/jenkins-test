public class Hello {

    public static void main(String[] args) {
        HelloJenkins app = new HelloJenkins();
        System.out.println(app.getMessage());
    }

    public String getMessage() {
        return "Hello from Jenkins!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }
}