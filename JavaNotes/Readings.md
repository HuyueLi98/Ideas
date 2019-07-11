## Three kinds of exceptions
### Checked Exceptions
The first kind of exception is the checked exception. These are exceptional conditions that a well-written application should anticipate and recover from. For example, suppose an application prompts a user for an input file name, then opens the file by passing the name to the constructor for java.io.FileReader. Normally, the user provides the name of an existing, readable file, so the construction of the FileReader object succeeds, and the execution of the application proceeds normally. But sometimes the user supplies the name of a nonexistent file, and the constructor throws java.io.FileNotFoundException. A well-written program will catch this exception and notify the user of the mistake, possibly prompting for a corrected file name.

### Errors
The second kind of exception is the error. These are exceptional conditions that are external to the application, and that the application usually cannot anticipate or recover from. For example, suppose that an application successfully opens a file for input, but is unable to read the file because of a hardware or system malfunction. The unsuccessful read will throw java.io.IOError. An application might choose to catch this exception, in order to notify the user of the problem — but it also might make sense for the program to print a stack trace and exit.

### Runtime Exceptions
The third kind of exception is the runtime exception. These are exceptional conditions that are internal to the application, and that the application usually cannot anticipate or recover from. These usually indicate programming bugs, such as logic errors or improper use of an API. For example, consider the application described previously that passes a file name to the constructor for FileReader. If a logic error causes a null to be passed to the constructor, the constructor will throw NullPointerException. The application can catch this exception, but it probably makes more sense to eliminate the bug that caused the exception to occur.

## How to create a file and write into it

### Write with BufferedWriter
BufferedWriter writer=new BufferedWriter(new FileWriter(fileName)

### write with PrintWriter
PrintWriter printWriter = new PrintWriter(fileWriter);
Notice that it will not only write the contexts into a file, but also show them on Console. As far as I know, it is one of the most characteristic feature of PrintWriter. 

### Write with FileOutputStream
FileOutputStream outputStream = new FileOutputStream(fileName);
Use FileOutputStream to write binary data to a file.
### Write with DataOutputSteam
    String value = "Hello";
    FileOutputStream fos = new FileOutputStream(fileName);
    DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));
    outStream.writeUTF(value);
    outStream.close();
 
    // verify the results
    String result;
    FileInputStream fis = new FileInputStream(fileName);
    DataInputStream reader = new DataInputStream(fis);
    result = reader.readUTF();
    reader.close();
  
# Problems that I met
## JDBC Problem
### using preparedstatement
            String sql = "select * from user2 where id = ? ";
            PreparedStatement ps =con.prepareStatement(sql);

            ps.setInt(1,1);

            ps.execute();
the code above is ok. But when writing "sql" into ps.execute(), an SQLSyntaxErrorException will occur. This is because the execute method reads in sql as a whole but ignored the "?".
