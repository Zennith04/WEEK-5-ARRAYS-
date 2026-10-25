public class Main { 
 
    static class Student { 
        String name; 
        int[] quizzes; 
        double average; 
 
        Student(String name, int[] quizzes) { 
            this.name = name; 
            this.quizzes = quizzes; 
 
            int sum = 0; 
            for (int score : quizzes) { 
                sum += score; 
            } 
 
            average = (double) sum / quizzes.length; 
        } 
    } 
 
    public static void main(String[] args) { 
        String[] names = { 
            "Kevin", "Geralyn", "Carlo", "John Fol", "Shamille" 
        }; 
 
        int[][] quizData = { 
            {90, 85, 95, 90}, 
            {80, 85, 90, 85}, 
            {95, 90, 90, 85}, 
            {80, 85, 90, 85}, 
            {75, 80, 85, 90} 
        }; 
 
        Student[] students = new Student[names.length]; 
 
        for (int i = 0; i < students.length; i++) { 
            students[i] = new Student(names[i], quizData[i]); 
 
 
        } 
 
        sortStudents(students); 
 
        System.out.println("========== CLASS LEADERBOARD =========="); 
        System.out.printf("%-8s %-12s %-10s%n", "Rank", "Name", "Average"); 
        System.out.println("---------------------------------------"); 
 
        int rank = 1; 
 
        for (int i = 0; i < students.length; i++) { 
            if (i > 0 && 
                students[i].average != students[i - 1].average) { 
                rank = i + 1; 
            } 
 
            System.out.printf( 
                "%-8d %-12s %-10.2f%n", 
                rank, 
                students[i].name, 
                students[i].average 
            ); 
        } 
 
        String searchName = "John Fol"; 
        int studentRank = findRank(students, searchName); 
 
        System.out.println("\n========== STUDENT SEARCH =========="); 
 
        if (studentRank != -1) { 
            System.out.println(searchName + "'s rank: " + studentRank); 
        } else { 
            System.out.println(searchName + " was not found."); 
        } 
    } 
 
    public static void sortStudents(Student[] students) { 
        for (int i = 0; i < students.length - 1; i++) { 
            for (int j = 0; j < students.length - 1 - i; j++) { 
                if (students[j].average < students[j + 1].average) { 
                    Student temp = students[j]; 
                    students[j] = students[j + 1]; 
                    students[j + 1] = temp; 
                } 
            } 
        } 
    } 
 
 
 
    public static int findRank(Student[] students, String name) { 
        for (int i = 0; i < students.length; i++) { 
            if (students[i].name.equalsIgnoreCase(name)) { 
                for (int j = 0; j < students.length; j++) { 
                    if (students[j].average > students[i].average) { 
                        continue; 
                    } 
                } 
 
                int rank = 1; 
 
                for (int j = 0; j < students.length; j++) { 
                    if (students[j].average > students[i].average) { 
                        rank++; 
                    } 
                } 
 
                return rank; 
            } 
        } 
 
        return -1; 
    } 
} 
