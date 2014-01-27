/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import com.sun.javaws.Main;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author theAJFM
 */
public class SampleController implements Initializable {//The Initializable interface is used so that we can explicitly override the initialize method that initializes several objects and intial state of the program
    
    private Boolean adminAccess;
    private String logEmail;
    private String password;
    private String userName;
    private String ID;
    private String organizationName;
    private String DOR;
    private String position;
    private ObservableList<Organization> org;
    private Organization selectedItems;
    
    @FXML//@FXML refers to the Dependency Injection that we commit towards these variables. 
    private Button home;
    
    @FXML
    private Button search;
    
    @FXML
    private Button login;
    
    @FXML
    private Button edit;
    
    @FXML
    private Button add;
    
    @FXML
    private Button searchQuery;
    
    @FXML
    private Button location;
    
    @FXML
    private TextField idField;
    
    @FXML
    private PasswordField passField;
    
    @FXML
    private TextField nameFieldSearch;
    
    @FXML
    private TextField IDFieldSearch;
    
    @FXML
    private TextField exComFieldSearch;
    
    @FXML
    private TextField dateFieldSearch;
    
    @FXML
    private Tab loginPage;
    
    @FXML
    private AnchorPane loginAnchor;

    @FXML
    private Tab tablePage;
    
    @FXML
    private AnchorPane tableAnchor;
    
    @FXML
    private Tab dashboardPage;
    
    @FXML
    private Tab searchPage;
    
    @FXML
    private Tab profPage;
    
    @FXML
    private Tab addPage;
    
    @FXML
    private Tab locationPage;
    
    @FXML
    private Tab editPage;
    
    @FXML
    private Tab provincePage;
    
    @FXML
    private AnchorPane dashboardAnchor;
    
    @FXML
    private ImageView dashboardImage;
    
    @FXML
    private ImageView panoramaImage;
    
    @FXML
    private ImageView profileImage;
    
    @FXML
    private TabPane tabPane;
    
    @FXML
    private TableView<Organization> table;
    
    @FXML
    private TableColumn<Organization, String> nameTable;
    
    @FXML
    private TableColumn<Organization, Integer> IDTable;

    @FXML
    private TableColumn<Organization, String> dateTable;
    
    @FXML
    private TableColumn<Organization, Integer> houseNoTable;
    
    @FXML
    private TableColumn<Organization, String> streetTable;
    
    @FXML
    private TableColumn<Organization, String> districtTable;
    
    @FXML
    private TableColumn<Organization, String> provinceTable;
    
    @FXML
    private TableColumn<Organization, Integer> postcodeTable;
    
    @FXML
    private TableColumn<Organization, String> chairPersonNameTable;
    
    @FXML
    private TableColumn<Organization, String> chairPersonEmailTable;
    
    @FXML
    private TableColumn<Organization, Integer> execNumTable;
    
    @FXML
    private TableColumn<Organization, String> exec1NameTable;
    
    @FXML
    private TableColumn<Organization, String> exec2NameTable;
    
    @FXML
    private TableColumn<Organization, String> exec3NameTable;
    
    @FXML
    private TableColumn<Organization, String> exec4NameTable;
    
    @FXML
    private TableColumn<Organization, String> email1Table;
    
    @FXML
    private TableColumn<Organization, String> email2Table;
    
    @FXML
    private TableColumn<Organization, String> email3Table;
    
    @FXML
    private TableColumn<Organization, String> email4Table;
    
    @FXML
    private Label positionLabel;
    
    @FXML
    private Label DORLabel;
    
    @FXML
    private Label orgLabel;
    
    @FXML
    private Label IDLabel;
    
    @FXML
    private Label userNameLabel;
    
    @FXML
    private Label warningLabel;
    
    @FXML
    private Label profName;
    
    @FXML
    private Label profID;
    
    @FXML
    private Label profChairPerson;
    
    @FXML
    private Label profDate;
    
    @FXML
    private Label profHouseNo;
    
    @FXML
    private Label profStreet;
    
    @FXML
    private Label profDistrict;
    
    @FXML
    private Label profProvince;
    
    @FXML
    private Label profPostcode;

    @FXML
    private Label profExCom1;
    
    @FXML
    private Label profExCom2;
    
    @FXML
    private Label profExCom3;
    
    @FXML
    private Label profExCom4;
    
    @FXML
    private Label errorAdd;
    
    @FXML
    private Label errorAdd2;
    
    @FXML
    private Label errorEdit;
    
    @FXML
    private Label errorEdit2;
    
    @FXML
    private Label locationResult;
    
    @FXML
    private Label searchError;
    
    @FXML
    private TextField addEmail;
    
    @FXML
    private TextField addPassword;
    
    @FXML
    private TextField addOrganizationName;
    
    @FXML
    private TextField addOrganizationID;
    
    @FXML
    private TextField addHouseNo;
    
    @FXML
    private TextField addStreetName;
    
    @FXML
    private TextField addDistrict;
    
    @FXML
    private TextField addProvince;
    
    @FXML
    private TextField addPostcode;
    
    @FXML
    private TextField addChairPersonName;
    
    @FXML
    private TextField addExCom1;
    
    @FXML
    private TextField addExCom1Pass;
    
    @FXML
    private TextField addExCom1Email;
    
    @FXML
    private TextField addExCom2;
    
    @FXML
    private TextField addExCom2Pass;
    
    @FXML
    private TextField addExCom2Email;
    
    @FXML
    private TextField addExCom3;
    
    @FXML
    private TextField addExCom3Pass;
    
    @FXML
    private TextField addExCom3Email;
    
    @FXML
    private TextField addExCom4;
    
    @FXML
    private TextField addExCom4Pass;
    
    @FXML
    private TextField addExCom4Email;
    
    @FXML
    private TextField editEmail;
    
    @FXML
    private TextField editPassword;
    
    @FXML
    private TextField editOrganizationName;
    
    @FXML
    private TextField editOrganizationID;
    
    @FXML
    private TextField editHouseNo;
    
    @FXML
    private TextField editStreetName;
    
    @FXML
    private TextField editDistrict;
    
    @FXML
    private TextField editProvince;
    
    @FXML
    private TextField editPostcode;
    
    @FXML
    private TextField editChairPersonName;
    
    @FXML
    private TextField editExCom1;
    
    @FXML
    private TextField editExCom1Pass;
    
    @FXML
    private TextField editExCom1Email;
    
    @FXML
    private TextField editExCom2;
    
    @FXML
    private TextField editExCom2Pass;
    
    @FXML
    private TextField editExCom2Email;
    
    @FXML
    private TextField editExCom3;
    
    @FXML
    private TextField editExCom3Pass;
    
    @FXML
    private TextField editExCom3Email;
    
    @FXML
    private TextField editExCom4;
    
    @FXML
    private TextField editExCom4Pass;
    
    @FXML
    private TextField editExCom4Email;
    
    @FXML
    private TextField searchLocation;
    
    @FXML
    private ListView provinceList;
    
    @FXML
    private ListView amountList;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
    @FXML
    private void handleLoginAction(ActionEvent event) {//Event handler to handle login actions
        Boolean flag = false;
        logEmail = idField.getText();
        password = passField.getText();
        if(logEmail.equals("admin@db.org")){//Admin email name, use any string of character to bypass the password.(As of now it's not determined yet)
            adminAccess = true;
            flag = true;
            allowAccess();
        }
        else{//If the email is found to be not of admin, the email and password needs to be in the database.
            adminAccess = false;
            for(Organization i:org){
                if(i.getEmail().equals(logEmail)){// In this snippet, the one who logs in happens to be the chairperson of the organization.
                    if(i.getPassword().equals(password)){
                        organizationName = i.getName().toUpperCase();
                        DOR = i.getDateOfRegistration().toUpperCase();
                        position = "CHAIRPERSON";
                        userName = i.getChairPerson().toUpperCase();
                        ID = String.valueOf(i.getID());
                        allowAccess();//Method for handling features that can be accessed according to the type of user.
                        flag = true;
                        dashboardGenerate();//Generate the dashboard within the program.
                        break;
                    }
                }
                else{//On the other hand, this one is meant to handle executive commitee login.
                    Map<String, List<String>> exComTemp = i.getExCom();
                    if(exComTemp.containsKey(logEmail)){
                        if(exComTemp.get(logEmail).get(1).equals(password)){
                            organizationName = i.getName().toUpperCase();
                            DOR = i.getDateOfRegistration().toUpperCase();
                            position = "EXECUTIVE MEMBER";
                            userName = exComTemp.get(logEmail).get(0);
                            ID = String.valueOf(i.getID());
                            allowAccess();
                            flag = true;
                            dashboardGenerate();
                            break;    
                        }
                    }
                }
            }
        }
        if(flag == false){//If the password or the email doesn't match any query in thedatabase, warning signs will be displayed.
            idField.setText("");
            passField.setText("");
            warningLabel.setVisible(true);
        }
        add.setDisable(!adminAccess);
    }
    
    @FXML
    private void handleHomeAction(ActionEvent event){//Event handler for the button used to navigate to the home page.
        tabPane.getSelectionModel().select(dashboardPage);//The tab will select the page desired.
    }
    
    @FXML
    private void handleSearchAction(ActionEvent event){//Event handler for the button used to navigate to the search page.
        tabPane.getSelectionModel().select(searchPage);//The tab will select the page desired.
    }
    
    @FXML
    private void handleLocationAction(ActionEvent event){//Event handler for the button used to navigate to the location page.
        tabPane.getSelectionModel().select(provincePage);//The tab will select the page desired.
    }
    
    @FXML
    private void handleSearchQuery(ActionEvent event){
        ObservableList<Organization> searchResult = FXCollections.observableArrayList();//The container used by javafx to populate the database. Works just like a regular ArrayList from the java library. In this case, this is just a container that holds the search result,
        String nameInput = nameFieldSearch.getText().toLowerCase();//Every search needs to be lowercased, as the search needs to ignore cases.
        String IDInput = IDFieldSearch.getText();
        String execComInput = exComFieldSearch.getText().toLowerCase();
        String dateInput = dateFieldSearch.getText();
        for(Organization i:org){
            Boolean nameChecker = (i.getName().toLowerCase().equals(nameInput)||nameInput.equals(""))?true:false;//Shorter if statements for code length purpose
            Boolean IDChecker = (String.valueOf(i.getID()).equals(IDInput)|| IDInput.equals(""))?true:false;
            Boolean exChecker = (i.getExCom1().toLowerCase().equals(execComInput) || i.getExCom2().toLowerCase().equals(execComInput) || i.getExCom3().toLowerCase().equals(execComInput) || i.getExCom4().toLowerCase().equals(execComInput) || execComInput.equals(""))?true:false;
            Boolean dateChecker = checkDate(dateInput, i.getDateOfRegistration());//The date checking needs to be put in other method, that return a Boolean value.
            if(dateChecker == null){
                searchError.setVisible(true);
                break;
            }
            else{
                searchError.setVisible(false);
            }
            if((nameChecker && IDChecker && exChecker && dateChecker) == true){//The search query will add to the container the organizations that match all the conditions
                searchResult.add(i);
            }
        }
        edit.setDisable(!adminAccess);//Edit options access will be determined according to the admin access status.
        tabPane.getTabs().remove(tablePage);//The table page needs to be refreshed by removing and adding back the page.
        populateTable(searchResult);
        tabPane.getTabs().add(tablePage);
        tabPane.getSelectionModel().select(tablePage);
    }
    
    private void handleProvince(){
        ObservableList<String> Result = FXCollections.observableArrayList();//The container is used to hold the provinces in the database.
        ObservableList<Integer> ResultAmount = FXCollections.observableArrayList();//This container is adjacent to the container above. It shows the number of organizations in each province.
        for(Organization i:org){
            if(Result.isEmpty()){//If our current Result container is still empty, the organization province will immediately be added without condition checking.
                Result.add(i.getProvince());
                ResultAmount.add(1);
            }
            else{
                if(Result.contains(i.getProvince())){//If the province is found in the container,
                    int index = Result.indexOf(i.getProvince());//The index of the found province will be added.
                    int temp = ResultAmount.get(index);//The variable holds the current number of the organization in the province/
                    temp++;//The number will then be incremented by 1.
                    ResultAmount.set(index, temp);//The said province's value will be edited.
                }
                else{
                    Result.add(i.getProvince());//The province will be added, if it isn't available in the Result container.
                    ResultAmount.add(1);
                }
            }
        }
        
        provinceList.setItems(Result);
        amountList.setItems(ResultAmount);
    }
    
    @FXML
    private void handleLocationSearch(ActionEvent event){//Additional feature to find the number of organization in a province.
        int count = 0;
        if(searchLocation.getText().equals("")){
            locationResult.setText("");
        }
        else{
            for(Organization i:org){
                if(i.getProvince().toUpperCase().equals(searchLocation.getText().toUpperCase())){
                    count++;
                }
            }
            locationResult.setText(String.valueOf(count));
        }
    }
    
    @FXML
    private void handleProfileViewing(ActionEvent event){//Event handler to view a selected organization.
        selectedItems = table.getSelectionModel().getSelectedItem();//Get the selected items and store it in an Organization obect.
        if(selectedItems != null){//Get all of the information in the Organization, if and only there is a data selected.
            profPage.setText(selectedItems.getName());
            profName.setText(selectedItems.getName());
            profID.setText(String.valueOf(selectedItems.getID()));
            profDate.setText(selectedItems.getDateOfRegistration());
            profChairPerson.setText(selectedItems.getChairPerson());
            profStreet.setText(selectedItems.getStreetName());
            profHouseNo.setText("No." + String.valueOf(selectedItems.getHouseNo()));
            profDistrict.setText(selectedItems.getDistrictName());
            profProvince.setText(selectedItems.getProvince());
            profPostcode.setText(String.valueOf(selectedItems.getPostcode()));
            profExCom1.setText(selectedItems.getExCom1());
            profExCom2.setText(selectedItems.getExCom2());
            profExCom3.setText(selectedItems.getExCom3());
            profExCom4.setText(selectedItems.getExCom4());
            tabPane.getTabs().remove(profPage);//The page needs to be refreshed when a new data is loaded before this instance of call.
            tabPane.getTabs().add(profPage);
            try{//If the profile does have an image within the program's folder, use the image to represent the organization profile.
                Image img = new Image(SampleController.class.getResourceAsStream("user-components/"+ profID.getText() +"/org.jpg"));
                profileImage.setImage(img);
            }
            catch(NullPointerException e){//Else, use a default image to represent the organization profile.
                Image img = new Image(SampleController.class.getResourceAsStream("user-components/default.png"));
                profileImage.setImage(img);
            }
        }
        else{
            //Happens when no organization in the table is selected. Do nothing when such case happens.
        }
    }
    
    @FXML
    private void handleEdit(ActionEvent event){//Event handler when an organization is selected from the table to be edited.
        selectedItems = table.getSelectionModel().getSelectedItem();//Like viewing the organization profile, the selected organization will be stored in a temporary organization object. 
        if(selectedItems != null){//Same like viewing organization. Only works when an organization is selected.
            editEmail.setText(selectedItems.getEmail());
            editPassword.setText(selectedItems.getPassword());
            editOrganizationName.setText(selectedItems.getName());
            editOrganizationID.setText(String.valueOf(selectedItems.getID()));
            editChairPersonName.setText(selectedItems.getChairPerson());
            editStreetName.setText(selectedItems.getStreetName());
            editHouseNo.setText(String.valueOf(selectedItems.getHouseNo()));
            editDistrict.setText(selectedItems.getDistrictName());
            editProvince.setText(selectedItems.getProvince());
            editPostcode.setText(String.valueOf(selectedItems.getPostcode()));
            editExCom1.setText(selectedItems.getExCom1());
            editExCom2.setText(selectedItems.getExCom2());
            editExCom3.setText(selectedItems.getExCom3());
            editExCom4.setText(selectedItems.getExCom4());
            editExCom1Email.setText(selectedItems.getEmailCom1());
            editExCom2Email.setText(selectedItems.getEmailCom2());
            editExCom3Email.setText(selectedItems.getEmailCom3());
            editExCom4Email.setText(selectedItems.getEmailCom4());
            editExCom1Pass.setText(selectedItems.getExComPass(0));
            editExCom2Pass.setText(selectedItems.getExComPass(1));
            editExCom3Pass.setText(selectedItems.getExComPass(2));
            editExCom4Pass.setText(selectedItems.getExComPass(3));
            tabPane.getTabs().remove(editPage);
            tabPane.getTabs().add(editPage);
        }
    }
    
    @FXML
    private void handleAddAction(ActionEvent event){//An event handler used to navigate to the add page.
        tabPane.getSelectionModel().select(addPage);
    }
    
    @FXML
    private void addOrganization(ActionEvent event){//An event handler to add a new organization to the database.
        errorAdd.setVisible(false);//Error warnings will be set to invisible first.
        errorAdd2.setVisible(false);
        String name, streetName, districtName, province, chairPerson, email, pass, ID, houseNo, postcode;//Variables to store the values in the fields.
        int exComNum = 0;//Integer to keep track of the number of executive commitees given in the field.
        String dateOfRegistration;
        Map<String, List<String>> exCom = new LinkedHashMap<String, List<String>>();//LinkedHashMap of the executive commitees
        name = addOrganizationName.getText();//Getting all of the information in the fields.
        streetName = addStreetName.getText();
        districtName = addDistrict.getText();
        province = addProvince.getText();
        chairPerson = addChairPersonName.getText();
        email = addEmail.getText();
        pass = addPassword.getText();
        ID = addOrganizationID.getText();
        houseNo = addHouseNo.getText();
        postcode = addPostcode.getText();
        
        if(addExCom1.getText().equals("") == false){//Checking the name of the executive commitees, if the name is empty, the system will not add the information in the field.
            List<String> exInfo = new ArrayList<String>();
            System.out.println(1);
            exInfo.add(addExCom1.getText());
            exInfo.add(addExCom1Pass.getText());
            exCom.put(addExCom1Email.getText(), exInfo);
            exComNum++;
        }
        else{
            List<String> exInfo = new ArrayList<String>();
            exInfo.add("");
            exInfo.add("");
            exCom.put("", exInfo);
        }
        if(addExCom2.getText().equals("") == false){
            List<String> exInfo = new ArrayList<String>();
            System.out.println(2);
            exInfo.add(addExCom2.getText());
            exInfo.add(addExCom2Pass.getText());
            exCom.put(addExCom2Email.getText(), exInfo);
            exComNum++;
        }
        else{
            List<String> exInfo = new ArrayList<String>();
            exInfo.add("");
            exInfo.add("");
            exCom.put("", exInfo);
        }
        if(addExCom3.getText().equals("") == false){
            List<String> exInfo = new ArrayList<String>();
            exInfo.add(addExCom3.getText());
            exInfo.add(addExCom3Pass.getText());
            exCom.put(addExCom3Email.getText(), exInfo);
            exComNum++;
        }
        else{
            List<String> exInfo = new ArrayList<String>();
            exInfo.add("");
            exInfo.add("");
            exCom.put("", exInfo);
        }
        if(addExCom4.getText().equals("") == false){
            List<String> exInfo = new ArrayList<String>();
            exInfo.add(addExCom4.getText());
            exInfo.add(addExCom4Pass.getText());
            exCom.put(addExCom4Email.getText(), exInfo);
            exComNum++;
        }
        else{
            List<String> exInfo = new ArrayList<String>();
            exInfo.add("");
            exInfo.add("");
            exCom.put("", exInfo);
        }
        DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");//Date field is not supplied, instead the date of the registration will be determined acccording to the system's time. 
        Calendar cal = Calendar.getInstance();
        dateOfRegistration = dateFormat.format(cal.getTime());
        if(name.equals("") || ID.equals("") || ID.length() != 3 || postcode.length() != 5 || houseNo.equals("") || streetName.equals("") || districtName.equals("") || province.equals("") || postcode.equals("") || chairPerson.equals("")){//If any of these fields doesn't match, the add will terminate the operation and show an error message.
            errorAdd.setVisible(true);
            errorAdd2.setVisible(true);
            return;
        }
        try{//Adding the information of the organization to the database.
            Organization temp = new Organization(name, Integer.parseInt(ID), dateOfRegistration, Integer.parseInt(houseNo), streetName, districtName, province, Integer.parseInt(postcode), chairPerson, email, pass, exComNum, exCom);
            for(Organization i:org){
                if(i.comparator(temp) == true){
                    errorAdd.setVisible(true);
                    errorAdd2.setVisible(true);
                    return;
                }
            }
            org.add(temp);
            fileSave();//Save the information to a file everytime a new organization is added.
            addOrganizationName.setText("");//Set all of the fields to blank texts, after succesful addition.
            addStreetName.setText("");
            addDistrict.setText("");
            addProvince.setText("");
            addChairPersonName.setText("");
            addEmail.setText("");
            addPassword.setText("");
            addOrganizationID.setText("");
            addHouseNo.setText("");
            addPostcode.setText("");
            addExCom1.setText("");
            addExCom1Pass.setText("");
            addExCom1Email.setText("");
            addExCom2.setText("");
            addExCom2Pass.setText("");
            addExCom2Email.setText("");
            addExCom3.setText("");
            addExCom3Pass.setText("");
            addExCom3Email.setText("");
            addExCom4.setText("");
            addExCom4Pass.setText("");
            addExCom4Email.setText("");
            handleProvince();//Update the information of the province.
            tabPane.getTabs().add(tablePage);//Refresh the contents of the table.
            tabPane.getSelectionModel().select(tablePage);
        }
        catch(NumberFormatException e){//Catch exception when there is a number format exception.
            errorAdd.setVisible(true);
            errorAdd2.setVisible(true);
        }
        
    }
    
    @FXML
    private void editOrganization(ActionEvent event){//Event handler to a particular organization.
        errorEdit.setVisible(false);//Error warnings will be set to invisible first.
        errorEdit2.setVisible(false);
        String name, streetName, districtName, province, chairPerson, email, pass, ID, houseNo, postcode, exCom1, exCom2, exCom3, exCom4, emailCom1, emailCom2, emailCom3, emailCom4, passCom1, passCom2, passCom3, passCom4;//Variables are pretty much the same like the addition operation.
        int exComNum = 0;
        name = editOrganizationName.getText();
        streetName = editStreetName.getText();
        districtName = editDistrict.getText();
        province = editProvince.getText();
        chairPerson = editChairPersonName.getText();
        email = editEmail.getText();
        pass = editPassword.getText();
        ID = editOrganizationID.getText();
        houseNo = editHouseNo.getText();
        postcode = editPostcode.getText();
        
        if(editExCom1.getText().equals("") == false){
            exCom1 = editExCom1.getText();
            passCom1 = editExCom1Pass.getText();
            emailCom1 = editExCom1Email.getText();
            exComNum++;
        }
        else{
            exCom1 = "";
            passCom1 = "";
            emailCom1 = "";
        }
        if(editExCom2.getText().equals("") == false){
            exCom2 = editExCom2.getText();
            passCom2 = editExCom2Pass.getText();
            emailCom2 = editExCom2Email.getText();
            exComNum++;
        }
        else{
            exCom2 = "";
            passCom2 = "";
            emailCom2 = "";
        }
        if(editExCom3.getText().equals("") == false){
            exCom3 = editExCom3.getText();
            passCom3 = editExCom3Pass.getText();
            emailCom3 = editExCom3Email.getText();
            exComNum++;
        }
        else{
            exCom3 = "";
            passCom3 = "";
            emailCom3 = "";
        }
        if(editExCom4.getText().equals("") == false){
            exCom4 = editExCom4.getText();
            passCom4 = editExCom4Pass.getText();
            emailCom4 = editExCom4Email.getText();
            exComNum++;
        }
        else{
            exCom4 = "";
            passCom4 = "";
            emailCom4 = "";
        }
        if(name.equals("") || ID.equals("") || ID.length() != 3 || postcode.length() != 5 || houseNo.equals("") || streetName.equals("") || districtName.equals("") || province.equals("") || postcode.equals("") || chairPerson.equals("")){
            errorEdit.setVisible(true);//Error handling is also similar to the addition operation.
            errorEdit2.setVisible(true);
            return;
        }
        try{//Using setter methods to edit the information of the organization.
                    selectedItems.setName(name);
                    selectedItems.setID(Integer.parseInt(ID));
                    selectedItems.setStreetName(streetName);
                    selectedItems.setHouseNo(Integer.parseInt(houseNo));
                    selectedItems.setDistrictName(districtName);
                    selectedItems.setEmail(email);
                    selectedItems.setPassword(pass);
                    selectedItems.setProvince(province);
                    selectedItems.setPostcode(Integer.parseInt(postcode));
                    selectedItems.setExCom1(exCom1);
                    selectedItems.setExCom2(exCom2);
                    selectedItems.setExCom3(exCom3);
                    selectedItems.setExCom4(exCom4);
                    selectedItems.setEmailCom1(emailCom1);
                    selectedItems.setEmailCom2(emailCom2);
                    selectedItems.setEmailCom3(emailCom3);
                    selectedItems.setEmailCom4(emailCom4);
                    selectedItems.setPassCom1(passCom1);
                    selectedItems.setPassCom2(passCom2);
                    selectedItems.setPassCom3(passCom3);
                    selectedItems.setPassCom4(passCom4);
                    selectedItems.setExComNum(exComNum);
                    selectedItems.setChairPerson(chairPerson);
                    fileSave();//Save the information everytime an organization is succesfully edited.
                    handleProvince();//Update the information of the province
                    tabPane.getTabs().remove(editPage);//Refresh the contents of the table.
                    tabPane.getSelectionModel().select(tablePage);
                    
        }
        catch(NumberFormatException e){//Catch the number format exception.
            errorEdit.setVisible(true);
            errorEdit2.setVisible(true);
            
        }
        
    }
    
    private void fileOpen(){//Opening file for loading the database.
        String temp, name, streetName, districtName, province, chairPerson, email, pass;
        int ID, houseNo, postcode, exComNum;//Variables to get the store the values in the file.
        String dateOfRegistration;
        Map<String, List<String>> exCom = new LinkedHashMap<String, List<String>>();//Temporary LinkedHashMap for executive commitees information.
        
        try{
            Scanner FileAccess = new Scanner(SampleController.class.getResourceAsStream("database/DB.txt"));//Using relative path so that the program does not depend on the absolute path of the file, and can be used in any environment.       
                while(FileAccess.hasNextLine()){//Reading the file line by line
                    name = FileAccess.nextLine();
                    ID = FileAccess.nextInt();
                    dateOfRegistration = FileAccess.next();
                    houseNo = FileAccess.nextInt();
                    temp = FileAccess.nextLine();
                    streetName = FileAccess.nextLine();
                    districtName = FileAccess.nextLine();
                    province = FileAccess.nextLine();
                    postcode = FileAccess.nextInt();
                    temp = FileAccess.nextLine();
                    chairPerson = FileAccess.nextLine();
                    email = FileAccess.next();
                    pass = FileAccess.next();
                    exComNum = FileAccess.nextInt();
                    
                    if(exComNum == 0){//Handling executive commitees in the file.
                        if(FileAccess.hasNextLine()){
                            temp = FileAccess.nextLine();
                        }
                        exCom = new LinkedHashMap<String, List<String>>();
                        org.add(new Organization(name, ID, dateOfRegistration, houseNo, streetName, districtName, province, postcode, chairPerson, email, pass, exComNum, exCom));
                        continue;
                    }
                    
                    else{
                        exCom = new LinkedHashMap<String, List<String>>();
                        for(int i = 0;i < exComNum;i++){
                            temp = FileAccess.nextLine();
                            String exName = FileAccess.nextLine();
                            String exEmail = FileAccess.next();
                            String exPass = FileAccess.next();
                            List<String> exInfo = new ArrayList<String>();
                            exInfo.add(exName);
                            exInfo.add(exPass);
                            exCom.put(exEmail, exInfo);
                        }
                    }
                    temp = FileAccess.nextLine();
                    org.add(new Organization(name, ID, dateOfRegistration, houseNo, streetName, districtName, province, postcode, chairPerson, email, pass, exComNum, exCom));//Add a new Organization to the global observable list that is used to populate the table.
                }
        }
        catch(NullPointerException e){//Catch exception when the file is missing.
            System.out.println("FileNotFound");
	}
    }
    
    private void StudentInfo(){//Method that show the information of our team.
        System.out.println("Febryan Margali - 1601249835");
        System.out.println("Zunio Benarrivo - 1601263184");
        System.out.println("Tutor: Rickie Wongso Chandra");
        System.out.println("Tutor Time: Thurdsay, 16.30 - 18.30");
    }
    
    private void fileSave(){//Method to save the file
        try{
        FileWriter fstream = new FileWriter("./src/finalproject/database/DB.txt");//This also uses relative path
        BufferedWriter out = new BufferedWriter(fstream);
        for(Organization i:org){//Looping through the file to add to the file.
            out.write(i.getName());
            out.newLine();
            out.write(String.valueOf(i.getID()));
            out.newLine();
            out.write(i.getDateOfRegistration());
            out.newLine();
            out.write(String.valueOf(i.getHouseNo()));
            out.newLine();
            out.write(i.getStreetName());
            out.newLine();
            out.write(i.getDistrictName());
            out.newLine();
            out.write(i.getProvince());
            out.newLine();
            out.write(String.valueOf(i.getPostcode()));
            out.newLine();
            out.write(i.getChairPerson());
            out.newLine();
            out.write(i.getEmail());
            out.newLine();
            out.write(i.getPassword());
            out.newLine();
            out.write(String.valueOf(i.getExComNum()));
            out.newLine();
            if(i.getExCom1().equals("") == false){
                out.write(i.getExCom1());
                out.newLine();
                out.write(i.getEmailCom1());
                out.newLine();
                out.write(i.getPassCom1());
                out.newLine();
            }
            if(i.getExCom2().equals("") == false){
                out.write(i.getExCom2());
                out.newLine();
                out.write(i.getEmailCom2());
                out.newLine();
                out.write(i.getPassCom2());
                out.newLine();
            }
            if(i.getExCom3().equals("") == false){
                out.write(i.getExCom3());
                out.newLine();
                out.write(i.getEmailCom3());
                out.newLine();
                out.write(i.getPassCom3());
                out.newLine();
            }
            if(i.getExCom4().equals("") == false){
                out.write(i.getExCom4());
                out.newLine();
                out.write(i.getEmailCom4());
                out.newLine();
                out.write(i.getPassCom4());
                out.newLine();
            }
        }
        out.close();
        }
        catch(IOException e){//When there is an input exception, catch
            
        }

    }
    
    private void populateTable(ObservableList<Organization> tableOut){//A method to set the value factory of the tables.
        nameTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("name"));
        IDTable.setCellValueFactory(new PropertyValueFactory<Organization,Integer>("ID"));
        dateTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("dateOfRegistration"));
        houseNoTable.setCellValueFactory(new PropertyValueFactory<Organization,Integer>("houseNo"));
        streetTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("streetName"));
        districtTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("districtName"));
        provinceTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("province"));
        postcodeTable.setCellValueFactory(new PropertyValueFactory<Organization,Integer>("postcode"));
        chairPersonNameTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("chairPerson"));
        chairPersonEmailTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("email"));
        execNumTable.setCellValueFactory(new PropertyValueFactory<Organization,Integer>("exComNum"));
        exec1NameTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("exCom1"));
        exec2NameTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("exCom2"));
        exec3NameTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("exCom3"));
        exec4NameTable.setCellValueFactory(new PropertyValueFactory<Organization,String>("exCom4"));
        email1Table.setCellValueFactory(new PropertyValueFactory<Organization,String>("emailCom1"));
        email2Table.setCellValueFactory(new PropertyValueFactory<Organization,String>("emailCom2"));
        email3Table.setCellValueFactory(new PropertyValueFactory<Organization,String>("emailCom3"));
        email4Table.setCellValueFactory(new PropertyValueFactory<Organization,String>("emailCom4"));
        table.setItems(tableOut);
        
    }
    
    private void dashboardGenerate(){//Generating the dashboard of the user of the program.
        userNameLabel.setText(userName);
        IDLabel.setText("ID:" + ID);
        orgLabel.setText(organizationName);
        DORLabel.setText(DOR);
        positionLabel.setText(position);
        
        Image img;
        try{
            img = new Image(SampleController.class.getResourceAsStream("user-components/"+ ID +"/profile.jpg"));//When an image is available to represent the user, the image is loaded.
            dashboardImage.setImage(img);
        }
        catch(NullPointerException e){
                img = new Image(SampleController.class.getResourceAsStream("user-components/default.png"));//If not, load a default image to the program.
                dashboardImage.setImage(img);
        }
        Image img2;
        try{
            img2 = new Image(SampleController.class.getResourceAsStream("user-components/"+ ID +"/panorama.jpg"));
            panoramaImage.setImage(img2);
        }
        catch(NullPointerException e){
                img = new Image(SampleController.class.getResourceAsStream("user-components/panorama.jpg"));
                dashboardImage.setImage(img);
        }
    }
    
    private void allowAccess(){//Set which features that can be accessed by a particular user.
        search.setDisable(false);
        location.setDisable(false);
        tablePage.setDisable(false);
        provincePage.setDisable(false);
        dashboardPage.setDisable(false);
        searchPage.setDisable(false);
        profPage.setDisable(false);
        locationPage.setDisable(false);
        editPage.setDisable(false);
        addPage.setDisable(!adminAccess);
        tabPane.getTabs().remove(loginPage);
    }
    
    private Boolean checkDate(String searchDate, String Date){//Date checking using reqular expression.
        if(searchDate.equals("")){
            return true;   
        }
        try{
            Pattern pattern = Pattern.compile("([1-9]|[12][0-9]|3[01])-([1-9]|1[012])-([0-9]{4})");//Pattern that matches the dd-m-yyyy pattern.
        
            Matcher match = pattern.matcher(searchDate);
            match.matches();
            match.groupCount();
            int searchDay = Integer.parseInt(match.group(1));//Capturing the information of the given pattern.
            int searchMonth = Integer.parseInt(match.group(2));
            int searchYear = Integer.parseInt(match.group(3));
        
            match = pattern.matcher(Date);
            match.matches();
            match.groupCount();
            int day = Integer.parseInt(match.group(1));
            int month = Integer.parseInt(match.group(2));
            int year = Integer.parseInt(match.group(3));
        
            if(year > searchYear || (year == searchYear && month > searchMonth) || (year == searchYear && month == searchMonth && day > searchDay)){//If the condition matches, return true
                return true;
            }
            
            else{
                return false;
            }
        }
        catch(IllegalStateException e){
            return null;
        }
    } 
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Initialize everything when the program is first run.
        tabPane.getTabs().remove(tablePage);
        tabPane.getTabs().remove(profPage);
        tabPane.getTabs().remove(editPage);
        org = FXCollections.observableArrayList();
        fileOpen();
        StudentInfo();
        handleProvince();
        populateTable(org);
    }    
}
