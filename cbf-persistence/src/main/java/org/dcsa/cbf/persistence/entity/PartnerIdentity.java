package org.dcsa.cbf.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "partner_identity")
public class PartnerIdentity {

  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "code_list_provider", length = 35)
  private String codeListProvider;

  @Column(name = "code", length = 35)
  private String code;

  @Column(name = "agreement_type_code", length = 35)
  private String agreementTypeCode;

}
