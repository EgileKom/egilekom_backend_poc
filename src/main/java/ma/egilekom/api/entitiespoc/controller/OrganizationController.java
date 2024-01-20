package ma.egilekom.api.entitiespoc.controller;


import ma.egilekom.api.entitiespoc.dto.OrganizationRequest;
import ma.egilekom.api.entitiespoc.dto.OrganizationResponse;
import ma.egilekom.api.entitiespoc.service.OrganizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/organizations")
public class OrganizationController {
    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrganizationResponse> getOrganizationById(@PathVariable String id ){
        return ResponseEntity.ok(new OrganizationResponse());
    }

    @PostMapping()
    public ResponseEntity<OrganizationResponse> createOrganization(@RequestBody @Validated  OrganizationRequest organizationRequest){
        //: 20-01-2024 save organization
        return ResponseEntity.ok(this.organizationService.save(organizationRequest));

    }

    @PutMapping("/{id}")
    public ResponseEntity<OrganizationResponse> updateOrganization(@PathVariable String id, @RequestBody OrganizationRequest organizationResponse){
        //TODO:  20-01-2024  update organization
        return ResponseEntity.ok(new OrganizationResponse());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrganizationResponse> deleteOrganization(@PathVariable String id){
        //TODO:  20-01-2024  delete organization
        return ResponseEntity.ok(new OrganizationResponse());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<OrganizationResponse> patchOrganization(@PathVariable String id, @RequestBody OrganizationRequest organizationResponse){
        //TODO: 20-01-2024  patch organization
        return ResponseEntity.ok(new OrganizationResponse());
    }

}
