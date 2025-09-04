
public class calculator {
    int a = 10;
    int b = 20;

    class addition extends calculator {
        void performAddition() {
            int add = a + b;
            System.out.println("Addition is :" + add);
        }

        public static void main(String[] args) {
            calculator cal = new calculator();
            calculator.addition add = cal.new addition();
            add.performAddition();
        }
    }

}