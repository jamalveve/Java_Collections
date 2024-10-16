package com.serialization.deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) {

		// uisng Jackson libaray

		try {
//			 Create an ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();
//
			// Deserialize JSON string to Java object
			String jsonString = "{ \"name\" : \"Sam\", \"age\" : 20 }";
//
			Person person = objectMapper.readValue(jsonString, Person.class);
			System.out.println("Deserialized Person:");
			System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
//
			// Serialize Java object to JSON string
			String serializedJson = objectMapper.writeValueAsString(person);
			System.out.println("Serialized JSON: " + serializedJson);

			/// or
//            JsonNode jsonNode = objectMapper.readTree(new File("data.json"));
//            String names = jsonNode.get("name").asText();
//            int ages = jsonNode.get("age").asInt();
//            System.out.println("Name: " + names);
//            System.out.println("Age: " + ages);

//			using gson library

			Gson gson = new Gson();

			// Serialization
			Person person2 = new Person("Alice", 5);
			String jsonString2 = gson.toJson(person2);
			System.out.println("JSON: " + jsonString2);

			// Deserialization
			Person deserializedPerson = gson.fromJson(jsonString2, Person.class);
			System.out.println("Name: " + deserializedPerson.getName() + ", Age: " + deserializedPerson.getAge());

		} catch (Exception e) {
			e.printStackTrace();
		}

		UsecaseExample usecaseExample = new UsecaseExample();
		usecaseExample.method1();

	}
}
