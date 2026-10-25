import java.util.Arrays; 
 
public class Main { 
    public static void main(String[] args) { 
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 80}; 
        int target = 92; 
        int index = -1; 
 
        for (int i = 0; i < scores.length; i++) { 
            if (scores[i] == target) { 
                index = i; 
                break; 
            } 
        } 
 
        if (index != -1) { 
            System.out.println(target + " was found at index " + index); 
        } else { 
            System.out.println(target + " was not found."); 
        } 
 
        int[] sortedScores = Arrays.copyOf(scores, scores.length); 
        Arrays.sort(sortedScores); 
 
 
 
        System.out.println("Original array: " + Arrays.toString(scores)); 
        System.out.println("Sorted array: " + Arrays.toString(sortedScores)); 
    } 
} 