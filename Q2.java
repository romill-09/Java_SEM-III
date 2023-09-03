import java.util.*;

public class Q2 {
    static int n;
    static Student stu[];
    static int curr = 0;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n = s.nextInt();

        // n + 1 to allow for shifting of elements
        stu = new Student[n + 1];
        
        // Option Menu
        while(true)
        {
            System.out.println("1. Add an element \n 2. Delete an element \n 3. Display\n 4. End");
            int choice;
            choice = s.nextInt();

            switch(choice)
            {
                case 1:
                    if(curr == n)
                    {
                        System.out.println("The array is full");
                    }
                    System.out.println("Enter the student id");
                    int stud_id = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter the student name");
                    String name = s.nextLine();
                    System.out.println("Enter the average marks");
                    float avg = s.nextFloat();
                    Student x = new Student(stud_id, name, avg);
                    int i = 0;

                    // Find position to be inserted in i.e. the element just smaller than the given element
                    for(i = 0; i < curr; i++)
                    {
                        if(stu[i].avg_marks <  avg)break;
                    }

                    // Shift all the other elements one position to the right to make space
                    for(int j = curr + 1; j > i; j--)
                    {
                        stu[j] = stu[j - 1];
                    }

                    // Add the student and increment curr(number of students inserted)
                    stu[i] = x;
                    curr++;
                    break;
                case 2:
                    System.out.println("Enter the student id to be deleted: \n");
                    int id = s.nextInt();

                    // Find the position of student to be deleted

                    int pos;
                    for(pos = 0; pos < curr; pos++)
                    {
                        if(stu[pos].stud_id == id)break;
                    }

                    // Now to delete we shift every element one position to the left essentialy
                    // erasing that position

                    for(int j = pos; j < curr - 1; j++)
                    {
                        stu[j] = stu[j + 1];
                    }

                    // Decrement the student count
                    curr--;
                    break;
                case 3:
                    for(int k = 0; k< curr; k++)
                    {
                        System.out.println("Name " + stu[k].name);
                        System.out.println("Avg Marks " + stu[k].avg_marks);
                        System.out.println();
                    }
                    break;

                
        
                case 4:
                    return;
                

            }
        }

    }
}

class Student {
    int stud_id;
    String name;
    float avg_marks;

    Student(int id, String name, float avg)
    {
        this.stud_id = id;
        this.name = name;
        this.avg_marks = avg;
    }
}