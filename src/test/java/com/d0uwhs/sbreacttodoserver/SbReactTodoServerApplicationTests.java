package com.d0uwhs.sbreacttodoserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SbReactTodoServerApplicationTests {

    @Test
    void contextLoads(WebApplicationContext webApplicationContext) {
        assertThat(webApplicationContext).isNotNull();
    }
}
