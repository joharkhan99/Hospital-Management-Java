import java.util.*;
import java.io.*;

class Staff{
    String staffName,staffId, designation,gender;
    int salary;
    void new_staff(){
        Scanner input=new Scanner(System.in);
        System.out.print("Id: ");
        staffId=input.nextLine();
        System.out.print("Name: ");
        staffName=input.nextLine();
        System.out.print("Designation: ");
        designation=input.nextLine();
        System.out.print("Gender: ");
        gender=input.nextLine();
        System.out.print("Salary: ");
        salary=input.nextInt();}
    void staff_info(){
        System.out.println(staffId+"\t\t"+staffName+"\t\t"+gender+"\t\t"+salary);}
}

class Doctor{
    String docId,docName,gender,specialist,appoint,docQualif;
    int docRoom;
    void new_doctor(){
        Scanner input=new Scanner(System.in);
        System.out.print("Id: ");
        docId=input.nextLine();
        System.out.print("Name(Dr.xxx): ");
        docName=input.nextLine();
        System.out.print("Gender: ");
        gender=input.nextLine();
        System.out.print("Specialist(length>7): ");
        specialist=input.nextLine();
        System.out.print("Work Hours: ");
        appoint=input.nextLine();
        System.out.print("Qualification: ");
        docQualif=input.nextLine();
        System.out.print("Room No: ");
        docRoom=input.nextInt();}
    void doctor_info(){
        System.out.println(docId+"\t"+docName+"\t"+docRoom+"\t"+appoint+"\t"+specialist+"\t"+docQualif);}
}

class Patient{
    String patId,patName,disease,gender,admit;
    int age;
    void new_patient(){
        Scanner input=new Scanner(System.in);
        System.out.print("Id: ");
        patId=input.nextLine();
        System.out.print("Name(length>9): ");
        patName=input.nextLine();
        System.out.print("Disease: ");
        disease=input.nextLine();
        System.out.print("Gender: ");
        gender=input.nextLine();
        System.out.print("Status: ");
        admit=input.nextLine();
        System.out.print("Age: ");
        age=input.nextInt();}
    void patient_info(){
        System.out.println(patId+"\t"+patName+"\t"+age+"\t"+gender+"\t"+disease+"\t\t"+admit);}
}

class Medicines{
    String medName,medComp,expDate;
    int medCost;
    void new_medicine(){
        Scanner input=new Scanner(System.in);
        System.out.print("Name(length>9): ");
        medName=input.nextLine();
        System.out.print("Company Name: ");
        medComp=input.nextLine();
        System.out.print("Expiry Date(dd/mm/yyyy): ");
        expDate=input.nextLine();
        System.out.print("Cost: ");
        medCost=input.nextInt();}
    void medicine_list(){
        System.out.println(medName+"\t\t"+expDate+"\t"+medCost+"\t"+medComp);}
}

class Lab{
    String labName;int labCost;
    void new_lab(){
        Scanner input =new Scanner(System.in);
        System.out.print("Lab Name(length>9): ");
        labName=input.nextLine();
        System.out.print("Total Cost: ");
        labCost=input.nextInt();}
    void labs_list(){
        System.out.println(labName+"\t\t"+labCost);}
}

class Facility{
    String name;
    void add_facility(){
        Scanner input=new Scanner(System.in);
        System.out.print("Facility: ");
        name=input.nextLine();}
    void show_facility(){
        System.out.println(name);}
}

        //MAIN  METHOD
public class HospitalManagement {
    public static void main(String[] args) {
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul",
            "Aug","Sep","Oct","Nov","Dec"};
    Date currDat=new Date();   //for curr time
    int count1=4,count2=4,count3=4,count4=4,count5=4,count6=4;
    System.out.println(".................................................");
    System.out.println("\t Hospital Management In Java");
    System.out.println(".................................................");
    System.out.print("Date: "+currDat.getDate()+" "+months[currDat.getMonth()]+" "+(currDat.getYear()+1900));
    System.out.print("\t\tTime: "+(currDat.getHours()-12)+":"+currDat.getMinutes()+":"+currDat.getSeconds()+"\n");

    Doctor[] doc=new Doctor[30];
    Patient[] pat=new Patient[100];
    Lab[] lab=new Lab[15];
    Facility[] fac=new Facility[20];
    Medicines[] med=new Medicines[100];
    Staff[] staff=new Staff[50];
    for(int i=0;i<30;i++){
        doc[i]=new Doctor();}
    for(int i=0;i<100;i++){
        pat[i]=new Patient();}
    for(int i=0;i<15;i++){
        lab[i]=new Lab();}
    for(int i=0;i<20;i++){
        fac[i]=new Facility();}
    for(int i=0;i<100;i++){
        med[i]=new Medicines();}
    for(int i=0;i<50;i++){
        staff[i]=new Staff();}
    
    doc[0].docId="015";
    doc[0].docName="Dr.Ghani";
    doc[0].specialist="Cardiology";
    doc[0].appoint="12-6PM";
    doc[0].docQualif="MBBS,BDS";
    doc[0].gender="Male";
    doc[0].docRoom=5;
    doc[1].docId="019";
    doc[1].docName="Dr.Mujeeb";
    doc[1].specialist="Neurologist";
    doc[1].appoint="5-8PM";
    doc[1].docQualif="MBBS";
    doc[1].gender="Male";
    doc[1].docRoom=21;
    doc[2].docId="090";
    doc[2].docName="Dr.Ismail";
    doc[2].specialist="Surgeon   ";
    doc[2].appoint="10-12PM";
    doc[2].docQualif="MBBS,BDS,MD";
    doc[2].gender="Male";
    doc[2].docRoom=17;
    doc[3].docId="010";
    doc[3].docName="Dr.Shumaila";
    doc[3].specialist="Arthologist";
    doc[3].appoint="5-8AM";
    doc[3].docQualif="BDM,MS";
    doc[3].gender="Female";
    doc[3].docRoom=3;
    
    pat[0].patId = "111";
    pat[0].patName = "Ahmad Riaz";
    pat[0].disease = "Cancer";
    pat[0].gender = "Male";
    pat[0].admit = "yes";
    pat[0].age = 23;
    pat[1].patId = "113";
    pat[1].patName = "Fatima Shahid";
    pat[1].disease = "Asthama";
    pat[1].gender = "Female";
    pat[1].admit = "yes";
    pat[1].age = 17;
    pat[2].patId = "100";
    pat[2].patName = "Umair Naveed";
    pat[2].disease = "Fever";
    pat[2].gender = "Male";
    pat[2].admit = "yes";
    pat[2].age = 40;
    pat[3].patId = "010";
    pat[3].patName = "Mohsin Khan";
    pat[3].disease = "Diabete";
    pat[3].gender = "Male";
    pat[3].admit = "yes";
    pat[3].age = 10;
    
    med[0].medName="Aspirin-D";
    med[0].medComp="Clino pvt";
    med[0].expDate="12/1/2021";
    med[0].medCost=350;
    med[1].medName="Oxycodon";
    med[1].medComp="Purdue Pharma";
    med[1].expDate="2/12/2020";
    med[1].medCost=1000;
    med[2].medName="Zoloftoo";
    med[2].medComp="Pfizer Company";
    med[2].expDate="4/6/2024";
    med[2].medCost=780;
    med[3].medName="Pantopra";
    med[3].medComp="Protonix Company";
    med[3].expDate="5/9/2023";
    med[3].medCost=1090;
    
    lab[0].labName="Blood Bank";
    lab[0].labCost=60;
    lab[1].labName="CT Scanner";
    lab[1].labCost=2000;
    lab[2].labName="Testing Lab";
    lab[2].labCost=500;
    lab[3].labName="OPD deptart";
    lab[3].labCost=30;
    
    fac[0].name="Canteen";
    fac[1].name="Ambulance dept.";
    fac[2].name="Emergency";
    fac[3].name="Nursing Homes";
    
    staff[0].staffId="1050";
    staff[0].staffName="Amir Sohail";
    staff[0].designation="Worker";
    staff[0].gender="Male";
    staff[0].salary=20000;
    staff[1].staffId="5404";
    staff[1].staffName="Mona Khan";
    staff[1].designation="Nurse";
    staff[1].gender="Female";
    staff[1].salary=50000;
    staff[2].staffId="430";
    staff[2].staffName="Sajida Bibi";
    staff[2].designation="Nurse";
    staff[2].gender="Female";
    staff[2].salary=45000;
    staff[3].staffId="107";
    staff[3].staffName="Saeed Ahmad";
    staff[3].designation="Worker";
    staff[3].gender="Male"; 
    staff[3].salary=10000;
    
    Scanner inp=new Scanner(System.in);
    int choice,c1;
    int status=1,s1=1,s2=1,s3=1,s4=1,s5=1,s6=1;
    
    while(status==1){
        System.out.println("\n\t\t Main Menu");
        System.out.println(".................................................");
        System.out.println("\t   1.Doctors \t2.Patients \n\t   3.Medicines \t4.Labs \n\t   5.Facility \t6.Staff\n");
        
        System.out.print("Enter Any Choice (1-6): ");
        choice=inp.nextInt();
        switch(choice){
            case 1: {
                System.out.println("\t------ DOCTOR SECTION ------");
                s1=1;
                while(s1==1){
                    System.out.print("1.Add New Entry\n2.View Existing Doctors\nEnter Choice: ");
                    c1=inp.nextInt();
                    switch(c1){
                        case 1: {
                            doc[count1].new_doctor();
                            count1++;break;}
                        case 2: {
                            System.out.println("Id\tName\t\tRoom\tTime\tSpecilist\tQualification");
                            for(int i=0;i<count1;i++){
                                doc[i].doctor_info();}
                            break;}
                    }
                    System.out.print("\nReturn Back Press 1 or Press 0 for Main Menu: ");
                    s1=inp.nextInt();
                }
                break;
            }
            case 2:{
                System.out.println("\t------ PATIENT SECTION ------");
                s2=1;
                while(s2==1){
                    System.out.print("1.Add New Entry\n2.Existing Patients\nEnter Choice: ");
                    c1=inp.nextInt();
                    switch(c1){
                        case 1: {
                            pat[count2].new_patient();
                            count2++;break;}
                        case 2: {
                            System.out.println("Id\tName\t\tAge\tGender\tDisease\t\tAdmit");
                            for(int i=0;i<count2;i++){
                                pat[i].patient_info();}
                            break;
                        }
                    }
                    System.out.print("\nReturn Back Press 1 or Press 0 for Main Menu: ");
                    s2=inp.nextInt();
                }
                break;
            }
            case 3:{
                System.out.println("\t------ MEDICINE SECTION ------");
                s3=1;
                while(s3==1){
                    System.out.print("1.Add New Entry\n2.Existing Medicines List\nEnter Choice: ");
                    c1=inp.nextInt();
                    switch(c1){
                        case 1: {
                            med[count2].new_medicine();
                            count3++;break;}
                        case 2: {
                            System.out.println("Name\t\t      ExpiryDate\tCost\tCompany");
                            for(int i=0;i<count3;i++){
                                med[i].medicine_list();}
                            break;
                        }
                    }
                    System.out.print("\nReturn Back Press 1 or Press 0 for Main Menu: ");
                    s3=inp.nextInt();
                }
                break;
            }
            case 4:{
                System.out.println("\t------ LABORATERIES SECTION ------");
                s4=1;
                while(s4==1){
                    System.out.print("1.Add New Entry\n2.Existing Labs\nEnter Choice: ");
                    c1=inp.nextInt();
                    switch(c1){
                        case 1: {
                            lab[count4].new_lab();
                            count4++;break;}
                        case 2: {
                            System.out.println("Laboratory\t\tCost");
                            for(int i=0;i<count4;i++){
                                lab[i].labs_list();}
                            break;
                        }
                    }
                    System.out.print("\nReturn Back Press 1 or Press 0 for Main Menu: ");
                    s4=inp.nextInt();
                }
                break;
            }
            case 5:{
                System.out.println("\t------ HOSPITAL FACILITIES ------");
                s5=1;
                while(s5==1){
                    System.out.print("1.Add New Entry\n2.Existing Facilities\nEnter Choice: ");
                    c1=inp.nextInt();
                    switch(c1){
                        case 1:{
                            fac[count5].add_facility();
                            count5++;break;}
                        case 2:{
                            System.out.println("Available Facilities");
                            for(int i=0;i<count5;i++){
                                fac[i].show_facility();}
                            break;
                        }
                    }
                    System.out.print("Return Back Press 1 or Press 0 for Main Menu: ");
                    s5=inp.nextInt();
                }
                break;
            }
            case 6:{
                System.out.println("\t------ STAFF SECTION ------");
                s6=1;
                while(s6==1){
                    System.out.print("1.Add New Entry\n2.Existing Staff\nEnter Choice: ");
                    c1=inp.nextInt();
                    switch(c1){
                        case 1:{
                            staff[count6].new_staff();
                            count6++;break;}
                        case 2:{
                            System.out.print("Id\t\tName    \t\tGender\t\tSalary");
                            for(int i=0;i<count6;i++){
                                staff[i].staff_info();}
                            break;
                        }
                    }
                    System.out.print("Return Back Press 1 or Press 0 for Main Menu: ");
                    s6=inp.nextInt();
                }
                break;
            }
            default:{
                System.out.println("Sorry Wrong Choice");}
        }
        System.out.print("\nPress 1 for MAIN MENU: ");
        status=inp.nextInt();
    }
    }
}