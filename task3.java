import java.util.Scanner;

public class task3 {
    public task3() {
    }

    public static void main(String[] var0) {
        float[] var1 = new float[8];
        float var2 = 0.0F;
        Scanner var3 = new Scanner(System.in);
        System.out.print("Enter Marks Obtained in 8 Subjects: ");

        for (int var4 = 0; var4 < 8; ++var4) {
            var1[var4] = var3.nextFloat();
            var2 += var1[var4];
        }

        float var6 = var2 / 8.0F;
        String var5 = "";
        if (var6 >= 94.0F) {
            var5 = "A";
        } else if (var6 >= 90.0F && var6 < 94.0F) {
            var5 = "A-";
        } else if (var6 >= 87.0F && var6 < 90.0F) {
            var5 = "B+";
        } else if (var6 >= 83.0F && var6 < 87.0F) {
            var5 = "B";
        } else if (var6 >= 80.0F && var6 < 83.0F) {
            var5 = "B-";
        } else if (var6 >= 77.0F && var6 < 80.0F) {
            var5 = "C+";
        } else if (var6 >= 73.0F && var6 < 77.0F) {
            var5 = "C";
        } else if (var6 >= 70.0F && var6 < 73.0F) {
            var5 = "C-";
        } else if (var6 >= 67.0F && var6 < 70.0F) {
            var5 = "D+";
        } else if (var6 >= 63.0F && var6 < 67.0F) {
            var5 = "D";
        } else if (var6 >= 60.0F && var6 < 63.0F) {
            var5 = "D-";
        } else {
            var5 = "F";
        }

        System.out.println("\nGrade = " + var5);
        System.out.println("\n Total Max = " + var2);
        System.out.println("\n Average Percentage = " + var2 / 800.0F * 100.0F / 8.0F);
    }
}