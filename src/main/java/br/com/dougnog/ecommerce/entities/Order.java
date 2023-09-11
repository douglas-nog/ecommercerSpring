package br.com.dougnog.ecommerce.entities;

import br.com.dougnog.ecommerce.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonIgnore
    private User client;

//    public OrderStatus getOrderStatus() {
//        return OrderStatus.valueOf(orderStatus);
//    }
//
//    public void setOrderStatus(OrderStatus orderStatus) {
//        if (orderStatus != null){
//            this.orderStatus = orderStatus.getCode();
//        }
//    }
}
