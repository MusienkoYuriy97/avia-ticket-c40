package by.tms.aviaticket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private long id;
    private User user;
    private List<Ticket> orderList;
    private LocalDateTime orderDate;
    private Status status;
}
