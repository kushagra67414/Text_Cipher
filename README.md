# Text_Cipher


### To implement this we considered a scenario in which a **Admin** take the **Student Details** and stored the details into their system in Encrypted form. <br />
1. Prerequisite to run this Complete JAVA Project:<br />
   **a.** The demonstration shown below is on "Windows 10". <br />
   **b.** To provide the support of GUI (Graphical User Interface), here I used **Java Servlet** in **Eclipse IDE**. <br />
   **c.** Using **JDK version 11** and **Tomcat version 8.5** to implement the Java Servlet/JSP to provides a web server environment in which Java code can run. <br />
   **d.** Here we used AES (Advanced Encryption Standard) for encryption, AES algorithm is a symmetrical block cipher algorithm that takes the plain text in blocks of 128 bits and converts them to ciphertext using keys of 128, 192, and 256 bits (we used key length of 16 bytes which is 128 bits for Encryption). <br />
   [Tomcat download](https://tomcat.apache.org/download-80.cgi)
    
   **Note:** The directory or file structure is used according to the windows, you can change it according to your system within the source code.
   
2. First we have to create a **Servlet Project** (You also Create a Simple Java project which have all the dependencies or jar according to **Servlet**) and Follow the folder or file structure as shown below:

![image](https://user-images.githubusercontent.com/46487696/118122077-f7cf5000-b40f-11eb-87d2-fe26da9b42ec.png)

 **Note:** You will find all the files such as *"AES.java"*, *"Login.java"*, *"New_Entry.java"*, *"EnterDetails.html"*, *"Login_page.html"*, and *"OutPut.jsp"* within this repositry having the same folder and file structure as mentioned in the above image.<br/>

3. Now run the *"Login_page.html"* file on the server (Make Sure that your **Tomcat Server** is in running state at localhost), as shown below:

![image](https://user-images.githubusercontent.com/46487696/118122704-d7ec5c00-b410-11eb-8d45-df9a089a0373.png)
![image](https://user-images.githubusercontent.com/46487696/118122711-d9b61f80-b410-11eb-8149-a5a818de2e3b.png)
![image](https://user-images.githubusercontent.com/46487696/118122667-cb680380-b410-11eb-8a49-7d4c5a9d2e87.png)
![image](https://user-images.githubusercontent.com/46487696/118122694-d3c03e80-b410-11eb-8b40-3fab978b5c25.png)

You can enter anything in **User Name** and **Password** field because its not set for a particular user:

![image](https://user-images.githubusercontent.com/46487696/118122755-e9356880-b410-11eb-9ad4-93d5bd67faa3.png)
   

4. Now, you will redirect to the **Enter Details** page, where you have to enter all the required information and click on the **Submit** button, as shown below:

![image](https://user-images.githubusercontent.com/46487696/118122922-2a2d7d00-b411-11eb-9a1e-b0fa2bf3157f.png)


5. Here you will see that the encrypted details are shown via *"Output.jsp"* file in the end of the program, as shown below:

![image](https://user-images.githubusercontent.com/46487696/118122976-36193f00-b411-11eb-9b02-fe4425d6af7f.png)

Here is the **console** output shows that the file of the User is created and contains all the information in encrypted form (in white highlighted text):

**Note:** If the file is already exist then it will show a message *"File already exists."*
    
![image](https://user-images.githubusercontent.com/46487696/118123003-3e717a00-b411-11eb-8e0c-bca7e3324503.png)

    
6. Then created file is stored in the directory which mentioned in *"New_Entry.java"* and naming structure of the file is *"FName + "_" + LName + ".txt"*, as shown below:

    Here you can also see the content of the file which are in encrypted form:

![image](https://user-images.githubusercontent.com/46487696/118123047-4d582c80-b411-11eb-92b6-997870fd2367.png)

