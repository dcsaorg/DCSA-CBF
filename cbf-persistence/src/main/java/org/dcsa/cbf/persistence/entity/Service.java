package org.dcsa.cbf.persistence.entity;

import jakarta.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service")
public class Service {
  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "carrier_service_code", length = 11)
  private String carrierServiceCode;

  @Column(name = "carrier_service_name", length = 50)
  private String carrierServiceName;

  @Column(name = "universal_service_reference", length = 8)
  private String universalServiceReference;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "partner_identity_id")
  private PartnerIdentity partnerIdentity;

  @ToString.Exclude
  @EqualsAndHashCode.Exclude
  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
    name = "vessel_booking",
    joinColumns = @JoinColumn(name = "service_id"),
    inverseJoinColumns = @JoinColumn(name = "vessel_id"))
  private Set<Vessel> vessels = new LinkedHashSet<>();
}