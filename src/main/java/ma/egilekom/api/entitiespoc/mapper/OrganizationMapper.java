package ma.egilekom.api.entitiespoc.mapper;

import ma.egilekom.api.entitiespoc.dto.OrganizationRequest;
import ma.egilekom.api.entitiespoc.dto.OrganizationResponse;
import ma.egilekom.api.entitiespoc.entity.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationMapper {
    OrganizationMapper INSTANCE = Mappers.getMapper(OrganizationMapper.class);

     Organization toEntity(OrganizationRequest organizationRequest);

    OrganizationRequest toRequest(Organization organization);

    OrganizationResponse toResponse(Organization organization);

}
