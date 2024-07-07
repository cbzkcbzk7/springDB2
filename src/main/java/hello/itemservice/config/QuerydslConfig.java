package hello.itemservice.config;

import hello.itemservice.repository.ItemRepository;
import hello.itemservice.repository.jpa.JpaItemRepositoryV3;
import hello.itemservice.service.ItemService;
import hello.itemservice.service.ItemServiceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * packageName    : hello.itemservice.config
 * fileName       : MyBatisConfig
 * author         : Sora
 * date           : 2024-06-13
 * description    : MyBatis Config - MyBatis 모듈이 베이터 베이스 연결 해줌 (DataSource 주입 필요 X)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-13        Sora       최초 생성
 */
@Configuration
@RequiredArgsConstructor
public class QuerydslConfig {

    private final EntityManager em;


    @Bean
   public ItemService itemService(){
       return new ItemServiceV1(itemRepository());
   }

   @Bean
    public ItemRepository itemRepository(){
       return new JpaItemRepositoryV3(em);
   }
}
