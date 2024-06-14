package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

/**
 * packageName    : hello.itemservice.repository.mybatis
 * fileName       : ItemMapper
 * author         : Sora
 * date           : 2024-06-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-12        Sora       최초 생성
 */
@Mapper
public interface ItemMapper {

    void save(Item item);
    void update(@Param("id") Long id, @Param("updateParam")ItemUpdateDto updateParam);
    Optional<Item> findById(Long id);
    List<Item> findAll(ItemSearchCond itemSearch);

}
