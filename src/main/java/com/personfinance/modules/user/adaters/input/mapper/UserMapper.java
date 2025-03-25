package com.personfinance.modules.user.adaters.input.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.personfinance.modules.user.adaters.input.model.User;
import com.personfinance.modules.user.core.domain.entity.UserEntity;


@Mapper(componentModel = "spring")
public interface UserMapper {
    
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    User toDomain(UserEntity entity);
    
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "password", source = "password")
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    UserEntity toEntity(User domain);
}