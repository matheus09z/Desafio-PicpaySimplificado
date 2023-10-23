package com.picpaysimplificado.domain.transaction;


import com.picpaysimplificado.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "Transactions")
@Table(name= "Transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of= "id")
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name="sender_id")
    private User sender;
    @ManyToOne
    @JoinColumn(name="receiver_id")
    private User receiver;

    private LocalDateTime timestamp;

}
