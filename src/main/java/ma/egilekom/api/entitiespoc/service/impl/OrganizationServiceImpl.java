package ma.egilekom.api.entitiespoc.service.impl;

import lombok.extern.slf4j.Slf4j;
import ma.egilekom.api.entitiespoc.dto.OrganizationRequest;
import ma.egilekom.api.entitiespoc.dto.OrganizationResponse;
import ma.egilekom.api.entitiespoc.entity.Organization;
import ma.egilekom.api.entitiespoc.mapper.OrganizationMapper;
import ma.egilekom.api.entitiespoc.repository.OrganizationRepository;
import ma.egilekom.api.entitiespoc.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationRepository organizationRepository;
    private final OrganizationMapper organizationMapper;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
        this.organizationMapper = OrganizationMapper.INSTANCE;
    }

    @Override
    public OrganizationResponse save(OrganizationRequest organizationRequest) {
        Organization organization = OrganizationMapper.INSTANCE.toEntity(organizationRequest);
//        Organization organization = this.organizationMapper.toEntity(organizationRequest);

        log.info("mapping ->" + organization.toString());

        return this.organizationMapper.
                toResponse(this.organizationRepository.
                        save(this.organizationMapper.
                                toEntity(organizationRequest)
                        )
                );


    }

    @Override
    public OrganizationResponse update(OrganizationRequest organizationRequest) {
        return null;
    }

    @Override
    public OrganizationResponse patch(OrganizationRequest organizationRequest) {
        return null;
    }

    @Override
    public OrganizationResponse delete(Long id) {
        return null;
    }

    @Override
    public OrganizationResponse findById(Long id) {
        return null;
    }
}
