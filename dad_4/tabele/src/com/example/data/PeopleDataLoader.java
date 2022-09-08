package com.example.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class PeopleDataLoader {

    public static Object[][] load() {
        try {
            /*String file_path = PeopleDataLoader.class.getResource("people.json").getFile();
            file_path = file_path.substring(1);*/
            String file_path = System.getenv("JAVA_RESOURCES") + "/dad4_people.json";
            Path physical_path = Path.of(file_path);
            String file_text = Files.readString(physical_path);
            Gson gson = new Gson();
            Person[] people = gson.fromJson(file_text, Person[].class);

            Object[][] table_data = new Object[people.length][3];
            for(int i = 0; i < table_data.length; i++) {
                table_data[i] = people[i].to_table_row();
            }
            return table_data;
        } catch (Exception ex) { ex.printStackTrace(); }
        return new Object[][]{};
    }

    public static ArrayList<Person> get_people() {
        try {
            /*String file_path = PeopleDataLoader.class.getResource("people.json").getFile();
            file_path = file_path.substring(1);*/
            String file_path = System.getenv("JAVA_RESOURCES") + "/dad4_people.json";
            Path physical_path = Path.of(file_path);
            String file_text = Files.readString(physical_path);
            Gson gson = new Gson();
            Type person_type = new TypeToken<ArrayList<Person>>(){}.getType();
            return gson.fromJson(file_text, person_type);
        } catch (Exception ex) { ex.printStackTrace(); }
        return new ArrayList<>();
    }

    public static Person get_for_id(int person_id) {
        try {
            String file_path = PeopleDataLoader.class.getResource("people.json").getFile();
            file_path = file_path.substring(1);
            Path physical_path = Path.of(file_path);
            String file_text = Files.readString(physical_path);
            Gson gson = new Gson();
            Person[] people = gson.fromJson(file_text, Person[].class);

            Person p = null;
            for(Person tmp_p : people) {
                if(tmp_p.getId() == person_id) {
                    p = tmp_p;
                    break;
                }
            }
            return p;

        } catch (Exception ex) { ex.printStackTrace(); }
        return null;
    }
}
