package com.serialization.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationANdDeserializationExample implements Serializable {
	
private static final long serialVersionUID = 1L;

	//	 A marker interface with no methods that tells the JVM that the class can be serialized.
	public static void main(String[] args) {
		SerializationDemo example = new SerializationDemo("Alice", 30);

//        String filePath = "com/serialization/deserialization/example.ser";
//        new File(filePath).getParentFile().mkdirs();

		// Serialization
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("exampleFile.ser"))) {
			oos.writeObject(example);   // This converts 'object' to a byte stream.
            System.out.println("Serialization successful: " + example);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialization
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("exampleFile.ser"))) {
			SerializationDemo deserializedExample = (SerializationDemo) ois.readObject();//this convert bytestream to object again
            System.out.println("Deserialization successful: " + deserializedExample);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class SerializationDemo implements Serializable {
    private static final long serialVersionUID = 1L; // For version control during serialization

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	public SerializationDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
    public String toString() {
        return "Example{name='" + name + "', age=" + age + "}";
    }
	// Getters and toString() method
}
