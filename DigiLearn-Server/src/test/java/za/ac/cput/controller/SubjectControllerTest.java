package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.entity.Subject;
import za.ac.cput.factory.SubjectFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SubjectControllerTest {

    private static
    Subject subject = SubjectFactory.createSubject("App Dev","45");
     public static String SECURITY_USERNAME = "user";
    public static String SECURITY_PASSWORD = "USER123";

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:3306/subject";

    @org.junit.jupiter.api.Test
    void create() {
        String url = baseURL+"/create";
        ResponseEntity<Subject> postResponse = restTemplate.postForEntity(url,subject,Subject.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(postResponse.getStatusCode(), HttpStatus.OK);
        subject = postResponse.getBody();
        System.out.println("Created Subject: "+subject);
        assertEquals(subject.getSubjectId(),postResponse.getBody().getSubjectId());
    }

    @org.junit.jupiter.api.Test
    void read() {
        String url = baseURL + "/read" +subject.getSubjectId();
        System.out.println("url: "+url);
        ResponseEntity<Subject> response = restTemplate.getForEntity(url,Subject.class);
        assertEquals(subject.getSubjectId(),response.getBody().getSubjectId());
    }

    @org.junit.jupiter.api.Test
    void update() {

        Subject updated = new Subject.Builder().copy(subject).setSubjectName("Business Man").setSubjectCredits("60").build();
        String url = baseURL + "/update";
        System.out.println("url: "+url);
        System.out.println("Subject updated: "+updated);
        ResponseEntity<Subject> response =restTemplate.postForEntity(url,updated,Subject.class);
        assertNotNull(response.getBody());
    }

    @org.junit.jupiter.api.Test
    void delete() {
        String url = baseURL + "/delete" +subject.getSubjectId();
        System.out.println("URL:"+url);
        restTemplate.delete(url);
    }
    @org.junit.jupiter.api.Test
    void getAll(){
        String url = baseURL + "/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET,entity,String.class);

        System.out.println("SHow All: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}