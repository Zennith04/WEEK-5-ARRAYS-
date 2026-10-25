public class Main { 
    public static void main(String[] args) { 
        String[] favorites = { 
            "Volleyball", 
            "Reading", 
            "Watching Series", 
            "Coffee Hunting", 
            "Online Games" 
        }; 
 
        for (int i = 0; i < favorites.length; i++) { 
            System.out.println((i + 1) + ". " + favorites[i]); 
        } 
 
        System.out.println("Total number of favorites: " + favorites.length); 
    } 
}