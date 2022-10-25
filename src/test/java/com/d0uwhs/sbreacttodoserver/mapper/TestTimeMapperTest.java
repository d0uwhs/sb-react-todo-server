package com.d0uwhs.sbreacttodoserver.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


/**
 * TODO : @RunWith(SpringRunner.class) = JUnit4,
 * @SpringBootTest를 하용하지 않는 이유는?
 * --
 * @SpringBootTest는 @Component 어노테이션이 붙은 클래스를 사용해야 하는 경우에 활용하자.
 * @DataJpaTest는 위의 경우가 아닐 때 고려해보자. 👉 ApplicationContext에 @Component 빈들을 등록하지 않아 테스트 실행 속도가 빨라진다.
 *
 * @ExtendWith(SpringExtension.class) 를 안붙혀도 되는데?
 */

@Slf4j
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestTimeMapperTest {

    @Autowired
    private TestTimeMapper testTimeMapper;

    @Test
    @DisplayName(value = "Mapper 테스트")
    void getTime() {
        String getTime = testTimeMapper.getTime();
        assertThat(getTime).isNotNull();

    }
}
