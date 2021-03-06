package org.openmbee.sdvc.rdb.repositories;

import java.util.Optional;
import org.openmbee.sdvc.data.domains.global.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    Optional<Organization> findByOrganizationId(String id);

    Optional<Organization> findByOrganizationName(String name);

}
