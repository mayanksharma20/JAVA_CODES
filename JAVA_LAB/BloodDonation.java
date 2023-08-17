
/*
Your Collage is conducting a blood donation camp, so organiser wants
to know how many students are interested in blood donation, therefore
design a form to get details of the students like name, age, blood group,
last donation data and whether they are ready to donate or not.
Design user inteface using awt componants and handle respective events

*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
//import java.util.Date;

public class BloodDonation extends Frame implements ActionListener {
    
    Label Lname,Lage,Lbloodgroup,Ldonationdate;
    TextField nameField, ageField, bloodGroupField, lastDonationField;
    Checkbox readyToDonateCheckbox;
    Button submitButton;
  
    public BloodDonation() {
    // Set the UI layout
    setLayout(new GridLayout(6, 2));
    
    // Add the name field
    Lname=new Label("Name:");
    nameField = new TextField();
    add(Lname);
    add(nameField);
    
    // Add the age field
    Lage=new Label("Age:");
    ageField = new TextField();
    add(Lage);
    add(ageField);
    
    // Add the blood group field
    Lbloodgroup=new Label("Blood Group:");
    bloodGroupField = new TextField();
    add(Lbloodgroup);
    add(bloodGroupField);
    
    // Add the last donation date field
    Ldonationdate=new Label("Last Donation Date (dd/mm/yyyy):");
    lastDonationField = new TextField();
    add(Ldonationdate);
    add(lastDonationField);
    
    // Add the ready to donate checkbox
    readyToDonateCheckbox = new Checkbox("Ready to Donate");
    add(new Label(""));
    add(readyToDonateCheckbox);
    
    // Add the submit button
    add(new Label(""));
    submitButton = new Button("Submit");
    submitButton.addActionListener(this);
    add(submitButton);
    
    // Set the frame properties
    setTitle("Blood Donation Form");
    setSize(400, 200);
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e) {
    // Get the form data
    String name = nameField.getText();
    int age = Integer.parseInt(ageField.getText());
    String bloodGroup = bloodGroupField.getText();
    String lastDonationDate = lastDonationField.getText();
    boolean readyToDonate = readyToDonateCheckbox.getState();
    
    // Show a confirmation message
    String message = "Thank you for your interest in blood donation!\n\n";
    message += "Name: " + name + "\n";
    message += "Age: " + age + "\n";
    message += "Blood Group: " + bloodGroup + "\n";
    message += "Last Donation Date: " + lastDonationDate + "\n";
    message += "Ready to Donate: " + (readyToDonate ? "Yes" : "No") + "\n";
    message += "\nWe will contact you soon to schedule a donation appointment.";
    JOptionPane.showMessageDialog(this, message);
  }
  
  public static void main(String[] args) {
    new BloodDonation();
  }
}
