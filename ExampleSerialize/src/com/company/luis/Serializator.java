package com.company.luis;

import java.io.*;

/**
 * Created by luis on 2/5/2016.
 * Purpose :
 */
public class Serializator {

    public void Serialize(People people, String pathFile)
    {
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream(pathFile);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(people);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + pathFile);
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

    public People Deserialize(String filePath)
    {
        People people = null;
        try
        {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            people = (People) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return people;
        }catch(ClassNotFoundException c)
        {
            System.out.println("People class not found");
            c.printStackTrace();
            return people;
        }

        return people;
    }
}
