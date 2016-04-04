package com.dwuthk.practice.ehcache.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HK
 */
@Repository
public interface CharacterMapper {

    List<com.dwuthk.practice.ehcache.model.Character> findAll();

    com.dwuthk.practice.ehcache.model.Character findById(Long id);

}
