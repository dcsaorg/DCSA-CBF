package org.dcsa.tnt.persistence.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dcsa.tnt.persistence.entity.EventSubscription.EventSubscriptionEnumSetItem;
import org.dcsa.tnt.persistence.entity.enums.EventType;
import org.dcsa.tnt.persistence.entity.enums.ShipmentEventTypeCode;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Setter(AccessLevel.PRIVATE)
@Entity
@Table(name = "event_subscription_shipment_event_type_code")
public class EventSubscriptionShipmentEventTypeCode implements EventSubscriptionEnumSetItem<ShipmentEventTypeCode> {
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  @Setter(AccessLevel.PRIVATE)
  public static class EventSubscriptionShipmentEventTypeCodePk implements Serializable {
    @Column(name = "subscription_id", nullable = false)
    private UUID subscriptionID;

    @Enumerated(EnumType.STRING)
    @Column(name = "shipment_event_type_code", nullable = false)
    private ShipmentEventTypeCode shipmentEventTypeCode;
  }

  @EmbeddedId
  private EventSubscriptionShipmentEventTypeCodePk pk;

  public EventSubscriptionShipmentEventTypeCode(UUID subscriptionId, ShipmentEventTypeCode code) {
    pk = new EventSubscriptionShipmentEventTypeCodePk(subscriptionId, code);
  }

  @Transient
  public ShipmentEventTypeCode getValue() {
    return pk.shipmentEventTypeCode;
  }
}
