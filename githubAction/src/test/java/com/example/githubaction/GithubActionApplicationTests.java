package com.example.githubaction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.jayway.jsonpath.internal.path.PathCompiler.fail;

@SpringBootTest
class GithubActionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test2() {
        System.out.println("성공했어요!");
    }

}
