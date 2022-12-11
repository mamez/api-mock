package com.api.mock.map;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.api.mock.dto.ApiDto;
import com.api.mock.entity.Api;

@Mapper(
	    componentModel = "cdi",
	    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ApiMapper {
	
	@Mapping(source = "auditDate", target = "auditDate", dateFormat = "dd/MM/yyyy")
	ApiDto toDto(Api api);
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "workSpace", ignore = true)
	@Mapping(target = "state", ignore = true)
	@Mapping(target = "auditDate", dateFormat = "dd/MM/yyyy")
	Api toEntity(ApiDto apiDto);
	
	@Mapping(target = "id", ignore = true)
	void merge(@MappingTarget Api target, Api source );

}
