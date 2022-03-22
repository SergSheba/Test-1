package API;

import DTO.*;
import groovy.json.JsonException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.post;
import static org.testng.Assert.*;
import static io.restassured.RestAssured.get;

public class CheckTest {
    @Test
    public void getResponse() throws JsonException {
        Response response = get("https://reqres.in/api/users?page=2");
        UserDTO userDTO = new UserDTO();
        userDTO = response.as(UserDTO.class);
        assertNotNull(userDTO.getData());
        assertNotNull(userDTO.getSupport());
        assertNotNull(userDTO.getData());
        assertNotNull(userDTO.getPage());
        assertNotNull(userDTO.getPer_page());
        assertNotNull(userDTO.getTotal());
        assertNotNull(userDTO.getTotal_pages());
        userDTO.getData().forEach(s -> assertNotNull(s));
        assertNotNull(userDTO.getData().get(0));
        assertNotNull(userDTO.getSupport().getText());
        assertNotNull(userDTO.getSupport().getUrl());
    }

    @Test
    public void getPostResponse() {
        String name = "morpheus";
        String job = "leader";
        Request request = new Request();
        request.setJob("leader");
        request.setName("morpheus");
        Response response = null;

        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(request)
                    .post("https://reqres.in/api/users");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Register register = response.as(Register.class);
        assertEquals(name, register.getName(), "Имена не совпадают");
        assertEquals(job, register.getJob(), "Работа не совпадает");
        assertNotNull(register.getId(), "Id не совпадает");
        assertNotNull(register.getCreatedAt(), "Дата не совпадает");

    }
}

