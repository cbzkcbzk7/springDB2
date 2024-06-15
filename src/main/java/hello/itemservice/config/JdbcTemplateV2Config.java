package hello.itemservice.config;

import hello.itemservice.repository.ItemRepository;
import hello.itemservice.repository.jdbctemplate.JdbcTemplateItemRepositoryV1;
import hello.itemservice.repository.jdbctemplate.JdbcTemplateItemRepositoryV2;
import hello.itemservice.service.ItemService;
import hello.itemservice.service.ItemServiceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * packageName    : hello.itemservice.config
 * fileName       : JdbcTemplateV1Config
 * author         : Sora
 * date           : 2024-06-14
 * description    : jdbc 등록
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-14        Sora       최초 생성
 */
@Configuration
@RequiredArgsConstructor
public class JdbcTemplateV2Config {

    private final DataSource dataSource;

    @Bean
    public ItemService itemService() {

        return new ItemServiceV1(itemRepository());
    }

    @Bean
    public ItemRepository itemRepository() {

        return new JdbcTemplateItemRepositoryV2(dataSource);
    }

}
