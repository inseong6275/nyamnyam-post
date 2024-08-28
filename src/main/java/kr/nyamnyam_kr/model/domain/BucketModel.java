package kr.nyamnyam_kr.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class BucketModel {
        private long id;
        private long customerID;
        private boolean payment;
        private long hotelId;
        private String hotelName;
        private Date startEntry;
        private Date endEntry;
        private Double price;
        private boolean booked;
}
