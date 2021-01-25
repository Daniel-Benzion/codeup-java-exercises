public class StringExercise {

    public static void main(String[] args) {

        String str = "We don't need no education\nWe don't need no thought control - Check \"this\" out!, \"s inside of \"s! - In windows, the main drive is usually C:\\ - I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";

        System.out.println(str.substring(0, 59));
        System.out.println(str.substring(62, 98));
        System.out.println(str.substring(100, 142));
        System.out.println(str.substring(144));
    }
}
