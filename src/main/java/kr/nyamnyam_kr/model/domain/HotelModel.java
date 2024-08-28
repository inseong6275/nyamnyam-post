package kr.nyamnyam_kr.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class HotelModel {
    public long id;
    public String name;
    public String address;
    public Date startEntry;
    public Date endEntry;
    public boolean booked;
    public double price;
    public long sellerId;
    public String content;
    public String shortContent;
    public long roomNumber;
    public long roomType;
    public long roomMember;
    public String nickname;
}
