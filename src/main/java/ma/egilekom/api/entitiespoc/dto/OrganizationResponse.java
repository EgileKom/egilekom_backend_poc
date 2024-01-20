package ma.egilekom.api.entitiespoc.dto;

import lombok.NoArgsConstructor;


public record OrganizationResponse(
        Long id ,
        String name,
        String description,
        String avatar,
        String website,
        String email,
        String phone,
        String address
) {

    public OrganizationResponse() {
        this(null,null,null,null,null,null,null,null);
    }

    
}
