/* Write the correct class definition with Attributes based on the given class diagram. */
import java.util.Scanner;

// Write your Patient class here
class Patient{
    String name;
    int height;
    int heart_rate;
    double weight;
    double temperature;

    public double calculate_bmi(){
        return weight / (height * height) * 703;
    }

    public String triage(){
        if (temperature > 106 || heart_rate > 170){
            return "Emergency";
        } else if (temperature > 102){
            return "Doctor";
        }
        return "Nurse";
    }
}


//Don't change any code below this line
public class Hospital{
    static Scanner user_input = new Scanner (System.in);

    public static void main(String []args) {
        Patient first_patient = get_patient();

        System.out.println("The Patient " + first_patient.name + "'s BMI is " + first_patient.calculate_bmi() +
                " and should go see " + first_patient.triage() + ".");
    }

    static Patient get_patient()
    {
        Patient new_patient = new Patient();

        System.out.print("Enter the patients name: ");
        new_patient.name = user_input.nextLine();

        System.out.print("Enter the patients weight (lbs): ");
        new_patient.weight = user_input.nextDouble();

        System.out.print("Enter the patients height (in): ");
        new_patient.height = user_input.nextInt();

        System.out.print("Enter the patients temperature (F): ");
        new_patient.temperature = user_input.nextDouble();

        System.out.print("Enter the patients heart rate (bpm): ");
        new_patient.heart_rate = user_input.nextInt();

        return new_patient;
    }
}