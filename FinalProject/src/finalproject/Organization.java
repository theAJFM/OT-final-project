/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.*;
import javafx.beans.property.*;
/**
 *
 * @author theAJFM
 */
public class Organization {//The model of the program.
    private int counter = 0;
    private SimpleStringProperty name;//The variable needs to be set as a SimpleProperty to be able to be displayed in the table.
    private SimpleIntegerProperty ID;
    private SimpleStringProperty dateOfRegistration;
    private SimpleIntegerProperty houseNo;
    private SimpleStringProperty streetName;
    private SimpleStringProperty districtName;
    private SimpleStringProperty province;
    private SimpleIntegerProperty postcode;
    private SimpleStringProperty chairPerson;
    private SimpleStringProperty email;
    private SimpleStringProperty password;
    private SimpleIntegerProperty exComNum;
    private SimpleStringProperty exCom1;
    private SimpleStringProperty exCom2;
    private SimpleStringProperty exCom3;
    private SimpleStringProperty exCom4;
    private SimpleStringProperty emailCom1;
    private SimpleStringProperty emailCom2;
    private SimpleStringProperty emailCom3;
    private SimpleStringProperty emailCom4;
    private SimpleStringProperty passCom1;
    private SimpleStringProperty passCom2;
    private SimpleStringProperty passCom3;
    private SimpleStringProperty passCom4;
    private String[] exComNames = new String[4];//Array that holds the information of the executive commitees.
    private String[] exComEmail = new String[4];
    private String[] exComPass = new String[4];
    private Map<String, List<String>> exCom = new HashMap<String, List<String>>();

    /**
     *
     * @param name the name of the organization given in the parameter
     * @param ID the ID number of the organization given in the parameter
     * @param dateOfRegistration the date of registration of the organization given in the parameter
     * @param houseNo the house's number of the organization's location given in the parameter
     * @param streetName the street of the organization's location given in the parameter
     * @param districtName the district of the organization's location given in the parameter
     * @param province the province of the organization's location given in the parameter
     * @param postcode the postcode of the organization's location given in the parameter
     * @param chairPerson the chairperson's name of the organization given in the parameter
     * @param email the chairperson's email given in the parameter
     * @param password the password of the chairperson's account given in the parameter
     * @param exComNum the number of the executive committee given in the parameter 
     * @param exCom a hash map that corresponds to the executive committee's name, email, and passwords given in the parameter
     */
    public Organization(String name, int ID, String dateOfRegistration, int houseNo, String streetName, String districtName, String province, int postcode, String chairPerson, String email, String password, int exComNum, Map<String, List<String>> exCom) {
        
        this.name = new SimpleStringProperty(name);
        this.ID = new SimpleIntegerProperty(ID);
        this.dateOfRegistration = new SimpleStringProperty(dateOfRegistration.toString());
        this.houseNo = new SimpleIntegerProperty(houseNo);
        this.streetName = new SimpleStringProperty(streetName);
        this.districtName = new SimpleStringProperty(districtName);
        this.province = new SimpleStringProperty(province);
        this.postcode = new SimpleIntegerProperty(postcode);
        this.chairPerson = new SimpleStringProperty(chairPerson);
        this.email = new SimpleStringProperty(email);
        this.password = new SimpleStringProperty(password);
        this.exComNum = new SimpleIntegerProperty(exComNum);
        this.exCom = exCom;
        
        Arrays.fill(exComNames, "");//Initialize all of the arrays.
        Arrays.fill(exComEmail, "");
        for (Map.Entry<String, List<String>> entry : exCom.entrySet()) {
            exComEmail[counter] = entry.getKey();
            List<String> list = entry.getValue();
            exComNames[counter] = list.get(0);
            exComPass[counter] = list.get(1);
            counter++;
        }
        exCom1 = new SimpleStringProperty(exComNames[0]);
        exCom2 = new SimpleStringProperty(exComNames[1]);
        exCom3 = new SimpleStringProperty(exComNames[2]);
        exCom4 = new SimpleStringProperty(exComNames[3]);
        emailCom1 = new SimpleStringProperty(exComEmail[0]);
        emailCom2 = new SimpleStringProperty(exComEmail[1]);
        emailCom3 = new SimpleStringProperty(exComEmail[2]);
        emailCom4 = new SimpleStringProperty(exComEmail[3]);
        passCom1 = new SimpleStringProperty(exComPass[0]);
        passCom2 = new SimpleStringProperty(exComPass[1]);
        passCom3 = new SimpleStringProperty(exComPass[2]);
        passCom4 = new SimpleStringProperty(exComPass[3]);
    }
    

    /**
     *
     */
    public Organization() {//Empty Constructor, never used in the program
    }
    /*These are the setters and getters methods that need to follow a certain naming convention in order to be able to populate the table properly.*/

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name.set(name);
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID.set(ID);
    }

    /**
     *
     * @param dateOfRegistration
     */
    public void setDateOfRegistration(Calendar dateOfRegistration) {
        this.dateOfRegistration.set(dateOfRegistration.toString());
    }

    /**
     *
     * @param houseNo
     */
    public void setHouseNo(int houseNo) {
        this.houseNo.set(houseNo);
    }

    /**
     *
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName.set(streetName);
    }

    /**
     *
     * @param districtName
     */
    public void setDistrictName(String districtName) {
        this.districtName.set(districtName);
    }

    /**
     *
     * @param province
     */
    public void setProvince(String province) {
        this.province.set(province);
    }

    /**
     *
     * @param postcode
     */
    public void setPostcode(int postcode) {
        this.postcode.set(postcode);
    }

    /**
     *
     * @param chairPerson
     */
    public void setChairPerson(String chairPerson) {
        this.chairPerson.set(chairPerson);
    }

    /**
     *
     * @param exComNum
     */
    public void setExComNum(int exComNum) {
        this.exComNum.set(exComNum);
    }

    /**
     *
     * @param exCom
     */
    public void setExCom(Map<String, List<String>> exCom) {
        this.exCom = exCom;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email.set(email);
    }
    
    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password.set(password);
    }
    
    public void setExCom1(String exCom1) {
        this.exCom1.set(exCom1);
    }
    
    public void setExCom2(String exCom2) {
        this.exCom2.set(exCom2);
    }
    
    public void setExCom3(String exCom3) {
        this.exCom3.set(exCom3);
    }
    
    public void setExCom4(String exCom4) {
        this.exCom4.set(exCom4);
    }
    
    public void setEmailCom1(String emailCom1) {
        this.emailCom1.set(emailCom1);
    }
    
    public void setEmailCom2(String emailCom2) {
        this.emailCom2.set(emailCom2);
    }
    
    public void setEmailCom3(String emailCom3) {
        this.emailCom3.set(emailCom3);
    }
    
    public void setEmailCom4(String emailCom4) {
        this.emailCom4.set(emailCom4);
    }
    
    public void setPassCom1(String passCom1) {
        this.passCom1.set(passCom1);
    }
    
    public void setPassCom2(String passCom2) {
        this.passCom2.set(passCom2);
    }
    
    public void setPassCom3(String passCom3) {
        this.passCom3.set(passCom3);
    }
    
    public void setPassCom4(String passCom4) {
        this.passCom4.set(passCom4);
    }
    
    /**
     *
     * @return the name of the organization
     */
    public String getName() {
        return name.get();
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID.get();
    }

    /**
     *
     * @return
     */
    public String getDateOfRegistration() {
        return dateOfRegistration.get();
    }

    /**
     *
     * @return
     */
    public int getHouseNo() {
        return houseNo.get();
    }

    /**
     *
     * @return
     */
    public String getStreetName() {
        return streetName.get();
    }

    /**
     *
     * @return
     */
    public String getDistrictName() {
        return districtName.get();
    }

    /**
     *
     * @return
     */
    public String getProvince() {
        return province.get();
    }

    /**
     *
     * @return
     */
    public int getPostcode() {
        return postcode.get();
    }

    /**
     *
     * @return
     */
    public String getChairPerson() {
        return chairPerson.get();
    }


    /**
     *
     * @return
     */
    public int getExComNum() {
        return exComNum.get();
    }

    /**
     *
     * @return
     */
    public Map<String, List<String>> getExCom() {
        return exCom;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email.get();
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password.get();
    }

    /**
     *
     * @return
     */
    public String getExCom1() {
        return exCom1.get();
    }

    /**
     *
     * @return
     */
    public String getExCom2() {
        return exCom2.get();
    }

    /**
     *
     * @return
     */
    public String getExCom3() {
        return exCom3.get();
    }

    /**
     *
     * @return
     */
    public String getExCom4() {
        return exCom4.get();
    }

    /**
     *
     * @return
     */
    public String getEmailCom1() {
        return emailCom1.get();
    }

    /**
     *
     * @return
     */
    public String getEmailCom2() {
        return emailCom2.get();
    }

    /**
     *
     * @return
     */
    public String getEmailCom3() {
        return emailCom3.get();
    }

    /**
     *
     * @return
     */
    public String getEmailCom4() {
        return emailCom4.get();
    }
    
    public String getPassCom1() {
        return passCom1.get();
    }
    
    public String getPassCom2() {
        return passCom2.get();
    }
    
    public String getPassCom3() {
        return passCom3.get();
    }
    
    public String getPassCom4() {
        return passCom4.get();
    }
    
    public String getExComPass(int index){
        return exComPass[index];
    }
    
    //These getter methods need to be created to dynamically update the table after any operation that involves editing the database.
    
    public SimpleStringProperty nameProperty() {
        return this.name;
    }

    public SimpleIntegerProperty IDProperty() {
        return this.ID;
    }

    public SimpleStringProperty emailProperty() {
        return this.email;
    }
    
    public SimpleStringProperty dateOfRegistrationProperty() {
        return this.dateOfRegistration;
    }

    public SimpleIntegerProperty houseNoProperty() {
        return this.houseNo;
    }

    public SimpleStringProperty streetNameProperty() {
        return this.streetName;
    }

    public SimpleStringProperty districtNameProperty() {
        return this.districtName;
    }

    public SimpleIntegerProperty postcodeProperty() {
        return this.postcode;
    }

    public SimpleStringProperty provinceProperty() {
        return this.province;
    }
    
    public SimpleStringProperty chairPersonProperty() {
        return this.chairPerson;
    }

    public SimpleStringProperty passwordProperty() {
        return this.password;
    }

    public SimpleIntegerProperty exComNumProperty() {
        return this.exComNum;
    }
    
    public SimpleStringProperty exCom1Property(){
        return this.exCom1;
    }
    
    public SimpleStringProperty exCom2Property(){
        return this.exCom2;
    }
    
    public SimpleStringProperty exCom3Property(){
        return this.exCom3;
    }
    
    public SimpleStringProperty exCom4Property(){
        return this.exCom4;
    }
    
    public SimpleStringProperty emailCom1Property(){
        return this.emailCom1;
    }
    
    public SimpleStringProperty emailCom2Property(){
        return this.emailCom2;
    }
    
    public SimpleStringProperty emailCom3Property(){
        return this.emailCom3;
    }
    
    public SimpleStringProperty emailCom4Property(){
        return this.emailCom4;
    }
    
   
    public Boolean comparator(Organization other){//Method used to compare organization.
        if((this.getName().toUpperCase().equals(other.getName().toUpperCase()) && this.getID() == other.getID()) || (this.getName().toUpperCase().equals(other.getName().toUpperCase()) && this.getHouseNo() == other.getHouseNo() && this.getStreetName().toUpperCase().equals(other.getStreetName().toUpperCase()) && this.getDistrictName().toUpperCase().equals(other.getDistrictName().toUpperCase()) && this.getProvince().toUpperCase().equals(other.getProvince().toUpperCase()) && this.getDateOfRegistration().toUpperCase().equals(other.getDateOfRegistration().toUpperCase()))){
            return true;
        }
        else{
            return false;
        }
    }
}
