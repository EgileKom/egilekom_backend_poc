package ma.egilekom.api.entitiespoc.service;

import ma.egilekom.api.entitiespoc.dto.OrganizationRequest;
import ma.egilekom.api.entitiespoc.dto.OrganizationResponse;

public interface OrganizationService {

    public OrganizationResponse save(OrganizationRequest organizationRequest);
    public OrganizationResponse update(OrganizationRequest organizationRequest);
    public OrganizationResponse patch(OrganizationRequest organizationRequest);
    public OrganizationResponse delete(Long id);
    public OrganizationResponse findById(Long id);

}
