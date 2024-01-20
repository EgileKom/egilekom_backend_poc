package ma.egilekom.api.entitiespoc;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import ma.egilekom.api.entitiespoc.entity.Organization;
import ma.egilekom.api.entitiespoc.repository.OrganizationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Locale;

@Configuration
public class BootstrapEntity {

    private final OrganizationRepository organizationRepository;
    private final FakeValuesService fakeValuesService;
    private final Faker faker;

    public BootstrapEntity(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
        this.fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
        this.faker = new Faker();
    }

//    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            saveAllOrganization();
        };
    }

    private void saveAllOrganization() {

        for (int j = 0; j < 10; j++) {
            Organization organization1 = new Organization();
            organization1.setAddress(faker.address().fullAddress());
            organization1.setName(faker.company().name());
            organization1.setDescription(faker.company().catchPhrase());
            organization1.setAvatar(faker.internet().image());
            organization1.setEmail(faker.internet().emailAddress());
            organization1.setPhone(faker.phoneNumber().phoneNumber());
            organization1.setWebsite(faker.internet().url());
            organizationRepository.save(organization1);
        }


    }


}
