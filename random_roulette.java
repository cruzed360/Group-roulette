import java.util.Scanner;

public class random_roulette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Collect Data from user
        System.out.print("Enter names (comma separated): ");
        String[] names = scanner.nextLine().trim().split("s,");

        System.out.print("Enter group size (2 or more): ");
        int groupSize = scanner.nextInt();
        scanner.close();



        // Shuffle names
        for (int name = 0; name < names.length; name++) {
            int random = (int) (Math.random() * names.length);
            String temp = names[name];
            names[name] = names[random];
            names[random] = temp;

        }

        // Group names and Print output
        int Group_num = 1;
        for (int group_num = 0; group_num < names.length; group_num += groupSize) {

            // number of grouped student
            if (group_num + groupSize <= names.length) {
                System.out.print("Group " + Group_num + ": ");
                Group_num++;
            }


            else {System.out.print("Students with no groups are: ");}

            for (int grouped = group_num; grouped < group_num + groupSize && grouped < names.length; grouped++) {
                System.out.print(names[grouped]);

                if (grouped < group_num + groupSize - 1 && grouped < names.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

    }}
