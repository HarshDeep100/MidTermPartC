/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Harshdeep
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Harshdeep
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display available genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Available genres:");
        for (String genre : genres) {
            System.out.println("- " + genre);
        }
        
        // Take user inputs
        System.out.print("Enter your userID: ");
        String userID = scanner.nextLine();
        System.out.print("Enter your favorite genre (Comedy, Drama, Action, Mystery): ");
        String genre = scanner.nextLine();
        
        // Validate and create user profile
        boolean validGenre = false;
        for (String availableGenre : genres) {
            if (genre.equalsIgnoreCase(availableGenre)) {
                validGenre = true;
                break;
            }
        }
        
        if (validGenre) {
            UserProfile userProfile = new UserProfile(userID, genre);
            System.out.println("Your userProfile was created successfully!");
        } else {
            System.out.println("Invalid genre. UserProfile not created.");
        }
    }
}
